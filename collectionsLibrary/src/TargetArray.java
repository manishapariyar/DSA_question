import java.util.ArrayList;
import java.util.Arrays;

public class TargetArray {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        Integer[] targetArray =  createTargetArray(nums,index);
        System.out.println(Arrays.toString(targetArray));
    }
     public static Integer[] createTargetArray(int[] nums, int[] index) {
         int[] targetArray = new  int[nums.length];
         ArrayList<Integer> list = new ArrayList<>();
         for (int i = 0; i < nums.length ; i++) {
            list.add(index[i],nums[i]);
         }






        return  list.toArray(new Integer[0]);
    }
}
