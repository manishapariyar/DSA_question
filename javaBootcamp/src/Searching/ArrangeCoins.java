package Searching;

public class ArrangeCoins {
    public static void main(String[] args) {
        int n = 1804289383;
         int rowCount =0;
         int start = 1;
         int end = n;
         while(start<=end){
             int mid = start+(end-start)/2;
             long coin = ((long) mid * (mid + 1)) / 2;
             if (coin<=n){
                 start= mid+1;
                 rowCount = Math.max(mid,rowCount);
             }
             else{
                 end = mid-1;

             }

         }
        System.out.println(start-1);
    }
}
