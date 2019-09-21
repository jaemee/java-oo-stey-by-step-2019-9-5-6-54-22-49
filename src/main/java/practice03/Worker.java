package practice03;

public class Worker extends Person{
    private int age;
    private String name;

    public Worker(String name, int age) {
        super(name, age);
        this.name = name;
        this.age = age;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String introduce() {
        return "I am a Worker. I have a job.";
    }
}
