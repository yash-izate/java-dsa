package Arrays;

import java.util.Arrays;

public class ReverseArray {

    // using while loop
    public static void reverse_While(int arr[]) {
        int first = 0;
        int last = arr.length - 1;

        while (first < last) {
            // swap
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;

        }

    }

    // using for loop
    public static void reverse_For(int arr[]) {

        for (int first = 0, last = arr.length - 1; first < last; first++, last--) {
            // Swap elements
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
        }
    }

    public static void main(String[] args) {

        int arr[] = { 2, 4, 6, 8, 10 };

        reverse_For(arr);
        
        System.out.println(Arrays.toString(arr));
    }

}
