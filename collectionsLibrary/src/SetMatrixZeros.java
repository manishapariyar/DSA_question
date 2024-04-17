import java.util.Arrays;

public class SetMatrixZeros {
    public static void main(String[] args) {
        int[][] matrix = {
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };


            int n = matrix.length;
            int m = matrix[0].length;
            boolean firstRow = false,firstCol = false;
            for (int i = 0; i <n; i++) {

                for (int j = 0; j < m; j++) {
                    if (matrix[i][j]==0) {
                        if(i==0) firstRow = true;
                        if (j==0) firstCol = true;
                        matrix[i][0] = 0;
                        matrix[0][j]= 0;
                    }
                }
            }
            for (int i = 1; i < n; i++) {
                for (int j = 1; j < m ; j++) {
                    if(matrix[i][j]!=0){
                        if(matrix[i][0]==0||matrix[0][j]==0){
                            matrix[i][j]=0;
                        }
                    }
                }

                if(firstRow){
                    for (int j = 0; j < m; j++) {
                        matrix[0][j]=0;

                    }
                }
                if (firstCol){
                    for (int j = 0; j <n; j++) {
                        matrix[i][0]=0;
                    }
                }

            }
            System.out.println(Arrays.deepToString(matrix));
        }

}
