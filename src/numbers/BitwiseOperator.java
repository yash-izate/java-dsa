package numbers;

public class BitwiseOperator {
    public static void main(String[] args) {
        int a = 100;

        System.out.println(~a);
        System.out.println(a & 6);
        System.out.println(a | 10);
        System.out.println(a ^ 11);
        System.out.println(a << 1);
        System.out.println(a >> 1);
        System.out.println(a >>> 3);
        System.out.println();

        int b = 100;

        while (b > 0) {
            b = b >> 1;
            System.out.println(b >> 1);
        }

        System.out.println();

        int c = 3;

        for (int i = 0; i < 10; i++) {
            c = c << 2;
            System.out.println(c);
        }
    }
}