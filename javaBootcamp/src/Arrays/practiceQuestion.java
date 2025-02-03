package Arrays;

import java.util.Arrays;

public class practiceQuestion {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},
                {3,4,5,6},
            };
        int col = 4; int row = 2;
        int[][] temp = new int[col][row];
        for (int i = 0; i < row  ; i++) {
            for (int j = 0; j <col ; j++) {
                temp[j][i] = matrix[i][j];

            }
        }

        TransposeOFMatrix(temp);

    }

    public static int countTarget(int[][] arr, int target){
        int count = 0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == target){
                    count ++;
                }

            }

        }
        return count;
    }

    public static void sumOfSecondRow(int[][] matrix){
        int sum  = 0;
        for (int j = 0; j < matrix[0].length ; j++) {
                    sum += matrix[1][j];
        }
        System.out.println(sum);

    }

    public static void TransposeOFMatrix(int[][] num){


        for (int i = 0; i < num.length ; i++) {
            for (int j = 0; j <num[0].length ; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }

    }

}
