package Searching;
import  java.util.Arrays;
public class ShipWithInDays {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1};
        int days = 4;
         int value  = binarySearch(nums,days);
        System.out.println(value + " value aalu");
    }
    static  int binarySearch(int[]nums,int days){
        int low = Arrays.stream(nums).max().getAsInt();;
        int high  = Arrays.stream(nums).sum();
        while (low<high){
            int mid = low+(high-low)/2;
            if (canShip(nums,days,mid)){
                high = mid;
            }else{
                low = mid+1;
            }
        }
        return low;
    }

    public static boolean canShip(int[]weights, int days,int capacity){
        int daysCount = 1;
        int currentLoad  =0;
        for (int weight: weights
             ) {
            if (currentLoad+weight>capacity){
                daysCount++;
                currentLoad = 0;
            }
            currentLoad += weight;
        }
        return daysCount <= days;
    }
}
