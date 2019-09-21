package practice08;

public class Person {
    private Integer age;
    private String name;
    private Integer id;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person(Integer id, String name, Integer age) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public String introduce(){
        StringBuilder intro = new StringBuilder("My name is ").append(getName()).append(". I am ").append(getAge()).append(" years old.");
        return intro.toString();
    }

    public boolean equals(Object second){
        Person temp = (Person) second;
        return this.name.equals(temp.name)&& this.id.equals(temp.id) && this.age.equals(temp.age);
    }
}
