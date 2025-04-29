package Searching;

public class FindPeakGrid {

    static  int findMax(int[][] mat, int col){
        int maxRow = 0;
        for (int i = 0; i <mat.length ; i++) {
            maxRow = mat[i][col]>= mat[maxRow][col]?i :maxRow;
        }
        return  maxRow;
    }
    public static int[] findPeak(int[][] mat){
        int left = 0;
        int right = mat[0].length - 1;

        while(left<=right){
            int midCol = left + (right-left)/2;
            int maxRow = findMax(mat,left);
            boolean isLeftBetter = midCol-1>=0&&mat[maxRow][midCol-1]>mat[maxRow][midCol];
            boolean isRigthBetter = midCol+1<=mat[0].length && mat[maxRow][midCol+1]>mat[maxRow][midCol];

            if(!isLeftBetter && !isRigthBetter){
                return new int[]{maxRow, midCol};
            }else if(isRigthBetter) {
                left = midCol+1;
            }else {
                right = midCol-1;
            }
        }
        return new int[] {-1,-1};


    }
    public static void main(String[] args) {
        int[][] input = {{10,20,15},
                {21,30,14},
                {7,16,32}};
        int[] peak = findPeak(input);
        System.out.println("Peak found at: (" + peak[0] + ", " + peak[1] + ") = " + input[peak[0]][peak[1]]);
    }
}
