package bitwise.easy;

public class BitwiseEvenOdd {
    public static void main(String[] args) {
        int n = 12;

        if ((n & 1) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

    }
}