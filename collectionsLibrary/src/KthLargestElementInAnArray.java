import java.util.Arrays;

//https://leetcode.com/problems/kth-largest-element-in-an-array/description/
public class KthLargestElementInAnArray {
    public static void main(String[] args) {
       int[] nums = {3,2,3,1,2,4,5,5,6};
       int k =4;
         int temp;
        int kthlargest =0;
       int[] arr = new int[nums.length];
        for (int i = 0; i <nums.length ; i++) {

            for(int j = i+1; j< arr.length ; j++) {
                if (nums[i] > nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
            }



            for (int j = nums.length-1; j >( nums.length-1)-k;--j) {
                 kthlargest  = nums[nums.length-k];
            }
        System.out.println(kthlargest);






    }
}
