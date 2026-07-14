package basic;

import java.util.Scanner;

public class ArrayInputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value for array index " + i + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Array: [");
        for (int ele : arr) {
            System.out.print(ele + ", ");
        }
        System.out.println("]");

    }
}