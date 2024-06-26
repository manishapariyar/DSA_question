import java.util.Scanner;

class PrintPatterns {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
//         rightHalfPyramid();
//         reverseRightHalfPyramid();
         leftHalfPyramid(n);
     }

     public  static  void rightHalfPyramid(int n){
         for (int i = 0; i < n ; i++) {
             for (int j = 0; j <= i; j++) {
                 System.out.print("*");
             }
             System.out.println();
         }

     }

     public  static void  reverseRightHalfPyramid(int n){
         for (int i = 0; i < n ; i++) {
             for (int j = n; j >=i; j--) {
                 System.out.print("*");
             }
             System.out.println();
         }
     }
     public  static void  leftHalfPyramid(int n ){
         for (int i = 0; i < n; i++) {
             for (int j = n; j >=i; j--) {
                 System.out.print(" ");
             }
             for (int j = 0; j<=i; j++) {
                 System.out.print("*");
             }
             System.out.println();
         }
     }


}
