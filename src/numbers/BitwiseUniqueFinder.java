package numbers;

// finding unique using xor
// Condition applied - "Every element appears exactly twice except one element, which appears once."

public class BitwiseUniqueFinder {
    public static void main(String[] args) {
        int[] arr = {10, 24, 7, 10, 13, 7, 24};
        int unique = 0;

        for (int ele : arr) {
            unique = unique ^ ele;
        }

        if (unique != 0) System.out.println(unique);
        else System.out.println("No unique element");

    }
}