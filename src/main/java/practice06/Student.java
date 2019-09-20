package practice06;

public class Student extends Person{
    private int klass;

    public Student(String name, int age) {
        super(name, age);
    }
    public Student(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        StringBuilder intro = new StringBuilder(" I am a Student. I am at Class ").append(getKlass()).append(".");
        return super.introduce().concat(intro.toString());
    }
}
