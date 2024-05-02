package searching;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mySqrt = input.nextInt();
        int low = 0;
        int high = mySqrt;
        int ans = 0;
        while (low<=high){
            int mid = low +(high-low)/2;
            if (mid*mid<= mySqrt){
                ans = mid;
                low = mid+1;
            }
            else {
                high =  mid -1;
            }

        }

        System.out.println(ans);
    }
}
