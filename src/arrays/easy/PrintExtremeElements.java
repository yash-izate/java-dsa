package arrays.easy;

public class PrintExtremeElements {

    static void printExtremeAlternate(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        System.out.print("New = ");
        while (i <= j) {

            if (i == j) {
                System.out.print(arr[i]);
                return;

            } else {
                System.out.print(arr[i++] + ", ");
                System.out.print(arr[j--] + ", ");

            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        printExtremeAlternate(arr);

    }

}