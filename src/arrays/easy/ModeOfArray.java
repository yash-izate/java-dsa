package arrays.easy;

import java.util.HashMap;

public class ModeOfArray {
    static void modeBruteForce(int[] arr) {
        int mode = 0;
        int maxCount = 0;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > maxCount) {
                mode = arr[i];
                maxCount = count;
            }
        }

        System.out.println("Mode of array = " + mode);
    }


    // Print each mode only once
    static void printAllModes(int[] arr) {

        int maxCount = 0;

        // Find maximum frequency
        for (int i = 0; i < arr.length; i++) {

            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
            }
        }

        System.out.println("Maximum frequency = " + maxCount);
        System.out.print("Modes = ");

        // Print each mode only once
        for (int i = 0; i < arr.length; i++) {

            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count == maxCount) {

                boolean alreadyPrinted = false;

                for (int j = 0; j < i; j++) {
                    if (arr[i] == arr[j]) {
                        alreadyPrinted = true;
                        break;
                    }
                }

                if (!alreadyPrinted) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }

    static void modeHashMap(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        System.out.println();
        System.out.println("Frequency table: " + freq);

        int maxFreq = -1;
        int maxFreqKey = -1;

        for (int key : freq.keySet()) {
            int currentKey = key;
            int currKeyFreq = freq.get(key);

            if (currKeyFreq > maxFreq) {
                maxFreq = currKeyFreq;
                maxFreqKey = currentKey;
            }
        }

        System.out.println("Max Frequency Key = " + maxFreqKey);
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 2, 3, 5, 2, 9, 5, 2, 2};

        // by brute force method
        modeBruteForce(arr);

        // advance version - printing all modes
        int[] arr2 = {5, 2, 3, 2, 3, 5, 2, 9, 5, 2, 2, 3, 3, 3};
        printAllModes(arr2);

        // by using collection
        modeHashMap(arr2);
    }
}