package searching;
//find the target element in sorted array.
public class BinarySearch {
    public static void main(String[] args) {
      int[] nums = {1,2,34,54,90,109,111,113};
      int target = 111;
        System.out.println(binarySearch(nums,target));
    }
    public static  int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start +(end-start)/2;
            if (arr[mid]<target){
                start = mid+1;
            }
            else if(arr[mid]>target) {
                end = mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
