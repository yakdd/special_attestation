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
            System.out.print("Продолжить работу в программе? (y/n): ");
            String answer = scan.nextLine();
            if (answer.equals("y"))
                start();
            else if (answer.equals("n"))
                break;
            else
                System.out.println(errorMessage);
        }

        scan.close();
    }

    static void start() {
        while (true) {
            int animal;
            System.out.println("Выберете действие:");
            System.out.println(" 0 - вывести список животных питомника");
            System.out.println(" 1 - добавить новое животное");
            System.out.println(" 2 - увидеть список команд, выполняемых животным");
            System.out.println(" 3 - обучить животное новой команде");
            System.out.print(">>>  ");

            try {
                animal = scan.nextInt();
                scan.nextLine();
                switch (animal) {
                    case 0:
                        printNursery(nursery);
                        System.out.println("Количество животных в питомнике: " + Count.getCount());
                        break;
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