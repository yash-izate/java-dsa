package arrays.easy;

import java.util.Arrays;

public class ArrayIntersection {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 5, 7, 3, 1, 9};
        int[] arr2 = {0, 9, 7, 3, 7, 1, 6};

        int[] newArr = new int[Math.min(arr1.length, arr2.length)];
        int count = 0;

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr2.length; j++) {

                // Check whether arr1[i] exists in arr2
                if (arr1[i] == arr2[j]) {

                    boolean isPresent = false;

                    // Check whether we already added it
                    for (int k = 0; k < count; k++) {

                        if (newArr[k] == arr1[i]) {
                            isPresent = true;
                            break;
                        }
                    }

                    // Add only if it hasn't been added before
                    if (!isPresent) {
                        newArr[count++] = arr1[i];
                    }

                    break;
                }
            }
        }

        System.out.println(
                Arrays.toString(Arrays.copyOf(newArr, count))
        );
    }
}