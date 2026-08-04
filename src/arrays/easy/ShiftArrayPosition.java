package arrays.easy;

import java.util.Arrays;

public class ShiftArrayPosition {
    static void shiftBy1(int[] arr) {

        int temp = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
        System.out.println(Arrays.toString(arr));
    }

    static void shiftByK(int[] arr, int k) {

        if (k == 0 || arr.length <= 1) {
            System.out.println(Arrays.toString(arr));
            return;
        }

        k = k % arr.length;

        if (k == 0) {
            return;
        }

        int[] temp = new int[k];
        int count = 0;

        for (int i = arr.length - k; i < arr.length; i++) {
            temp[count++] = arr[i];
        }

        for (int i = arr.length - 1; i >= k; i--) {
            arr[i] = arr[i - k];
        }
        int i = 0;
        while (i < k) {
            arr[i] = temp[i];
            i++;
        }

        System.out.println(Arrays.toString(temp));
        System.out.println(Arrays.toString(arr));
    }

    static void usingFunction(int[] arr, int k) {
        if (k == 0 || arr.length <= 1) {
            System.out.println(Arrays.toString(arr));
            return;
        }

        k = k % arr.length;

        if (k == 0) {
            return;
        }

        while (k > 0) {
            shiftBy1(arr);
            k--;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};

        System.out.println("Original Array: " + Arrays.toString(arr));

        // shift by 1
//        shiftBy1(arr2);

        //shift by k position
        int k = 3;
//        shiftByK(arr, k);

        //  using recurion
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
        usingFunction(arr2, k);
    }
}