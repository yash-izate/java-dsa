package arrays.medium;

import java.util.*;
import java.util.ArrayList;

public class RemoveDuplicate {

    static void usingDSA(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];

            if (!list.contains(curr)) {
                list.add(curr);
            }
        }

        System.out.println(list);
    }

    static void removeDuplicate(int[] arr) {
        int i = 0;
        int j = 1;

        while (j < arr.length) {
            if (arr[i] != arr[j]) {
                arr[i + 1] = arr[j];
                i++;
            }
            j++;

        }

        System.out.println(Arrays.toString(Arrays.copyOf(arr, i + 1)));
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 3, 3, 4, 5, 5};

        // Using DSA
        // usingDSA(arr);

        // using two pointer approach
        removeDuplicate(arr);
    }
}