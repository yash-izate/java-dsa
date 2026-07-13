package pattern;

//public class PalindromeAlphabetPyramid {
//    public static void main(String[] args) {
//        int n = 4;
//
//        for (int row = 1; row <= n; row++) {
//            // for spaces
//            for (int space = 1; space <= n - row; space++) {
//                System.out.print(" ");
//            }
//
//            // for ascending alphabet
//            char c1 = 'A';
//            for (int col = 1; col <= row; col++) {
//                System.out.print(c1++);
//            }
//
//            // for descending alphabet
//            c1 -= 2;
//            for (int col = row - 1; col > 0; col--) {
//                System.out.print(c1--);
//            }
//            System.out.println();
//        }
//    }
//}
//

// optimized code
public class PalindromeAlphabetPyramid {
    public static void main(String[] args) {

        int n = 4;

        for (int row = 1; row <= n; row++) {

            // Print leading spaces
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }

            // Print ascending alphabets
            for (int col = 1; col <= row; col++) {
                System.out.print((char) ('A' + col - 1));
            }

            // Print descending alphabets
            for (int col = row - 1; col >= 1; col--) {
                System.out.print((char) ('A' + col - 1));
            }

            System.out.println();
        }
    }
}