package Arrays;

public class MaxOfAscending {

    public static void main(String[] args) {
        int [] nums = {10,20,30,5,10,50};
        int sum = nums[0];
        int result = nums[0];
        for (int i = 1; i < nums.length ; i++) {
            if (nums[i]>nums[i-1]){
                sum += nums[i];

            }

           else {
                result = Math.max(result,sum);
                sum = nums[i];
            }

        }
        System.out.println("The result is"  + " " + Math.max(result,sum));
    }
}
