package Arrays;

// Brute Force approch - Worst time complexity O(n^3)
public class SumSubArray_1 {

    public static void printSubArrays(int numbers[]) {
        int tot = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                int sum = 0;

                for (int k = start; k <= end; k++) {
                    sum += numbers[k];
                    System.out.print(numbers[k] + " ");
                }

                // Update max and min sum
                if (sum > maxSum) {
                    maxSum = sum;
                }
                if (sum < minSum) {
                    minSum = sum;
                }

                System.out.println("(Sum = " + sum + ")");
                tot++;
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Total Subarrays: " + tot);
        System.out.println("Maximum Subarray Sum: " + maxSum);
        System.out.println("Minimum Subarray Sum: " + minSum);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };

        printSubArrays(numbers);
    }
}
