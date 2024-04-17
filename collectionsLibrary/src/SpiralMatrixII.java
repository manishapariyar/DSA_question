import java.util.Arrays;
import java.util.Scanner;

public class SpiralMatrixII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int left = 0;
        int top = 0;
        int[][] list = new int[n][n];
        int right = list[0].length - 1;
        int bottom = list.length - 1;
        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {
                list[top][i] = input.nextInt();
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                list[i][right] = input.nextInt();
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    list[bottom][i] = input.nextInt();
                }
            }
            bottom--;
            if (left <= right) {

                for (int i = bottom; i >= top; i--) {
                    list[i][left] = input.nextInt();
                }
                left++;
            }
        }
        System.out.println(Arrays.deepToString(list));
    }
}
