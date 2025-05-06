package Searching;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaxFrequency {
//    Input: nums = [1,2,4], k = 5
//    Output: 3
//    Explanation: Increment the first element three times and the second element two times to make nums = [4,4,4].
//            4 has a frequency of 3.

    public static void main(String[] args) {
        int[] number = {1,2,4};
        int k = 5;
        System.out.println(maxFrequency(number,k));

    }
    public static int maxFrequency(int[] nums, int k){
        int maxFreq = 0;
        int start = 0;
        int end = 0;
        Arrays.sort(nums);
        long sum = nums[0];
        while(start< nums.length){
            if ((start-end+1)*nums[start]<k+sum){
                maxFreq = Math.max(maxFreq,start-end+1);
                start++;
                if (start<nums.length)sum+=nums[start];
            }else{
                sum-=nums[end];
                end++;
            }
        }
        return  maxFreq;
    }

    public static int bruteForce(int[] nums, int k){
        int max = 0;
        int start = 0;
        int total =0;
        for (int i = 0; i <nums.length ; i++) {
            while(i<nums.length && start>k){
                total = nums[i]-1;
                start++;
            }
            total = nums[i]+1;
            max = Math.max(max,start+i);
        }
        return max;
    }
    public static  boolean binarySearch(int[] nums,int target){

        Arrays.sort(nums);
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if (nums[mid]==target){
                return true;
            }
            if (nums[mid]<target){
                start++;
            }
            else {
                end--;
            }
        }



        return  false;
    }
}
