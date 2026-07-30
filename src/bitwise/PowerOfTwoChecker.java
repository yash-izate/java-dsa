package bitwise;

public class PowerOfTwoChecker {
    public static void main(String[] args) {
        int n = 32;
        int count = 0;

        while (n != 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n >>= 1;
        }

        System.out.println(count == 1 ? "Yes" : "No");
    }
}

// optimal solution for interviews

//public class PowerOfTwo {
//    public static void main(String[] args) {
//
//        int n = 32;
//
//        if (n > 0 && (n & (n - 1)) == 0)
//            System.out.println("Yes");
//        else
//            System.out.println("No");
//    }
//}