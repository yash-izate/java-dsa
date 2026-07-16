package patterns.medium;

public class HollowDiamond {
    public static void main(String[] args) {
        int n = 4;

        for (int row = 1; row <= n; row++) {
            // for spaces
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            // for stars
            for (int col = 1; col <= 2 * row - 1; col++) {
                if (row == 1 || col == 1 || col == 2 * row - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
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
                if (row == 1 || col == 1 || col == 2 * row - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // next line
            System.out.println();
        }
    }
}