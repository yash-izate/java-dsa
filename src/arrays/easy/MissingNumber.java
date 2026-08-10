package arrays.easy;

public class MissingNumber {

    static void sumMethod(int[] arr) {
        int n = arr.length;
        int arrSum = 0;

        for (int ele : arr) {
            arrSum += ele;
        }

        int expectedSum = n * (n + 1) / 2;
        int num = expectedSum - arrSum;
        System.out.println("Using sum of natural numbers = " + num);
    }

    static void xorMethod(int[] arr) {
        // you can also use only one variable instead of actual and expected
        int actual = 0;
        for (int ele : arr) {
            actual ^= ele;
        }

        int expected = 0;
        for (int i = 0; i < arr.length + 1; i++) {
            expected ^= i;
        }

        int missingNum = expected ^ actual;
        System.out.println("Missing Number using xor = " + missingNum);
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 5, 6};

        // using arraysum method
        sumMethod(arr);

        // using xor sum
        xorMethod(arr);

    }
}