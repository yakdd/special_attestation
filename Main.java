import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main implements Interface {

    static ArrayList<ClassAnimal> nursery = new ArrayList<>();
    static String[] petsAnimals = { "кошка", "собака", "хомяк" };
    static String[] packAnimals = { "лошадь", "осел", "верблюд" };
    static String[] animals = { "кошка", "собака", "хомяк", "лошадь", "осел", "верблюд" };
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Система учета для питомника вьючных и дашних животных".toUpperCase());
        start();
    }

    static void start() {
        while (true) {
            int animal;
            System.out.print(
                    "Выберете действие:\n  Завести новое животное - 1\n  Увидеть список команд, выполняемых животным - 2\n  Обучить животное новой команде - 3\n>>> ");
            try {
                animal = scan.nextInt();
                switch (animal) {
                    case 1:
                        Interface.addAnimal();
                        break;
                    case 2:
                        Interface.showCommands();
                        break;
                    case 3:
                        Interface.learnCommand();
                        break;

                    default:
                        System.out.println("Ошибка ввода. Попробуйте еще раз!".toUpperCase());
                        start();
                        break;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка ввода. Попробуйте еще раз!".toUpperCase());
                scan.nextLine();
            }
        }
    }
}