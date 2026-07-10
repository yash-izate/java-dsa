package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumOfArray {

    public static int largest(int arr[]) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {

                max = arr[i];
            }

        }

        return max;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Maximum of array finder!");
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println("Size of array cannot be zero!");
            sc.close();
            return;

        }

        int arr[] = new int[size];

        int i = 0;
        while (i < arr.length) {
            System.out.print("Enter " + (i + 1) + " element: ");
            arr[i] = sc.nextInt();
            i++;
        }

        System.out.println("Given Array: " + Arrays.toString(arr));

        int max = largest(arr);

        System.out.println("\nLargest in an array is " + max);

        sc.close();
    }
}