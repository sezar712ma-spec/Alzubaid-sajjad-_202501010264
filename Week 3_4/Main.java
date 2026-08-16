class Person {
    protected String name;
    protected String id;

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void introduce() {
        System.out.println("Hello, I am " + name + " (ID: " + id + ")");
    }
}

class Student extends Person {
    public Student(String name, String id) {
        super(name, id);
    }

    @Override
    public void introduce() {
        System.out.println("I am a student named " + name + " (ID: " + id + ")");
    }
}

class Lecturer extends Person {
    public Lecturer(String name, String id) {
        super(name, id);
    }

    @Override
    public void introduce() {
        System.out.println("I am a lecturer named " + name + " (ID: " + id + ")");
    }
}

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Ali", "2222");
        Person p2 = new Student("Ahmad", "3333");
        Person p3 = new Lecturer("Dr. Omar", "1111");

        p1.introduce();
        p2.introduce();
        p3.introduce();
    }
}