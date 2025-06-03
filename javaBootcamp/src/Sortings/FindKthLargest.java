package Sortings;

public class FindKthLargest {
    public  static int findKthLargest(int[] nums, int k) {
        int temp;
        int kthlargest =0;
        for (int i = 0; i <nums.length ; i++) {

            for(int j = i+1; j<nums.length ; j++) {
                if (nums[i] > nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }



        for (int j = nums.length-1; j >( nums.length)-k;--j) {
            kthlargest  = nums[nums.length-k];
        }
        return kthlargest;
    }
    public static void main(String[] args) {
        int[] num = {3,2,1,5,6,4};
        int k = 2;
        System.out.println( findKthLargest(num,k));
    }
}
