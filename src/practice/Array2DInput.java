package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Array2DInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int row = sc.nextInt();
        System.out.print("Enter column: ");
        int col = sc.nextInt();

        int[][] matrix = new int[row][col];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Enter element for (" + i + "," + j + ") : ");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}