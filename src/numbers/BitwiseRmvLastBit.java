package numbers;

public class BitwiseRmvLastBit {
    public static void main(String[] args) {
        int n = 10;

        int ans = n & (n - 1);

        System.out.println(ans);
    }
}