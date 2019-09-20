package practice05;

public class Person {
    private int age;
    private String name;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String introduce(){
        StringBuilder intro = new StringBuilder("My name is ").append(getName()).append(". I am ").append(getAge()).append(" years old.");
        return intro.toString();
    }
}
