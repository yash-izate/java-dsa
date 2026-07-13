package pattern;

public class HollowPyramid {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            // inverted spaces
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }

            // for stars  left boundry (j = 1) and  right boundry (j=2*i-1)
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (i == 1 || i == n || j == 1 || j == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
            System.out.println();
        }
    }
}