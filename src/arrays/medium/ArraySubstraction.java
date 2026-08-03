package arrays.medium;

import java.util.Arrays;

class ArraySubstraction {
    public static void main(String[] args) {
     int[] arr1 = {5,6,7,5,8,9};
        int[] arr2 = {6,8,10};
        int[] result = new int[arr1.length + arr2.length];
        int count = 0;
        
        for(int i = 0; i < arr1.length; i++) {
                    boolean isPresent = false;
            for( int j = 0; j < arr2.length; j++) {
                if(arr1[i] == arr2[j]) {
                   isPresent = true;
                   break;
                } 
             }
            if (!isPresent) {
               if (count == 0 || result[count - 1] != arr1[i]) {
                    result[count++] = arr1[i];
                }
             }
          }
              System.out.println(Arrays.toString(Arrays.copyOf(result, count)));
        }
    }
