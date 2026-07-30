package bitwise.easy;

public class BitwiseSetBitCount {
    public static void main(String[] args) {
        int n = 13;
        int temp = n;
        int count = 0;

        // method easy
        while (n != 0) {
            count += (n & 1);
            n = n >> 1;
        }
        System.out.println("Common: " + count);

        // method function
        System.out.println("Function: " + Integer.bitCount(temp));

        // Brian Kernighan's Algorithm
        int num = 13;
        int i = 0;

        while (num != 0) {
            num = num & (num - 1);
            i++;
        }
        System.out.println("Algorithm = " + i);
    }
}