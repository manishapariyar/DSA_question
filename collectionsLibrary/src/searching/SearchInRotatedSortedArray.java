package searching;

public class SearchInRotatedSortedArray  {
    public static void main(String[] args) {
      int[] nums = {4,5,6,7,0,1,2};
      int target =0;
      int pivot = findPivot(nums);
        System.out.println(pivot);
    }
    public  static  int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return  mid;
            }if(arr[mid]<arr[mid-1]){
                return  mid-1;
            }
            if (arr[mid]<=arr[start]){
                end = mid-1;
            }if (arr[mid]>arr[start]){
                start= mid+1;
            }
        }
        return -1;
    }
    static int search(int[] arr, int target){
        int pivot = findPivot(arr);
//        if pivot is not found,it means arr is not rotated;
         if (pivot == -1){
         return  binarySearch(arr,target,0,arr.length-1);
         }
         if (arr[pivot] == target){
             return pivot;
         }
       if (target>= arr[0]){
           return binarySearch(arr,target,0,pivot-1);

       }
       return binarySearch(arr,target,pivot+1,arr.length-1);
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
