package arrays.easy;

import java.util.Arrays;

public class ArrayBasics {

    static void getAverage(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = (double) sum / arr.length;
        System.out.println(avg);
    }

    static void multiplyByNumber(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 10;
        }
        System.out.println(Arrays.toString(arr));
    }

    static boolean findTarget(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return true;
            }
        }
        return false;
    }

    static int findMax(int[] arr) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int findMin(int[] arr) {

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 6, 9};
        getAverage(arr1);

        int n = 10;
        multiplyByNumber(arr1, n);

        int[] arr2 = {1, 3, -4, 6, 9};
        int target = 3;
        System.out.println(findTarget(arr2, target));

        System.out.println(findMax(arr2));
        System.out.println(findMin(arr2));
    }
}