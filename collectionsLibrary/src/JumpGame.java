

//https://leetcode.com/problems/jump-game/
public class JumpGame {
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
