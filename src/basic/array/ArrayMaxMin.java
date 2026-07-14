package basic.array;

public class ArrayMaxMin {
    public static void main(String[] args) {
        int[] arr = {30, 7, 4, 0, 5, -6, 9};

        // maximum of array
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max of array: " + max);

        // minimum of array
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Min of array: " + min);
    }
}