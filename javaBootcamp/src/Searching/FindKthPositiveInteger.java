package Searching;

import java.util.ArrayList;
import java.util.Arrays;

public class FindKthPositiveInteger {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        System.out.println(binarySearch(arr,5));
    }
    public  static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if (arr[mid]-(mid+1)>=target){
                end = mid-1;
            }
            else {

                start = mid+1;
            }
        }
        return start+target;
    }
}
