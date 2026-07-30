package bitwise.easy;

public class DecimalToBinary {
    public static void main(String[] args) {
        int n = 10;
        String bit = "";

        while (n > 0) {
            bit += n % 2;
            n /= 2;
        }

        String rev = "";
        for (int i = bit.length() - 1; i >= 0; i--) {
            char ch = bit.charAt(i);
            rev += ch;
        }

        System.out.println("Binary number = " + rev);
    }
}