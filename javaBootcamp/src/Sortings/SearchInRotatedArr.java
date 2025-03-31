package Sortings;

public class SearchInRotatedArr {
    public static int rotateArr(int[] arr,int target, int start,int end ){

        while (start<=end){
            int mid = start + (end -start)/2;
            if ( arr[mid] == target){
                return mid;
            }
//            mid at line 1,
            if (arr[start]<= arr[mid] ){
                if (arr[start] <= target && target <= arr[mid]){
                   return rotateArr(arr,target,start,mid-1);
                }
                else {
                    return rotateArr(arr,target,mid+1,end);
                }
            } else {
                if (arr[mid]<= target && target <= arr[end]){
                    return rotateArr(arr,target,mid+1,end);
                }
                else {
                    return rotateArr(arr,target,start,mid-1);
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(rotateArr(arr,0,0,arr.length-1));

    }
}
