package practice08;

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

    void assignLeader(Student student){
        this.student = student;
    }

    Student getLeader() {
        return this.student;
    }
}
