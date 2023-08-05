package Animals;

public class Cat extends ClassPetsAnimal {

    protected String[] commands = { "мяукнуть", "дать себя погладить" };

    public Cat(String name, int age) {
        super("Кошка", name, age);
    }

    public void getCommands() {
        for (String command : commands) {
            System.out.println(command);
        }
    }
}
