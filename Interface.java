import java.util.InputMismatchException;
import Animals.*;

public interface Interface {

    static String[] animals = { "кошка", "собака", "хомяк", "лошадь", "осел", "верблюд" };

    static int chooseAnimal() {

        while (true) {
            System.out.println("Выберете животное: ");
            for (int i = 0; i < animals.length; i++)
                System.out.printf("  %s - %d\n", animals[i], i + 1);

            System.out.print(">>> ");
            int typeAnimal;
            try {
                typeAnimal = Main.scan.nextInt();
                Main.scan.nextLine();
                if (typeAnimal > 0 && typeAnimal <= animals.length)
                    return typeAnimal;
                else
                    return 0;
            } catch (InputMismatchException e) {
                System.out.println(Main.errorMessage);
                Main.scan.nextLine();
            }
        }
    }

    static void addAnimal() {
        int typeAnimal = chooseAnimal();
        if (typeAnimal != 0) {
            String[] newAnimal = new String[2];
            inputData(newAnimal);
            String name = newAnimal[0];
            int age = Integer.parseInt(newAnimal[1]);

            switch (typeAnimal) {
                case 1:
                    Main.nursery.add(new Cat(name, age));
                    break;
                case 2:
                    Main.nursery.add(new Dog(name, age));
                    break;
                case 3:
                    Main.nursery.add(new Hamster(name, age));
                    break;
                case 4:
                    Main.nursery.add(new Horse(name, age));
                    break;
                case 5:
                    Main.nursery.add(new Donkey(name, age));
                    break;
                case 6:
                    Main.nursery.add(new Camel(name, age));
                    break;
                default:
                    break;
            }
            Count.add();

        } else {
            System.out.println(Main.errorMessage);
        }
    }

    static void inputData(String[] newAnimal) {

        while (true) {
            System.out.print("Введите кличку животного: ");
            String name = Main.scan.nextLine();

            System.out.print("Введите возраст животного: ");
            String age = Main.scan.nextLine();

            try {
                Integer.parseInt(age);
                newAnimal[0] = name;
                newAnimal[1] = age;
                break;
            } catch (NumberFormatException e) {
                System.out.println(Main.errorMessage);
            }
        }
    }

    static void showCommands() {
        int typeAnimal = chooseAnimal();
        if (typeAnimal != 0) {
            switch (typeAnimal) {
                case 1:
                    System.out.println(Cat.getType() + " выполняет команды:");
                    Cat.getCommands();
                    break;
                case 2:
                    System.out.println(Dog.getType() + " выполняет команды:");
                    Dog.getCommands();
                    break;
                case 3:
                    System.out.println(Hamster.getType() + " выполняет команды:");
                    Hamster.getCommands();
                    break;
                case 4:
                    System.out.println(Horse.getType() + " выполняет команды:");
                    Horse.getCommands();
                    break;
                case 5:
                    System.out.println(Donkey.getType() + " выполняет команды:");
                    Donkey.getCommands();
                    break;
                case 6:
                    System.out.println(Camel.getType() + " выполняет команды:");
                    Camel.getCommands();
                    break;
                default:
                    break;
            }
        } else {
            System.out.println(Main.errorMessage);
        }
    }

    public static void learnCommand() {
        int typeAnimal = chooseAnimal();
        if (typeAnimal != 0) {
            System.out.print("Введите новую команду: ");
            String newCommand = Main.scan.nextLine();

            switch (typeAnimal) {
                case 1:
                    Cat.addCommand(newCommand);
                    break;
                case 2:
                    Dog.addCommand(newCommand);
                    break;
                case 3:
                    Hamster.addCommand(newCommand);
                    break;
                case 4:
                    Horse.addCommand(newCommand);
                    break;
                case 5:
                    Donkey.addCommand(newCommand);
                    break;
                case 6:
                    Camel.addCommand(newCommand);
                    break;
                default:
                    break;
            }
        } else {
            System.out.println(Main.errorMessage);
        }
    }
}
