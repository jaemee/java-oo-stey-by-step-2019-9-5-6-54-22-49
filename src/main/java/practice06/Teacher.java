package practice06;

public class Teacher extends Person {
    private Integer klass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, int klass) {
        super(name, age);
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

}
