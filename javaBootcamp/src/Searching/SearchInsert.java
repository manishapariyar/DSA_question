package Searching;

public class SearchInsert {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 7;
        int start= 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start+ (end-start)/2;
            if (nums[mid]==target) {
                System.out.println(mid);
            }
            if (nums[mid]<target){
                start= mid+1;
            }
            else{
                end = mid-1;
            }

        }
        System.out.println(start);

    }
}
