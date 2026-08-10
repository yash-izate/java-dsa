package arrays.easy;

public class TwoSumEqualsTarget {
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

    public static void main(String[] args) {
        int[] arr = {7, 8, 9, 4, 5, 2};
        int target = 6;

        // using brute force meth
        int[] ans = twoSumImproved(arr, target);

        System.out.println(ans[0] + " " + ans[1]);
    }
}