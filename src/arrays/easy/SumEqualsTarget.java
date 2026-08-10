package arrays.easy;

import java.util.*;

public class SumEqualsTarget {
    static int[] twoSum(int[] arr, int target) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    if ((arr[i] + arr[j]) == target) {
                        return new int[]{i, j};
                    }
                }
            }
        }
        return new int[]{-1, -1};
    }

    static int[] twoSumImproved(int[] arr, int target) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if ((arr[i] + arr[j]) == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    static int[] threeSum(int[] arr, int target) {
        int[] ans = new int[3];
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {

                    int sum = arr[i] + arr[j] + arr[k];
                    if (sum == target) {
                        ans = new int[]{i, j, k};
                        return ans;
                    }
                }
            }

        }

        ans = new int[]{-1, -1, -1};
        return ans;
    }

    static List<List<Integer>> usingDsa(int[] arr, int target) {

        Set<List<Integer>> result = new HashSet<>();

        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {

                    if ((arr[i] + arr[j] + arr[k]) == target) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(i);
                        temp.add(j);
                        temp.add(k);

                        Collections.sort(temp);
                        result.add(temp);
                    }
                }
            }

        }
        System.out.println(result);
        return new ArrayList<>(result);
    }

    public static void main(String[] args) {
        int[] arr1 = {7, 8, 9, 4, 5, 2};
        int[] arr2 = {2, 9, 7, 3, 1};
        int target = 6;

        // using brute force meth
        int[] ans = twoSumImproved(arr1, target);
        System.out.println("Idx number: " + ans[0] + " " + ans[1]);

        // three sum using brute force
        int[] result = threeSum(arr2, target);
        System.out.println("Idx number: " + result[0] + " " + result[1] + " " + result[2]);

        // using data structures
        usingDsa(arr2, target);


    }
}