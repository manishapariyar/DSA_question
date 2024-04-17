import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//https://leetcode.com/problems/spiral-matrix-iii/description/
public class SpiralMatrixIII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] Arrlist = spiralOrder( matrix ,rows,cols);
        System.out.println(Arrays.deepToString(Arrlist));
    }

    public static  int[][] spiralOrder(int[][] matrix,int rows,int cols){
        int startRow = 0;
        int startCol = 0;

        return new int[][]{};
    }
}
