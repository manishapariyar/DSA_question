package searching;

public class InfiniteArray {
    public static void main(String[] args) {
      int[] arr = {3,5,6,7,8,10,90,100,130,140,160,170};
       int target = 100;
//       int ans = ans(arr,target);
        System.out.println(ans(arr,target));
    }
    static  int ans(int[] arr, int target){
      int start = 0;
      int end = 1;
      // condition for the target to lie in the range
        while(target>arr[end]){
            int newStart = end+1;
//            double the box size means tyo array lai tesko lenth vanda double garuni
            //end = previous end + sizeofbox*2;
             end = end+ (end - start +1)*2;
             start = newStart; // newStart like temp value
        }
        return  binarySearch(arr,target,start,end);
    };
    public static  int binarySearch(int[] arr, int target ,int start, int end){

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
