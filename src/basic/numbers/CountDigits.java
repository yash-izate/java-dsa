package basic.numbers;

public class CountDigits {
    public static void main(String[] args) {
        int num = 56731;
        int count = 0;

        while (num > 0) {
            int digit = num % 10;
            count++;
            num /= 10;
        }
        System.out.println(count);
    }
}