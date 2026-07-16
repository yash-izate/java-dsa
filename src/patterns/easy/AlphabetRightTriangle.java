package patterns.easy;

public class AlphabetRightTriangle {
    public static void main(String[] args) {
        int n = 5;

        for (int row = 1; row <= n; row++) {
            char c = 'A';
            for (int col = 1; col <= row; col++) {
                System.out.print(c++);
            }
            System.out.println();
        }
    }
}