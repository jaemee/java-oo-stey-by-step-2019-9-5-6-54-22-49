package practice11;

import java.util.Observable;

public class Klass extends Observable {
    private int number;
    private Student leader;

    public Klass(int number) {
        this.number = number;
    }

    int getNumber() {
        return number;
    }

    String getDisplayName() {
        return "Class " + getNumber();
    }

    void assignLeader(Student student) {
        if(getNumber()!=student.getKlass().getNumber()){
            System.out.append("It is not one of us.\n");
        }else{
            this.leader = student;
            System.out.append("I am Tom. I know ").append(student.getName())
                    .append(" become Leader of ").append(getDisplayName()).append(".\n");
            setChanged();
            notifyObservers(getNumber());
        }
    }

    Student getLeader() {
        return this.leader;
    }

    void appendMember(Student student) {
            student.getKlass().number = this.getNumber();
            System.out.append("I am Tom. I know ").append(student.getName())
                    .append(" has joined ").append(getDisplayName()).append(".\n");
            setChanged();
            notifyObservers(getNumber());

    }
}
