class Student {
    private String name;
    private int age;
    private double gpa;

    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
    }

    public void study() {
        gpa += 0.1;
        System.out.println(name + " is studying...");
    }
}

public class Main {
    public static void main(String[] args) {
        // coding starts here
        Student s1 = new Student("SHARIF", 23, 3.5);
        s1.displayInfo();
        s1.study();
        s1.displayInfo();
    }
}