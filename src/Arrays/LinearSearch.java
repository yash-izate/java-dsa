package Arrays;

import java.util.Scanner;

public class LinearSearch {

    public static int linearSearch(int array[], int n) {

        int idx = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                idx = i;
                return idx;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int array[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 30, 40, 50 };

        System.out.print("Enter no. to find in array: ");
        int key = sc.nextInt();

        int id = linearSearch(array, key);

        if (id == -1) {
            System.out.println("Key not found!");
        } else {
            System.out.println("Key is found at id " + id);
        }

        sc.close();
    }
}