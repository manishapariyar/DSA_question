import java.util.Arrays;

public class ShufffleTheArray {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7} ;
        int n = 3;
        int[] nums =  shuffleArray(arr,n);
        System.out.println(Arrays.toString(nums));
    }

    public static int[] shuffleArray(int[] arr , int n) {
        int[] nums = new  int[arr.length];
        int count = 0;
        for (int i = 0; i < n; i++) {
            nums[count] = arr[i];
            nums[count+1] = arr[i+n];
            count += 2;

        }

        return nums;
    }


}
