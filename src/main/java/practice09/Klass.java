package practice09;

import java.io.*;

public class Klass {
    private int number;
    private Student student;

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
            this.student = student;
            System.out.flush();
        }

    }

    Student getLeader() {
        return this.student;
    }

    void appendMember(Student student) {
        this.number = student.getKlass().getNumber();
    }



}
