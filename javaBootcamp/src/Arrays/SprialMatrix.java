package Arrays;

import java.util.ArrayList;
import java.util.List;

public class SprialMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        System.out.println(spiralMatrix(arr));

    }
    public static  List<Integer> spiralMatrix(int[][] arr){
        List<Integer> list = new ArrayList<>();
        int start = 0;
        int left= 0; // start row
        int right = arr.length-1; // end row
        int end = arr.length-1;

  while(start<=end && left<=right){
      for (int i = left; i<=right;i++){
          list.add(arr[start][i]);
      }
      start++;
      for (int i =start; i<=end;i++){
          list.add(arr[i][right]);
      }

      right--;

      if (start<=end) {
          for (int i = right; i >= left; i--) {
              list.add(arr[end][i]);
          }
      }

      end--;
      if(left<=right){
          for (int i = end; i>=start;i--){
              list.add(arr[i][left]);
      }
      }
      left++;
 }
        return list;
    }
}
