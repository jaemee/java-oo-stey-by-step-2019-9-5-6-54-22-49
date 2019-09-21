package practice08;

public class Klass {
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

    void assignLeader(Student student){
        this.leader = student;
    }

    Student getLeader() {
        return this.leader;
    }
}
