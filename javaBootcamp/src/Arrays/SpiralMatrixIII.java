package Arrays;

import java.util.Arrays;

public class SpiralMatrixIII {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 6;
        int rStart = 1;
        int cStart = 4;
        System.out.println(Arrays.deepToString(sprialMatrix(rows, cols, rStart, cStart)));
    }
    public static int[][] sprialMatrix(int rows, int cols, int rStart, int cStart){
        int[][] matrix = new int[0][0];
        int row = rows-1;
        int col = cols-1;
//        while (row<=col && rStart<=cStart ){
            for (int i = rStart; i <=col ; i++) {
                matrix[i][0] = matrix[rStart][i];
            }
//        }
        return matrix;
    }
}
