package bitwise.medium;

public class BitwiseExponentiation {

    // Function to calculate base^exp
    public static long power(long base, long exp) {

        // Stores the final answer.
        // Initially answer is 1 because anything^0 = 1.
        long ans = 1;

        // Continue until exponent becomes 0.
        while (exp > 0) {

            // Check if the exponent is odd.
            // (exp & 1) extracts the last bit.
            //
            // Examples:
            // 5 = 101 -> last bit = 1 (odd)
            // 6 = 110 -> last bit = 0 (even)
            if ((exp & 1) == 1) {

                // If exponent is odd,
                // multiply the current base into the answer.
                ans = ans * base;
            }

            // Square the base.
            //
            // Example:
            // 2 -> 4 -> 16 -> 256 ...
            //
            // This allows us to skip many multiplications.
            base = base * base;

            // Divide exponent by 2 using right shift.
            //
            // Example:
            // 10 (1010) -> 5 (0101)
            // 5  (0101) -> 2 (0010)
            // 2  (0010) -> 1 (0001)
            exp = exp >> 1;
        }

        // Return the computed power.
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(power(2, 10)); // 1024
    }
}