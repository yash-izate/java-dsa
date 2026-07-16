package patterns.medium;

public class SolidDiamond {
    public static void main(String[] args) {
        int n = 4;

        for (int row = 1; row <= n; row++) {
            // for spaces
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            // for stars
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("*");
            }
            // next line
            System.out.println();
        }

        for (int row = n - 1; row > 0; row--) {
            // for spaces
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            // for stars
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("*");
            }
            //next line
            System.out.println();
        }
    }
}