package Arrays;

import java.util.Arrays;

public class SpiralMatrixII {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(Arrays.deepToString(spiralMatrix(n)));
    }

    public static int[][] spiralMatrix(int n) {
        int start = 0;
        int end = n - 1;
        int left = 0;
        int right = n - 1;
        int[][] matrix = new int[n][n];
        int num = 1;
        while (start<=end && left<=right){
        for (int i = left; i <= right; i++) {
            matrix[left][i] = num++;
        }
        start++;
        for (int i = start; i <= end; i++) {
            matrix[i][right] = num++;
        }
        right--;

        if (start <= end) {
            for (int i = right; i >= left; i--) {
                matrix[end][i] = num++;
            }
        }
        end--;
        if (right <= end) {
            for (int i = end; i >= start; i--) {
                matrix[i][left] = num++;
            }
        }
        left++;
    }


        return matrix;
    }
}
