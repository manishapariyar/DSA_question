package Searching;
import  java.util.Arrays;
public class FindDuplicate {
    public static void main(String[] args) {
        int val = 0;
        int[] nums = {1,3,4,2,2};
        Arrays.sort(nums);
        val =  binarySearch(nums);
        System.out.println(val);
    }
    public  static  int binarySearch(int[]nums){
        int start = 0;
        int i = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            for (int num:nums
            ) {
                if (num<=mid){
                    i++;
                }
            }
            if(nums[mid]>=i){
                start = mid+1;
            }else{
                end = mid-1;
            }

        }
        return nums[start];
    }
}
