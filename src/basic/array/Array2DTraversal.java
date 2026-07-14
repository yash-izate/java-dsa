package basic.array;

import java.util.Arrays;

public class Array2DTraversal {
    public static void main(String[] args) {
        // declaration
        int[][] arr;

        // allocation
        int[][] arr2D = new int[3][3];

        // initialization
        int[][] matrix = {
                {1, 1, 2},
                {2, 4},
                {3, 9, 12, 69},
                {100}
        };

        // 2d array traversal
        System.out.println("Matrix: ");
        for (int i = 0; i < matrix.length; i++) {
//            int col = matrix[i].length;
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println(Arrays.deepToString(matrix));
    }
}