package practice;

public class ArrayMultiply {
    public static void main(String[] args) {
        int[] arr = {2, 56, 78, -7, -4};
        int mul = 1;

        for (int i = 0; i < arr.length; i++) {
            mul *= arr[i];
        }

        System.out.println("Array: " + java.util.Arrays.toString(arr));
        System.out.println("Multiplication of each element of array is " + mul + ".");
    }
}