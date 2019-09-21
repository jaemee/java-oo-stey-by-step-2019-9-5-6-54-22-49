package practice02;

public class Student extends Person {
    private int age;
    private String name;
    private int klass;

    public Student(String name, int age) {
        super(name, age);
    }

    public Student(String name, int age, int klass) {
        this.name = name;
        this.age = age;
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String introduce() {
        StringBuilder intro = new StringBuilder("I am a Student. I am at Class ").append(getKlass()).append(".");
        return intro.toString();
    }
}
