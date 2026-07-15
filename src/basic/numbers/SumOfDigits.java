package basic.numbers;

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 58731;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            // update
            num /= 10;
        }

        System.out.println("Sum of digits = " + sum);
    }
}