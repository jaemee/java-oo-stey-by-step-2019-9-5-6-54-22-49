package practice07;

public class Student extends Person{
    private Klass klass;

    public Student(String name, int age) {
        super(name, age);
    }
    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        StringBuilder intro = new StringBuilder(" I am a Student. I am at ").append(getKlass().getDisplayName()).append(".");
        return super.introduce().concat(intro.toString());
    }
}
