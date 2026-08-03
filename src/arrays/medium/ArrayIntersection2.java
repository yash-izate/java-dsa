package arrays.medium;

import java.util.Arrays;

public class ArrayIntersection2 {
    public static void main(String[] args) {
        int[] arr1 = {0, 2, 5, 7, 3, 1, 9};
        int[] arr2 = {1, 9, 7, 3, 7, 1, 6, 5};
        int[] result = new int[Math.min(arr1.length, arr2.length)];

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0, j = 0, count = 0;

        while (i < arr1.length && j < arr2.length) {
            boolean isPresent = false;

            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                if (count == 0 || result[count - 1] != arr1[i]) {
                    result[count++] = arr1[i];
                }

                i++;
                j++;
            }
        }
        System.out.println(Arrays.toString(Arrays.copyOf(result, count)));
    }
}
