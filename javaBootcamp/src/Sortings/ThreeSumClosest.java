package Sortings;

import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
         int[] result = new int[nums.length];
         result[0] = nums[0];
         result[1] = Math.max(nums[0],nums[1] );

        for (int i = 2; i <nums.length ; i++) {
            result[i] = Math.max(result[i-1],nums[i]+result[i-2]);
        }
        System.out.println(result[nums.length-1]);
        }
}
