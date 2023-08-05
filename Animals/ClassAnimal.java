package Animals;

public abstract class ClassAnimal {

    protected String func;
    protected String type;
    protected String name;
    protected int age;

    public ClassAnimal(String func, String type, String name, int age) {
        this.func = func;
        this.type = type;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return type + ", " + func + " животное. Кличка: " + name.toUpperCase() + ". Возраст: " + age;
    }
}
