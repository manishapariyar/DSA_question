package searching;
//find position of an element in a sorted array of infinite numbers
public class FindPositionOfElement {
    public static void main(String[] args) {
        int[] nums = {3,5,7,9,10,100,120,140,160,170};
        int target = 100 ;
        System.out.println(findingRange(nums,target));
    }
    static int findingRange(int[] arr, int target ){
        int start =0;
        int end = 1;
        // condition for the target to lie in the range
        while(target > arr[end]){
            int newStart = end + 1;
            // double the box value
            end = end+(end-start+1)*2;
            start = newStart;
        }
        return  binarySearch(arr,target,start,end);
    }
    public static  int binarySearch(int[] arr, int target,int start,int end){

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
