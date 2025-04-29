package Searching;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaxFrequency {
//    Input: nums = [1,2,4], k = 5
//    Output: 3
//    Explanation: Increment the first element three times and the second element two times to make nums = [4,4,4].
//            4 has a frequency of 3.

    public static void main(String[] args) {
        int[] number = {3,9,6};
        int k = 2;
        System.out.println(maxFrequency(number,k));

    }
    public static int maxFrequency(int[] nums, int k){
        int maxFreq = 0;
        int start = 0;
        long total = 0;

        for (int i = 0; i < nums.length; i++) {
              total +=nums[i];
            while((long) nums[i]*(i-start+1)-total>k){
                total -= nums[start];
                start++;
            }
          maxFreq = Math.max(maxFreq,i-start+1);
        }
        return  maxFreq;
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
