package Animals;

public abstract class ClassAnimal {

    protected String sector;
    protected String type;
    protected String name;
    protected int age;

    public ClassAnimal(String sector, String type, String name, int age) {
        this.sector = sector;
        this.type = type;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return type + ", " + sector + " животное. Кличка: " + name.toUpperCase() + ". Возраст: " + age;
    }
}
