package Searching;

public class SpecialArray {
    // https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/
    public static void main(String[] args) {
        int[] nums = {0, 0};

        int result = findSpecialNumber(nums);
        System.out.println(result);
    }

    public static int findSpecialNumber(int[] nums) {
        int n = nums.length;

        for (int x = 0; x <= n; x++) {
            int count = 0;

            // count how many elements are >= x
            for (int num : nums) {
                if (num >= x) {
                    count++;
                }
            }

            // if exactly x elements are >= x
            if (count == x) {
                return x;
            }
        }

        // if no such x found
        return -1;
    }
}
