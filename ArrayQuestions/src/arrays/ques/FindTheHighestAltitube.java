package arrays.ques;

import java.util.Arrays;
import java.util.Scanner;

//https://leetcode.com/problems/find-the-highest-altitude/
public class FindTheHighestAltitube {
    public static void main(String[] args) {
      int[] arr = {-5,1,5,0,-7};
      int num = largestAltitude(arr);
        System.out.println(num);

    }
    public  static int largestAltitude(int[] gain)
    {
        int max = 0;
        int current =0;

        for (int i = 0; i < gain.length ; i++) {
             current += gain[i];
            if(max<current){
                max= current;
            }
        }
        return max;
    }

    //https://leetcode.com/problems/kth-largest-element-in-an-array/description/
    public static class KthLargestElementInAnArray {
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

    public static class ProductOfArrayExceptSelf
    {
        public static void main(String[] args) {
            int[]  array = {1,2,3,4};
            int[] letfProduct = new int[array.length];
            int[] rightProduct = new int[array.length];
            int[]  ans = new int[array.length];
            letfProduct[0] =1;
            for (int i = 1; i < array.length ; i++) {
                letfProduct[i] = array[i-1]*letfProduct[i-1];
            }
            rightProduct[array.length-1]=1;
                for (int i = array.length -2; i >=0 ; i--){
                rightProduct[i] = array[i+1]*rightProduct[i+1];
            }for (int i = 0; i < array.length ; i++) {
                ans[i] = rightProduct[i]*letfProduct[i];
            }

            System.out.println(Arrays.toString(ans));
            System.out.println(Arrays.toString(productExceptSelf(array)));
        }
        public  static  int[] productExceptSelf(int[] array) {
            int n = array.length;
            int[] ans = new int[n];

            // Calculate left products and store in the result array `ans`
            int leftProduct = 1;
            for (int i = 0; i < n; i++) {
                ans[i] = leftProduct;
                leftProduct *= array[i];
            }

            // Calculate right products and update the result array `ans`
            int rightProduct = 1;
            for (int i = n - 1; i >= 0; i--) {
                ans[i] *= rightProduct;
                rightProduct *= array[i];
            }

            return ans;
        }
    }

    public static class RichestCustomerWealth {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
        int[][] accounts = new int[3][3];
            for (int i = 0; i < accounts.length ; i++) {
                for (int j = 0; j < accounts.length ; j++) {
                    accounts[i][j] = input.nextInt();
                }}
            int max = maximumWealth(accounts);
            System.out.println( "the richest person value is " + max);
        }
        public  static  int maximumWealth(int[][] accounts){

            int ans = Integer.MIN_VALUE;
            for (int person = 0; person<accounts.length  ; person++) {
                int sum = 0;
                for (int account = 0; account < accounts[person].length ; account++) {
                   sum = accounts[person][account];
                }
                if(sum>ans){
                    ans = sum;
                }
            }
            return  ans;
        }
    }
}
