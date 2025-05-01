package Arrays;

import java.util.Arrays;


public class MinPairSum {
    static  int minPairSum(int[] nums){
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int start = 0;
        int end = nums.length-1;
        int maxPair = 0;

        while(start!=end){
           maxPair =   Math.max(maxPair,nums[start]+nums[end]);
           if (start<=end){
               start++;
           }if(start<end){
               end--;
           }
        }
        return maxPair;
    }
    public static void main(String[] args) {
        int[] input = {3,5,2,3};
        System.out.println(minPairSum(input));

    }
}
