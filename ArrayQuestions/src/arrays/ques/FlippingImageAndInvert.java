package arrays.ques;

import java.util.Arrays;

//https://leetcode.com/problems/flipping-an-image/description/
public class FlippingImageAndInvert {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 1, 0, 0},
                {1, 0, 0, 1},
                {0, 1, 1, 1},
                {1, 0, 1, 0}
        };
        flipAndInvertImage(matrix);
        System.out.println(Arrays.deepToString(matrix));

    }
    public  static  int[][] flipAndInvertImage(int[][] image) {
        int[][] flippedImage =swap(image);;
        for (int i = 0; i <image.length ; i++) {
            for (int j = 0; j <image.length ; j++) {
                if(image[i][j] == 0){
                    image[i][j] = 1;
                }
             else {
                    image[i][j] =0;
                }
            }
        }
      return  flippedImage;
    }
    public static int[][] swap (int[][] matrix) {


        // Swap elements from start to end in the first row
        for (int i = 0; i <matrix.length; i++) {
            int start = 0;
            int end = matrix.length - 1;
            while (start < end) {
                // Swap elements at indices start and end
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                // Move indices towards the center
                start++;
                end--;
            }

        }

        return matrix;
    }

}
