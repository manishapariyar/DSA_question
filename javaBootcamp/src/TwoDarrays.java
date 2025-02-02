import java.util.Arrays;

public class TwoDarrays {
    public  static  boolean xMatrix(int[][] matrix){

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j && i + j == matrix.length - 1) {
                    if (matrix[i][j] == 0) {
                        return false;
                    }

                } else {
                    if (matrix[i][j] != 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {10,20,33},
                {21,33,35},
                {34,45,50}};
        System.out.println( searchInMatrix(matrix, 580));


    }
    public static boolean searchInMatrix(int[][] array,int target){
        int row = 0;
        int col = array.length-1;
        while (row< array.length && col >= 0){
            if (array[row][col] == target ) {
                System.out.println("target found at" + "(" + row + " " + col + ")");
                return true;
            }else if (target<array[row][col]){
                col--;
            }
            else {

                row++;
            }

        }
        System.out.println("target not found");
        return false;
    }
    public static  void diagonalMatrix(int[][] matrix){
        int sum = 0;
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix.length ; j++) {
                if(i==j){
                    sum += matrix[i][j];
                }
                 else if (i+j == matrix.length-1){
                    sum += matrix[i][j];
                }
            }

        }
        System.out.println(sum);
    }

    static boolean containAllValue(int[][] mat){
        for (int i = 0; i <mat.length ; i++) {
              boolean[] rowVisit = new boolean[mat.length+1];
              boolean[] colVisit = new boolean[mat.length+1];
            for (int j = 0; j < mat.length ; j++) {
                int rowVal = mat[i][j];
                int colVal = mat[j][i];
                if (rowVisit[rowVal] || colVisit[colVal] || rowVal<mat.length || colVal < mat.length  || colVal >1){
                    return false;
                }
                rowVisit[rowVal] = true;
                colVisit[colVal] = true;
            }

        }
        return  true;
    }
    public static void spiralArray(int[][] arr){
        int startRow = 0;
        int endRow = arr.length-1;
        int startCol = 0;
        int endCol = arr[0].length-1;
       while(startRow<=endRow && startCol<= endCol){
           for (int i = startCol; i <=endCol; i++) {
               System.out.print(arr[startRow][i] + " ");

           }
           startRow++;
           for (int i = startRow; i <=endRow; i++) {
               System.out.print(arr[i][endCol] + " ");
           }
           endCol--;
          if(startCol<=endCol){
              for (int i =endCol; i >= startCol; i--) {
                  System.out.print(arr[endRow][i] + " ");
              }
              endRow--;
          }

           if (startCol <= endCol) {
               for (int i = endRow; i >= startRow; i--) {
                   System.out.print(arr[i][startCol] + " ");
               }
               startCol++;
           }

       }
    }
}
