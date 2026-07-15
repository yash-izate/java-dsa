package basic.numbers;

public class PrintPrimeToN {
    public static void main(String[] args) {

        int n = 100;

        System.out.print("Prime: ");

        for (int i = 2; i <= n; i++) {

            boolean prime = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {

                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.print(i + " ");
            }
        }
    }
}