package basic.numbers;

public class RevNumber {
    public static void main(String[] args) {
        int num = 98721;
        int rev = 0;

        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed Number = " + rev);
    }
}