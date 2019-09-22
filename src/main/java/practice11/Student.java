package practice11;

public class Student extends Person{
    private Klass klass;
    private int id;

    public Student(String name, int age) {
        super(name, age);
    }
    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Student(Integer id, String name, Integer age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return this.klass;
    }

    @Override
    public String introduce() {
        StringBuilder intro = new StringBuilder(super.introduce()).append(" I am a Student. I am ");
        if(this.klass.getLeader() != null){
            intro.append("Leader of ");
        }else {
            intro.append("at ");
        }

        return intro.append(klass.getDisplayName()).append(".").toString();
    }
}
