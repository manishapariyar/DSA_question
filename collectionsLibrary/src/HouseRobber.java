public class HouseRobber {
    public static void main(String[] args) {
        int[] nums = {2,7,9,3,1};
        int i= 0;
        int j = nums.length-1;
        int sum =0;
        while (i<= j){
           sum += nums[i];

            i+=2;
        }
        System.out.println(sum);
    }
}
