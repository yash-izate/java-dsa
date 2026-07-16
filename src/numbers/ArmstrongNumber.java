package numbers;

public class ArmstrongNumber {
    public static void main(String[] args) {
        //153, 8208, 1634
        int n = 9474;
        int temp = n;
        int sum = 0;
        int count = 0;

        while (temp > 0) {
            int digit = temp % 10;
            count++;
            temp /= 10;
        }

        temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, count);
            temp /= 10;
        }

        if (sum == n) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }
}