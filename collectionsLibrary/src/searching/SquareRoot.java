package searching;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mySqrt = input.nextInt();
        int sqrt = 0;
        for(int i = 1; i<=mySqrt; i++){
            if(mySqrt%2==0){
                if(i*i == mySqrt){
                    sqrt = i;
                }
            }
        }

        System.out.println(sqrt);
    }
}
