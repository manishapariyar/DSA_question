package Sortings;

import java.util.Arrays;

public class ThirdMaxEx {
    public static void main(String[] args) {
        int[] nums = {-100,-98,4,3,2,-1};
//        System.out.println(thirdMax(nums));
        System.out.println(thirdMaxProduct(nums));


    }
    public static int thirdMax(int[] nums){
        Arrays.sort(nums);
        int count = 1;
        int last = nums[nums.length-1];

        for (int i = nums.length-2; i >=0  ; i--) {
            if (nums[i]!=last){
                count++;
                last = nums[i];
                if (count==3){
                    return nums[i];
                }
            }

        }
        return nums[nums.length-1];
    }
    public static  int thirdMaxProduct(int[] nums){
//        Arrays.sort(nums);
//        int count = 3;
//        int lastIndex = nums.length-1;
//        int max = 1;
//        while(count>0){
//
//            max *=nums[lastIndex];
//            lastIndex--;
//            count--;
//
//        }
//        return max;
        Arrays.sort(nums);
        int n = nums.length;

// Two possibilities
        int product1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int product2 = nums[0] * nums[1] * nums[n - 1];

        return Math.max(product1, product2);
    }
}
