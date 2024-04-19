package arrays.ques;

import java.util.Scanner;

//https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/description/
public class CellsWithOddValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m =  input.nextInt();
        int[][] indices = {
                {0,1},
                {1,1}
        };
        int oddValue =  oddCells(m,n,indices);
        System.out.println(oddValue);

    }
    public static int oddCells(int m, int n, int[][] indices) {

     int[][] increasedMatrix = new  int[m][n];

        for (int i = 0; i < indices.length; i++) {
            int[] pair = indices[i]; // Get the current pair at index i
            int ri = pair[0];
            int ci = pair[1];
            for (int j = 0; j <n; j++) {
                increasedMatrix[ri][j] ++;
            }
            for (int j = 0; j < m; j++) {
                increasedMatrix[j][ci] ++;
            }
        }
        int count = 0;
        for (int i = 0; i < increasedMatrix.length ; i++) {
            for (int j = 0; j < increasedMatrix[0].length; j++) {
                if(increasedMatrix[i][j]%2 !=0){
                    count ++;
                }
            }
        }
        return count;
    }

    //https://leetcode.com/problems/jump-game/
    public static class JumpGame {
        public static void main(String[] args) {
            int[] array = {1,1,2,5,2,1,0,0,1,3};
            System.out.println(canJump(array));
        }

        public static boolean canJump(int[] nums) {


             int finalPostion = nums.length-1;
            for (int i = nums.length-2; i >=0 ; i--) {

                if (i+nums[i]>=finalPostion){
                    finalPostion = i;
                }
                }

          return finalPostion==0;

        }
    }

    public static class HouseRobber {
        public static void main(String[] args) {
            int[] nums = {2,7,9,3,1};
            int i= 0;
            int j = nums.length-1;
            int sum =0;
            while (i<= j){
               sum += nums[i];

                i+=2;
            }
            System.out.println(sum);
        }
    }
}
