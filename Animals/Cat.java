package Animals;

import java.util.ArrayList;
import java.util.Arrays;

public class Cat extends ClassPetsAnimal {

    protected static String type = "Кошка";
    protected static ArrayList<String> commands = new ArrayList<>(Arrays.asList("мяукнуть", "дать себя погладить"));

    public Cat(String name, int age) {
        super(type, name, age);
    }

    public static String getType() {
        return type;
    }

    public static void getCommands() {
        if (commands.size() != 0) {
            for (String command : commands) {
                System.out.println(" - " + command);
            }
        } else {
            System.out.println("Список выполняемх команд пуст.");
        }
    }

    public static void addCommand(String newCommand) {
        commands.add(newCommand);
    }
}
