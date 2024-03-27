import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
//        HalfPyramid();
//        SquareHollow();
//        FullPyramid();
//        ZeroOneTriangle();
 RhombusPattern();
    }
    public static void HalfPyramid() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    public static void SquareHollow() {

        int n = 4;
        for (int i = 0; i <n; i++) {

            for (int j = 0; j < n; j++) {
               if( i==0 || i==n-1 || j==0 || j==n-1){
                   System.out.print("* ");
               }
               else {
                   System.out.print("  ");
               }
            }
            System.out.println();
        }
    }
    public static void FullPyramid() {

        int n = 4;
        for (int i = 0; i <n; i++) {
            for (int j = n; j>i; j--) {
                System.out.print(" ");
            }
            for (int j= 0; j<i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

     public static void ZeroOneTriangle(){
        int n= 4;
         for(int i=1; i<=n; i++){
             for (int j=1; j<=i; j++){
                 if ((i+j)%2==0){
                     System.out.print("1");
                 }
                 else {
                     System.out.print("0");
                 }
             }
             System.out.println();
         }
     }

    public static void RhombusPattern() {

        int n = 4;
        for (int i = 0; i <n; i++) {

            for (int j= 0; j<i ; j++){
                System.out.print(" ");
            }
            for (int j= 0; j<n ; j++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
