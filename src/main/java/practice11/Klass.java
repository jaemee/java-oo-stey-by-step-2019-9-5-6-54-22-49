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
            setChanged();
            notifyObservers(student);
        }
    }

    Student getLeader() {
        return this.leader;
    }

    void appendMember(Student student) {
            student.getKlass().number = this.getNumber();
            setChanged();
            notifyObservers(student);

    }

}
