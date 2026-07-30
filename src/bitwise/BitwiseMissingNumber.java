package bitwise;

// "Given an array containing numbers from 1 to N, with exactly one number missing and no duplicates, find the
// missing number using XOR."

public class BitwiseMissingNumber {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 6, 7, 8, 9};

        int n = arr.length + 1;   // Total numbers should have been 9

        int expectedXor = 0;
        int actualXor = 0;

        // XOR all numbers from 1 to N
        for (int i = 1; i <= n; i++) {
            expectedXor ^= i;
        }

        // XOR all array elements
        for (int num : arr) {
            actualXor ^= num;
        }

        int missing = expectedXor ^ actualXor;

        System.out.println("Missing Number = " + missing);
    }
}


//  First Attempt

//import java.util.Arrays;

//public class BitwiseMissingNumber {
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 7, 6, 4, 8, 9};
//
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//
//        int lower = arr[0];
//        int upper = arr[arr.length - 1];
//        int temp1 = 0;
//        for (int i = lower; i <= upper; i++) {
//            temp1 = temp1 ^ i;
//        }
//
//        int temp2 = 0;
//        for (int i = 0; i < arr.length; i++) {
//            temp2 ^= arr[i];
//        }
//
//        System.out.println(temp1);
//        System.out.println(temp2);
//
//        System.out.println(temp1 ^ temp2);
//    }
//}