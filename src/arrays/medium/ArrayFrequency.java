package arrays.medium;

import java.util.HashMap;

public class ArrayFrequency {
    static int maxFreqKey(HashMap<Integer, Integer> freq) {
        int maxFreq = Integer.MIN_VALUE;
        int maxFreqWaliKey = Integer.MIN_VALUE;

        for (int key : freq.keySet()) {
            int currentKey = key;
            int currKeyFreq = freq.get(key);

            if (currKeyFreq > maxFreq) {
                maxFreq = currKeyFreq;
                maxFreqWaliKey = currentKey;
            }

        }
        return maxFreqWaliKey;
    }

    static int minFreqKey(HashMap<Integer, Integer> freq) {
        int minFreq = Integer.MAX_VALUE;
        int minFreqWaliKey = Integer.MAX_VALUE;

        for (int key : freq.keySet()) {
            int currentKey = key;
            int currKeyFreq = freq.get(key);

            if (currKeyFreq < minFreq) {
                minFreq = currKeyFreq;
                minFreqWaliKey = currentKey;
            }

        }
        return minFreqWaliKey;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 3, 2, 2, 5, 3, 4, 5, 4, 3};

        HashMap<Integer, Integer> freq = new HashMap<>();
        // creating hashmap
        for (int ele : arr) {
            freq.put(ele, freq.getOrDefault(ele, 0) + 1);
        }
        System.out.println(freq);

        // finding highest freq
        System.out.println("Max Frequency of Array: " + maxFreqKey(freq));
        System.out.println("Min Frequency of Array: " + minFreqKey(freq));

    }
}