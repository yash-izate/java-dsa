package numbers;

public class PrintDigits {
    public static void main(String[] args) {
        int num = 56731;

        while (num > 0) {
            int digit = num % 10;
            System.out.println(digit);
            num /= 10;
        }
    }
}