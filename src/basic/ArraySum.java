package basic;

public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {3, 56, 78, -89, 0};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Array: " + java.util.Arrays.toString(arr));
        System.out.println("The sum of arrays is " + sum + ".");
    }
}