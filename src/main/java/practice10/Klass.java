package practice10;

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

    void assignLeader(Student student) {
        if(getNumber()!=student.getKlass().getNumber()){
            System.out.append("It is not one of us.\n");
        }else{
            this.leader = student;
            System.out.flush();
        }
    }

    Student getLeader() {
        return this.leader;
    }

    void appendMember(Student student) {
        // TODO
    }
}
