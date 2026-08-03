package arrays.medium;

import java.util.Arrays;

class ArrayUnion {
    public static void main(String[] args) {

        int[] arr1 = {1, 3, 5, 7, 9, 11, 13};
        int[] arr2 = {0, 2, 4, 6, 8};

        int[] result = new int[arr1.length + arr2.length];

        int i = 0, j = 0, count = 0;

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] < arr2[j]) {

                if (count == 0 || result[count - 1] != arr1[i]) {
                    result[count++] = arr1[i];
                }
                i++;

            } else if (arr1[i] > arr2[j]) {

                if (count == 0 || result[count - 1] != arr2[j]) {
                    result[count++] = arr2[j];
                }
                j++;

            } else {

                if (count == 0 || result[count - 1] != arr1[i]) {
                    result[count++] = arr1[i];
                }
                i++;
                j++;
            }
        }

        while (i < arr1.length) {
            if (count == 0 || result[count - 1] != arr1[i]) {
                result[count++] = arr1[i];
            }
            i++;
        }

        while (j < arr2.length) {
            if (count == 0 || result[count - 1] != arr2[j]) {
                result[count++] = arr2[j];
            }
            j++;
        }

        System.out.println(Arrays.toString(Arrays.copyOf(result, count)));
    }
}
