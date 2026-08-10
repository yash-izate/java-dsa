class SecondLargest {

    static void secondLargest(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Need at least 2 elements!");
            return;
        }

        int largest = arr[0];
        Integer secondLargest = null;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];

            } else if (arr[i] < largest &&
                       (secondLargest == null || arr[i] > secondLargest)) {
                secondLargest = arr[i];
            }
        }

        if (secondLargest == null) {
            System.out.println("No second largest distinct element!");
        } else {
            System.out.println("Second Largest = " + secondLargest);
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 2, 5, 4, 7, 6, 8};

        secondLargest(arr);
    }
}
