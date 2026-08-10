package arrays.medium;

public class SecondSmallest {

    static void secondSmallest(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Atleast 2 elements are required!");
            return;
        }

        Integer second = null;
        int smallest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                second = smallest;
                smallest = arr[i];
            } else if (arr[i] > smallest) {
                if (second == null || arr[i] < second) {
                    second = arr[i];
                }
            }
        }

        if (second == null) {
            System.out.println("Second smallest is not found!");
        } else {
            System.out.println("Second Smallest = " + second);
        }

    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 7, 5, 6, 4};
//        int[] arr = {};

        secondSmallest(arr);
    }

}