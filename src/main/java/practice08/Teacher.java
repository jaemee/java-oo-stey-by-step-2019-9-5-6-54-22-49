package practice08;

public class Teacher extends Person {
    private Klass klass;
    private int id;
    private int age;
    private String name;


    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(Integer id, String name, Integer age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    @Override
    public String introduce() {
        StringBuilder intro = new StringBuilder(" I am a Teacher. I teach ");
        if(getKlass()!= null){
            intro.append(getKlass().getDisplayName()).append(".");
        }else {
            intro.append("No Class.");
        }

        return super.introduce().concat(intro.toString());
    }

    public Klass getKlass() {
        return klass;
    }

    String introduceWith(Student student){
        StringBuilder introWith = new StringBuilder(super.introduce()).append(" I am a Teacher.");
        if(getKlass().equals(student.getKlass())){
            introWith.append(" I teach ").append(student.getName()).append(".");
        }else {
            introWith.append(" I don't teach ").append(student.getName()).append(".");
        }
        return introWith.toString();
    }

}
