import java.util.Arrays;

public class SortColor {
    public static void main(String[] args) {
        int[] nums = {2,0,1,2,0,1};
        int low=0;
        int mid=0;
        int high=nums.length-1;
        while(mid<=high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    public  static int swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return  temp;
    }
}
