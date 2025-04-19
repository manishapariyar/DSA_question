package Sortings;

public class IsPerfectSquare {
    public static void main(String[] args) {
        int num = 14;
        int i =1;
        int j = num;
        while(i<=j){
            int mid = i + (j-i)/2;
            if(mid*mid==num){
                System.out.println(mid);
            }
            else if(mid*mid<num){
                i = mid+1;
            }
            else{
                j= mid-1;
            }
        }
    }
}
