import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Animals.*;

public class Main implements Interface {

    static ArrayList<ClassAnimal> nursery = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static String errorMessage = "Ошибка ввода. Попробуйте еще раз!";

    public static void main(String[] args) {
        System.out.println("Система учета для питомника вьючных и дашних животных".toUpperCase());

        while (true) {
            System.out.print("Продолжить (y/n)?: ");
            String answer = scan.nextLine();
            if (answer.equals("y"))
                start();
            else if (answer.equals("n"))
                break;
            else
                System.out.println(errorMessage);
        }

        printNursery(nursery);
        System.out.println("count: " + Count.getCount());
        scan.close();
    }

    static void start() {
        while (true) {
            int animal;
            System.out.print(
                    "Выберете действие:\n  Завести новое животное - 1\n  Увидеть список команд, выполняемых животным - 2\n  Обучить животное новой команде - 3\n>>> ");
            try {
                animal = scan.nextInt();
                scan.nextLine();
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
                        System.out.println(errorMessage);
                        start();
                        break;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println(errorMessage);
                scan.nextLine();
            }
        }
    }

    static void printNursery(ArrayList<ClassAnimal> nursery) {
        System.out.println("Сейчас в питомнике живут:");
        for (ClassAnimal animal : nursery) {
            System.out.println(animal);
        }
    }

}