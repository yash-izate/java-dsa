package arrays.easy;

import java.util.Arrays;

public class SortZeroOne {
    static void countZero(int[] arr) {
        int countZero = 0;

        for (int ele : arr) {
            if (ele == 0) {
                countZero++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (i < countZero) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void usingTwoPointer(int[] arr) {
        int i = 0, j = arr.length - 1;

        while (i < j) {
            if (arr[i] == 0) {
                i++;
            }
            if (arr[j] == 1) {
                j--;
            }
            if (i < j) {
                if (arr[i] == 1 || arr[j] == 0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    i++;
                    j--;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 0, 1, 0, 1, 0, 1};

        // using simple count 0 method
//        countZero(arr);

        //using two pointer
        usingTwoPointer(arr);
    }
}