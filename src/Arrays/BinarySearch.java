package Arrays;

public class BinarySearch {

    public static int binarySearch(int numArray[], int key) {
        int start = 0;
        int end = numArray.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            // comparisons
            if (numArray[mid] == key) {

                return mid;
            }

            // search right hand side
            if (numArray[mid] < key) {

                start = mid + 1;

            } else {

                end = mid - 1;
            }

        }

        return -1;
    }

    public static void main(String[] args) {

        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 5;

        int idx = binarySearch(numbers, key);

        if (idx != -1) {
            System.out.println("Index of key " + key + " is: " + idx);
        } else {
            System.out.println("Key not found in the array.");
        }

    }
}
