package pattern;

public class RowNumberPyramid {
    public static void main(String[] args) {
        int n = 4;

        for (int row = 1; row <= n; row++) {
            // for spaces
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }

            // for column
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print(row);
            }

            // next line
            System.out.println();
        }
    }
}