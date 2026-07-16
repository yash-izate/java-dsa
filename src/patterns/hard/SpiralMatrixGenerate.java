package patterns.hard;

public class SpiralMatrixGenerate {

    public static void main(String[] args) {

        int n = 4;
        int[][] matrix = new int[n][n];

        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;

        int num = 1;

        while (top <= bottom && left <= right) {

            // Left → Right
            for (int col = left; col <= right; col++) {
                matrix[top][col] = num++;
            }
            top++;

            // Top → Bottom
            for (int row = top; row <= bottom; row++) {
                matrix[row][right] = num++;
            }
            right--;

            // Right → Left
            for (int col = right; col >= left && top <= bottom; col--) {
                matrix[bottom][col] = num++;
            }
            bottom--;

            // Bottom → Top
            for (int row = bottom; row >= top && left <= right; row--) {
                matrix[row][left] = num++;
            }
            left++;
        }

        // Print matrix
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.printf("%3d", value);
            }
            System.out.println();
        }
    }
}