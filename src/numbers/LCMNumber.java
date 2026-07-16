package numbers;

public class LCMNumber {
    public static void main(String[] args) {
        int a = 18;
        int b = 12;

        int first = a;
        int second = b;

        while (second != 0) {
            int temp = second;
            second = first % second;
            first = temp;
        }

        int gcd = first;

        // lcm formula
        int lcm = (a * b) / gcd;

        System.out.println(lcm);
    }
}