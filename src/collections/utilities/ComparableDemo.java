package collections.utilities;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {

    private int rollNo;
    private String name;
    private double cgpa;

    public Student(int rollNo, String name, double cgpa) {
        this.rollNo = rollNo;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public int compareTo(Student s) {

        // Natural Ordering (Ascending Roll Number)

        if (this.rollNo > s.rollNo)
            return 1;
        else if (this.rollNo < s.rollNo)
            return -1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return rollNo + "  " + name + "  " + cgpa;
    }
}

public class ComparableDemo {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(103, "Alice", 8.7));
        students.add(new Student(101, "Bob", 9.1));
        students.add(new Student(105, "Charlie", 7.9));
        students.add(new Student(102, "David", 8.5));
        students.add(new Student(104, "Emma", 9.4));

        System.out.println("Before Sorting");

        for (Student s : students) {
            System.out.println(s);
        }

        Collections.sort(students);

        System.out.println("\nAfter Sorting (Roll Number)");

        for (Student s : students) {
            System.out.println(s);
        }
    }
}