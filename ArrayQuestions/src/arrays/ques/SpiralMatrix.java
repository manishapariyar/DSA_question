import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        List<Integer> Arrlist = spiralOrder(matrix);
        System.out.println(Arrlist);
    }


    public static List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int left = 0;
        int top = 0;
        int right = matrix[0].length-1;
        int bottom = matrix.length-1;

        while (top<=bottom && left <= right){

            for (int i = left; i <=right ; i++) {
                list.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <=bottom ; i++) {
                list.add(matrix[i][right]);
            }
          right--;
            if (top<=bottom){
                for (int i = right; i>=left; i--) {
                    list.add(matrix[bottom][i]);
                }
            }
            bottom--;
           if(left<=right){

               for (int i = bottom; i >= top ; i--) {
                   list.add(matrix[i][left]);
               }
               left++;
           }

        }




        return list;
    }

}
