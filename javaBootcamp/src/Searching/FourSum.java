package Searching;

import java.util.ArrayList;
import java.util.Arrays;

public class FourSum {
    public static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2};
        int target = 0;
        ArrayList<ArrayList<Integer>> res = fourSum(nums, target);
        for (ArrayList<Integer> quad : res) {
            System.out.println(quad);
        }

    }
    static ArrayList<ArrayList<Integer>> fourSum(int[] nums,int target){
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i <nums.length-3 ; i++) {
            if (i>0 && nums[i]==nums[i-1]) continue;
            for (int j = i+1; j <nums.length-2 ; j++) {
                if (j>i+1 && nums[j]==nums[j-1]) continue;
                int l = j+1;
                int r = nums.length-1;
                while(l<r){
                    long sum = (long)nums[i] + nums[j] + nums[l] + nums[r];
                    if (sum == target) {
                        ArrayList<Integer> quad = new ArrayList<>();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[l]);
                        quad.add(nums[r]);
                        list.add(quad);
                        l++;
                        r--;
                        while (l < r && nums[l] == nums[l - 1]) l++;
                        while (l < r && nums[r] == nums[r + 1]) r--;
                    } else if (sum < target) {
                        l++;
                    } else {
                        r--;
                    }
                }

            }

        }
        return list;
    }

}
