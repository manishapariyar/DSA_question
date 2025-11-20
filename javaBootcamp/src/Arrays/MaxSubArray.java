package Arrays;

public class MaxSubArray {

    public static int maxSubArray(int[] arr){
        int maxSum = Integer.MIN_VALUE;
//        int currSum = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {

               int   currSum = 0;
                for (int k = i; k <=j ; k++) {
                    currSum += arr[k];
                }
                if (maxSum<currSum){
                    maxSum = currSum;
                }
            }

        }


        return maxSum;

    }
    // kadane's algorithm
    public  static int maxSub(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int currSum =0;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if (currSum>maxSum){
                maxSum = currSum;
            }
            if (currSum<0){
                currSum = 0;
            }

        }
        return maxSum;


    }
    public static void main(String[] args) {
        int[] arr = {-1};
        System.out.println(maxSubArray(arr));
        System.out.println(maxSub(arr));
    }
}
