package searching;

public class CellingOfNumber {
    public static void main(String[] args) {
        int[] nums = {1,2,5,6,8,12};
        int target = 9;
        System.out.println(cellingOfNumber(nums,target));
     }
    public  static  int cellingOfNumber(int[] arr, int target) {
       if(target>arr[arr.length-1]){
           return -1;
       }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return arr[mid];
            }
        }
        return arr[start];
    }
}
