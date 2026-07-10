package Arrays;

public class PassArrayAsArgument {

    // function to update pass by reference and pass by value
    public static void update(int arr[], int nonChangable) {

        nonChangable = 20;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
        }

    }

    public static void main(String[] args) {

        int nonChangable = 10;

        int marks[] = { 21, 31, 41, 51, 61 };

        /*
         * In nonchangable a copy of this variable is sent to the function, therefore
         * variable in main function is unchanged
         */

        /*
         * in marks array , reference of memory address is passed therefore any changes
         * in the memory location in function is reflected in main also
         */

        update(marks, nonChangable);

        // print our array
        for (int i : marks) {
            System.out.print(i + "  ");
        }

        // new line
        System.out.println();

        // print pass by value (non-changable)
        System.out.println(nonChangable);

    }

}
