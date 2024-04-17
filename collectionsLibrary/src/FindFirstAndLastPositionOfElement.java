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
}
