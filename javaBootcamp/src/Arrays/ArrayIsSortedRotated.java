package Arrays;

import java.util.Arrays;

public class ArrayIsSortedRotated {
    public static void main(String[] args) {
        int[] array = {1,4,3,3,2};
        System.out.println(longestMonotioncSubarray(array));

    }


 public  static  int longestMonotioncSubarray(int[] array){
        int count = 1;
        int strictly_increasing = 1;
        int strictly_decreasing = 1;

     for (int i = 1; i < array.length; i++) {
//         for increasing
         if(array[i]<array[i-1]) strictly_decreasing ++;
         else strictly_decreasing=1;
         if (array[i]>array[i-1]) strictly_increasing ++;
         else strictly_decreasing=1;

         count = Math.max(strictly_decreasing,strictly_increasing);

     }

        return count;
 }
    public static  boolean isSortedAndRotated(int[] array){
        int count =0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>array[(i+1)%array.length]){
                count ++;

            }
        }
        return count <=1;
    }
}



