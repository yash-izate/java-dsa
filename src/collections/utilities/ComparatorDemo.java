package collections.utilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Students {

    private final int rollNo;
    private final String name;
    private final double cgpa;

    public Students(int rollNo, String name, double cgpa) {
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
    public String toString() {
        return rollNo + "  " + name + "  " + cgpa;
    }
}

public class ComparatorDemo {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(103, "Alice", 8.7));
        students.add(new Student(101, "Bob", 9.1));
        students.add(new Student(105, "Charlie", 7.9));
        students.add(new Student(102, "David", 8.5));
        students.add(new Student(104, "Emma", 9.4));

        System.out.println("Original List");
        students.forEach(System.out::println);

        // ---------------- SORT BY ROLL NUMBER ----------------
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.getRollNo(), s2.getRollNo());
            }
        });

        System.out.println("\nSorted by Roll Number");
        students.forEach(System.out::println);

        // ---------------- SORT BY NAME ----------------
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        });

        System.out.println("\nSorted by Name");
        students.forEach(System.out::println);

        // ---------------- SORT BY CGPA ASCENDING ----------------
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Double.compare(s1.getCgpa(), s2.getCgpa());
            }
        });

        System.out.println("\nSorted by CGPA (Ascending)");
        students.forEach(System.out::println);

        // ---------------- SORT BY CGPA DESCENDING ----------------
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Double.compare(s2.getCgpa(), s1.getCgpa());
            }
        });

        System.out.println("\nSorted by CGPA (Descending)");
        students.forEach(System.out::println);

        // ---------------- SORT BY NAME LENGTH ----------------
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(
                        s1.getName().length(),
                        s2.getName().length());
            }
        });

        System.out.println("\nSorted by Name Length");
        students.forEach(System.out::println);

        // ---------------- SORT USING LAMBDA ----------------
        students.sort((s1, s2) -> Integer.compare(s2.getRollNo(), s1.getRollNo()));

        System.out.println("\nSorted by Roll Number (Descending - Lambda)");
        students.forEach(System.out::println);
    }
}