package arrays.easy;

import bitwise.easy.GetLastSetBit;

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
            arr[i] *= n;
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

    static int[] sumPosNegNum(int[] arr) {
        int sumPos = 0;
        int sumNeg = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                sumPos += arr[i];
            } else {
                sumNeg += arr[i];
            }
        }

        int[] ans = {sumNeg, sumPos};
        return ans;
    }

    static int[] countZeroOne(int[] arr) {
        int countZero = 0;
        int countOne = 0;

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & 1) == 1) {
                countOne++;
            } else {
                countZero++;
            }
        }
        int[] count = {countZero, countOne};
        return count;
    }

    static int unsortedElement(int[] arr) {
        int ele = 0;

        for (int i = 1; i < arr.length; i++) {
            if (!(arr[i] > arr[i - 1])) {
                return ele = arr[i];
            }
        }
        return -1;
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

        // sum of positive and negative numbers
        int[] arr3 = {2, -3, 5, 7, -9, -4};
        int[] ans = sumPosNegNum(arr3);
        System.out.println("Sum of negtive = " + ans[0]);
        System.out.println("Sum of positive = " + ans[1]);

        // count 0 & 1 in an array
        int[] arr4 = {1, 1, 0, 1, 0, 0, 0, 1, 1};
        int[] count = countZeroOne(arr4);
        System.out.println("Zero count: " + count[0]);
        System.out.println("One count: " + count[1]);

        // first unsorted element
        int[] arr5 = {2, 3, 9, 1, 18};
        System.out.println("First Unsorted Element: " +
                (unsortedElement(arr5) != -1 ? unsortedElement(arr5) : "Element not found!")
        );
    }
}