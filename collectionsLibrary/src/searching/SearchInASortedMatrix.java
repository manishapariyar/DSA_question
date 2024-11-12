package searching;

import javax.swing.*;
import java.util.Arrays;

public class SearchInASortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.toString(searchInShortedMatrix(arr, 6)));
    }
    static int[] binarySearch(int [][] matrix,int row, int cStart,int cEnd, int target){
        while(cStart<=cEnd){
            int mid = cStart + (cEnd-cStart)/2;
            if(matrix[row][mid]==target){
                return new int[]{row,mid};
            }
            if(matrix[row][mid]<target){
                cStart = mid+1;
            }else {
                cEnd = mid-1;
            }
        }
        return  new int[]{-1,-1};
    }
    static int[] searchInShortedMatrix(int[][] matrix,int target){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int rStart = 0;
        int rEnd = rows-1;
        int midCol = cols/2;
        if(rows == 1){
            binarySearch(matrix,0,0,cols-1,target);
        }
//        run the loop till 2 rows are remaining
        while(rStart<(rEnd-1)){
            int mid = rStart +(rEnd-rStart)/2;
            if(matrix[mid][midCol]==target){
                return new int[]{mid, midCol};
            } if(matrix[mid][midCol]<target){
                rStart = mid;
            }else{
                rEnd = mid;
            }

        }
//        now to have to rows
//        check whether te target is in the col of 2 rows
        if(matrix[rStart][midCol]== target){
            return  new  int[]{rStart,midCol};
        }if(matrix[rStart+1][midCol]== target){
            return  new  int[]{rStart+1,midCol};
        }

//        search in 1st half
        if(target <= matrix[rStart][midCol-1] ){
           return binarySearch(matrix,rStart,0,midCol-1,target);
        }if(target <= matrix[rStart][midCol+1] && target <=matrix[rStart][cols-1]  ){
            return binarySearch(matrix,rStart,midCol+1,cols-1,target);
        }if(target <= matrix[rStart +1][midCol-1] ){
            return binarySearch(matrix,rStart+1,0,midCol-1,target);
        }else{
            return binarySearch(matrix,rStart+1,midCol+1,midCol-1,target);
        }

    }
}
