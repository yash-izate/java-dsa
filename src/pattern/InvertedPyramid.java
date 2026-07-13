package pattern;

//public class InvertedPyramid {
//    public static void main(String[] args) {
//        int n = 4;
//
//        for (int i = n; i > 0; i--) {
//            // for space
//            for (int space = 1; space <= n - i; space++) {
//                System.out.print(" ");
//            }
//
//            // for star
//            for (int j = 1; j <= (2 * i - 1); j++) {
//                System.out.print("*");
//            }
//
//            // next line
//            System.out.println();
//        }
//    }
//}


// Another method

public class InvertedPyramid {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 1; i <= n; i++) {
            // for space
            for (int space = 1; space <= i - 1; space++) {
                System.out.print(" ");
            }

            // for star  (2n-row-space) = (2n-row-row+1) = (2n-2row+1)
            for (int j = 1; j <= (2 * n - 2 * i + 1); j++) {
                System.out.print("*");
            }

            // next line
            System.out.println();
        }
    }
}