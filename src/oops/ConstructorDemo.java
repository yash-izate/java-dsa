package oops;

class Student {

    String name;
    int rollNo;
    double cgpa;

    // 1. No-Argument Constructor
    Student() {
        System.out.println("No-Argument Constructor Called");
    }

    // 2. Parameterized Constructor
    Student(String name, int rollNo, double cgpa) {
        this.name = name;
        this.rollNo = rollNo;
        this.cgpa = cgpa;
    }

    // 3. Constructor Chaining using this()
    Student(String name) {
        this(name, 0, 0.0);
    }

    // 4. Copy Constructor
    Student(Student other) {
        this.name = other.name;
        this.rollNo = other.rollNo;
        this.cgpa = other.cgpa;
    }

    void display() {
        System.out.println("Name   : " + name);
        System.out.println("RollNo : " + rollNo);
        System.out.println("CGPA   : " + cgpa);
        System.out.println();
    }
}

public class ConstructorDemo {

    public static void main(String[] args) {

        // No-Argument Constructor
        Student s1 = new Student();

        // Parameterized Constructor
        Student s2 = new Student("Yash", 68, 8.74);

        // Constructor Chaining
        Student s3 = new Student("Rahul");

        // Copy Constructor
        Student s4 = new Student(s2);

        System.out.println("Parameterized Constructor Object:");
        s2.display();

        System.out.println("Constructor Chaining Object:");
        s3.display();

        System.out.println("Copy Constructor Object:");
        s4.display();
    }
}