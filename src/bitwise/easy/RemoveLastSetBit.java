package bitwise.easy;

public class RemoveLastSetBit {
    public static void main(String[] args) {
        int n = 12;

        int ans = n & (n - 1);

        System.out.println(ans);
    }
}