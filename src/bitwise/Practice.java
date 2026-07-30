package bitwise;

public class Practice {

    static void countSetBit(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n >>= 1;
        }
        System.out.println("Set bit count = " + count);
    }

    // array should be in a continuous series for this xor method
    static void findMissingNumber(int[] arr) {
        int expected = 0;
        for (int i = 1; i <= arr.length + 1; i++) {
            expected ^= i;
        }

        int actual = 0;
        for (int num : arr) {
            actual ^= num;
        }

        int missing = expected ^ actual;
        System.out.println("Missing element = " + missing);
    }

    //find two unique numbers others appear twice
    static void uniqueTwoNumbers(int[] arr) {
        int xor = 0;
        for (int num : arr) {
            xor ^= num;
        }

        // get last set bit of xor number
        int getLast = xor & (-xor);

        // divide into two
        int unique1 = 0;
        int unique2 = 0;

        for (int ele : arr) {
            if ((ele & getLast) == 0) {
                unique1 ^= ele;
            } else {
                unique2 ^= ele;
            }
        }
        System.out.println("Two Unique elements: \nX = " + unique1 + "\nY = " + unique2);

    }

    public static void main(String[] args) {
        // for counting set bits in a num
        int n = 10;
        countSetBit(n);

        // for missing element using xor
        int[] arr = {1, 2, 3, 4, 5, 7, 8, 9};
        findMissingNumber(arr);

        // for unique two number others appears twice
        int[] num = {2, 4, 7, 3, 2, 7, 4, 5};
        uniqueTwoNumbers(num);
    }
}