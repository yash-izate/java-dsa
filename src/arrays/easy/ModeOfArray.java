package arrays.easy;

public class ModeOfArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 2, 3, 5, 2, 9, 5, 2, 2};
        int mode = 0;
        int maxCount = 0;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            
            for (int j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > maxCount) {
                mode = arr[i];
                maxCount = count;
            }
        }

        System.out.println("Mode of array = " + mode);
    }
}