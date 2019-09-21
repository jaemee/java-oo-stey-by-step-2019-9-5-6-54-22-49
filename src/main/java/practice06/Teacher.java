package practice06;

public class Teacher extends Person {
    private Integer klass;
    private String name;
    private int age;

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Teacher(String name, int age, int klass) {
        this.name = name;
        this.age = age;
        this.klass = klass;
    }

    @Override
    public String introduce() {
        StringBuilder intro = new StringBuilder(" I am a Teacher. I teach ");
        if(getKlass()!= null){
            intro.append("Class ").
                    append(getKlass()).append(".");
        }else {
            intro.append("No Class.");
        }

        return super.introduce().concat(intro.toString());
    }

    public Integer getKlass() {
        return klass;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }
}
