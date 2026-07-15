package basic.numbers;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        int n = 23;

        if (n <= 1) {
            System.out.println("Not Prime Number");
            return;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println("Not Prime Number");
                return;
            }
        }

        System.out.println("Prime Number");

    }
}