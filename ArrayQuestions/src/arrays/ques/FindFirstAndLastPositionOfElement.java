package arrays.ques;

import java.util.Arrays;

public class FindFirstAndLastPositionOfElement {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] ans = {-1,-1};
        int start = PositionOfElement( nums, target, true);
        int end = PositionOfElement( nums, target, false);

        ans[0] = start;
        ans[1] = end;
        System.out.println(Arrays.toString(ans));
    }
    static  int PositionOfElement(int[]nums, int target,boolean findStartEnd){
        int start = 0;
        int end = nums.length-1;
        int ans = -1;
        while(start<=end){
            int mid = start +(end-start)/2;

            if(nums[mid]<target){
                end = mid-1;
            } else if (nums[mid]>target)
            start = mid+1;
            else{
                ans = mid;
                }
            if (findStartEnd){
                end = mid-1;
            }
            else start = mid+1;
            }

        return ans;
    }

    //https://leetcode.com/problems/rotate-array/description/
    public static class RotateArray {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5, 6, 7};
             int k = 3;
    //         k = k%arr.length;
            reverse(arr,0,arr.length-1);
            reverse(arr,0,k-1);
            reverse(arr,k,arr.length-1);



            System.out.println(Arrays.toString(arr));
        }
        public  static int swap(int[] arr,int i,int j){
            int swap = arr[i];
            arr[i] = arr[j];
            arr[j] = swap;
            return  swap;
        }  public  static void reverse(int[] arr,int i,int j){
            while(i<j){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
    }
}
