package practice11;

import java.util.LinkedList;
import java.util.Observable;
import java.util.Observer;

public class Teacher extends Person implements Observer{
    private Klass klass;
    private int id;
    private int age;
    private String name;
    LinkedList<Klass> klassList = new LinkedList<>();


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

    public Teacher(Integer id, String name, Integer age, LinkedList<Klass> klassList){
        super(id, name, age);
        this.klassList = klassList;
        this.klassList.forEach(klass -> klass.addObserver(this));
    }

    LinkedList<Klass> getClasses(){
        return klassList;
    }

    @Override
    public String introduce() {
        StringBuilder intro = new StringBuilder(" I am a Teacher. I teach ");
        if(!getClasses().isEmpty()){
            intro.append("Class ");
            for(Klass klass : getClasses()){
                intro.append(klass.getNumber()).append(", ");
            }
            intro.delete(intro.length()-2, intro.length());
        }else {
            intro.append("No Class");
        }

        return super.introduce().concat(intro.append(".").toString());
    }

    public Klass getKlass() {
        return klass;
    }

    String introduceWith(Student student){
        StringBuilder introWith = new StringBuilder(super.introduce()).append(" I am a Teacher.");
        if(!getClasses().isEmpty()){
            if(getClasses().contains(student.getKlass())) {
                introWith.append(" I teach ");
            }else {
                introWith.append(" I don't teach ");
            }

            for(Klass klass : getClasses()) {
                introWith.append(student.getName()).append(", ");
            }
            introWith.delete(introWith.length()-2, introWith.length()).append(".");

        } else {
            introWith.append(" I don't teach ").append(student.getName()).append(".");
        }
        return introWith.toString();
    }

    public boolean isTeaching(Student student) {
        klassList.forEach(klass -> {
            if(student.isIn(klass) && !student.equals(klass.getLeader())){
                System.out.append("I am Tom. I know ").append(student.getName())
                        .append(" has joined ").append(klass.getDisplayName()).append(".\n");
            }
            if(student.equals(klass.getLeader())){
                System.out.append("I am Tom. I know ").append(student.getName())
                        .append(" become Leader of ").append(klass.getDisplayName()).append(".\n");
            }
        });

        return getClasses().contains(student.getKlass());
    }

    @Override
    public void update(Observable o, Object student) {
        isTeaching((Student) student);
    }
}
