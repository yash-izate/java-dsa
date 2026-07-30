package bitwise.easy;

public class UniqueTwoNumbers {
    public static void main(String[] args) {
        // for unique two number others appears twice
        int[] arr = {2, 4, 7, 3, 2, 7, 4, 5};

        int xor = 0;
        for (int num : arr) {
            xor ^= num;
        }

        // get last set a bit of xor number
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
}