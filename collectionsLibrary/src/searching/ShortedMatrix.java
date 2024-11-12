package searching;

import java.util.Arrays;

public class ShortedMatrix {
    public static void main(String[] args) {
        int [][] arr = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int target  = -1;
        int count=0;
//        System.out.println(Arrays.toString(search(arr,target)) );
//        for(int i=0;i<=arr.length-1;i++){
//            for(int j=0; j<=arr.length-1;j++){
//               if(arr[i][j]<0){
//                   count++;
//               }
//            }
//        }
//        System.out.println(count);
        System.out.println(countNegative(arr) );


    }

    static int countNegative(int[][] arr) {
        int start = 0;
        int end = arr[0].length - 1;
        int length= arr.length;
        int count = 0;
        while (start < length && end >= 0) {
            if (arr[start][end] < 0) {
                count += length - start;
                end--;

            } else {
                start++;

            }
        }
            return count;

    }

//    static  int[] search(int[][] matrix, int target){
//        int start = 0;
//        int end = matrix.length;
//        while(start<= matrix.length && end>=0){
//            if(matrix[start][end]==target){
//                return new int[]{start,end};
//
//            }
//            if (matrix[start][end]<target) {
//                start++;
//
//            }
//            else {
//                end--;
//            }
//        }
//        return new int[]{-1,-1};
//    }
//}
        }