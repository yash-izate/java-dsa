package patterns.medium;

//public class PalindromeNumberPyramid {
//    public static void main(String[] args) {
//        int n = 4;
//
//        for (int row = 1; row <= n; row++) {
//            // spaces
//            for (int space = 1; space <= n - row; space++) {
//                System.out.print(" ");
//            }
//            // for number
//            int count = 1;
//            for (int col = 1; col <= 2 * row - 1; col++) {
//                if (col < row) {
//                    System.out.print(count++);
//                } else {
//                    System.out.print(count--);
//                }
//            }
//            System.out.println();
//        }
//    }
//}


// optimized code
public class PalindromeNumberPyramid {
    public static void main(String[] args) {
        int n = 4;

        for (int row = 1; row <= n; row++) {

            // Print leading spaces
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }

            // Print increasing numbers
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }

            // Print decreasing numbers
            for (int col = row - 1; col >= 1; col--) {
                System.out.print(col);
            }

            System.out.println();
        }
    }
}