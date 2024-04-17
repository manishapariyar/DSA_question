import java.util.Arrays;

//https://leetcode.com/problems/wiggle-sort-ii/description/
public class WiggleSort {
    public static void main(String[] args) {
        int[] nums = {1,5,1,1,6,4};
        int[] sorted = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sorted); // Sort the array

        int n = nums.length;
        int mid = (n + 1) / 2; // Midpoint index for odd or even length

        // Rearrange elements into wiggle pattern
        int evenIdx = n - 1;
        int oddIdx = mid - 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                nums[i] = sorted[oddIdx];
                oddIdx--;
            } else {
                nums[i] = sorted[evenIdx];
                evenIdx--;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

}
