package patterns.medium;

public class SolidButterfly {
    public static void main(String[] args) {
        int n = 5;

        for (int row = 1; row <= n; row++) {
            // for left stars
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            // for space
            for (int space = 1; space <= 2 * n - 2 * row; space++) {
                System.out.print(" ");
            }
            // for right stars
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            // next line
            System.out.println();
        }

        // reflection
        for (int row = n; row > 0; row--) {

            // for left stars
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            // for space
            for (int space = 1; space <= 2 * n - 2 * row; space++) {
                System.out.print(" ");
            }
            // for right stars
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            // next line
            System.out.println();
        }
    }
}