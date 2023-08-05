package Animals;

import java.util.ArrayList;
import java.util.Arrays;

public class Horse extends ClassPackAnimal {

    protected static String type = "Лошадь";
    protected static ArrayList<String> commands = new ArrayList<>(Arrays.asList("но", "тпру"));

    public Horse(String name, int age) {
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
