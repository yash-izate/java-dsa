package arrays.easy;

import java.util.Arrays;

public class ArrayReverse1 {
    static void basicReversal(int[] arr) {
        int[] revArr = new int[arr.length];
        int count = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            revArr[count++] = arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(revArr));
    }

    static void reverseBySwapping(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};

        // brute force approach
        basicReversal(arr);

        // two pointer and swapping
        reverseBySwapping(arr);
        System.out.println(Arrays.toString(arr));
    }
}