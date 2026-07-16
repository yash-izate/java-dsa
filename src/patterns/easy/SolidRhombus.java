package patterns.easy;

public class SolidRhombus {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {
            //  for spaces
            for (int space = 1; space <= (n - i); space++) {
                System.out.print(" ");
            }

            // for stars
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }

            // next line
            System.out.println();
        }
    }
}