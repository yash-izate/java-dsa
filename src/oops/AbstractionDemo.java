package oops;

abstract class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Abstract Method
    abstract void work();

    // Concrete Method
    public void display() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

abstract class Employee extends Person {

    double salary;

    Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public void login() {
        System.out.println(name + " logged into the company portal.");
    }
}

class Manager extends Employee {

    String department;

    Manager(String name, int age, double salary, String department) {
        super(name, age, salary);
        this.department = department;
    }

    @Override
    void work() {
        System.out.println(name + " is managing the " + department + " department.");
    }

    public void conductMeeting() {
        System.out.println(name + " is conducting a meeting.");
    }
}

public class AbstractionDemo {

    public static void main(String[] args) {

        Manager manager = new Manager(
                "Yash",
                22,
                80000,
                "IT"
        );

        manager.display();
        manager.login();
        manager.work();
        manager.conductMeeting();
    }
}