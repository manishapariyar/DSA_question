package Arrays;

public class TwiceInArray {
    public static void main(String[] args) {
        int[] arr = {1,3,2,4};
        System.out.println(rotatedArray(arr,4));

    }

    public static boolean twiceNumber(int[] nums ) {
        for (int i = 0; i < nums.length ; i++) {
            for (int j = i+1; j < nums.length; j++) {

                if(nums[i]==nums[j]){
                    return true;
                }
            }

        }

        return  false;

    }


    public static int rotatedArray(int[] n, int target) {
       int start = 0;
       int end = n.length-1;
        while(start<=end){
            int min = start +(end-start)/2;
            if (n[min] < target) {
                start = min+1;

            }  if(n[min]>target){
                end = min-1;
            }
            else {
                return min;
            }
        }


        return -1;
    }
}
