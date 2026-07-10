import java.util.Scanner;

public class ArrayOfMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to average calculator!");
        System.out.print("Enter name of the student: ");
        String name = sc.nextLine();
        System.out.print("Enter number of subjects: ");
        int subject = sc.nextInt();

        float marks[] = new float[subject];
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter marks of subject " + (i + 1) + ": ");
            marks[i] = sc.nextFloat();
        }

        float sum = 0;
        for (float element : marks) {
            sum += element;
        }

        float avg = sum / marks.length;

        System.out.println("The average marks of " + name + " are: " + avg);
        sc.close();
    }

}
