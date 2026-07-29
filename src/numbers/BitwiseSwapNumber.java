package numbers;

// swapping without a temporary variable

public class BitwiseSwapNumber {
    public static void main(String[] args) {
        int a = 6;
        int b = 4;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.printf("a = %d \nb = %d", a, b);
    }
}