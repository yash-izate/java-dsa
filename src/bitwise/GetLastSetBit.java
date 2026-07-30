package bitwise;

public class GetLastSetBit {
    public static void main(String[] args) {

        // 10 = 1010 -> 10 (1) 0
        // turn rest bits 0
        int n = 10;

        // ans = 00 (1) 0 -> 0010 -> 2
        int getLastBit = n & (-n);
        System.out.println(getLastBit);
    }
}