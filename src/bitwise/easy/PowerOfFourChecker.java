package bitwise.easy;

import java.util.Scanner;

public class PowerOfFourChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Enter valid input!");
            return;
        }

        if ((n & (n - 1)) != 0) {
            System.out.println("Enter valid input!");
            return;
        }

        // count how many shift needed to get set bits
        int count = 0;

        while (n > 1) {
            n >>= 1;
            count++;
        }

        System.out.println(count);
        System.out.println("Power of 4 checker: " + (count % 2 == 0));
    }
}