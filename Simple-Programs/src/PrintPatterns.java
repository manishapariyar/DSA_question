 class PrintPatterns {
     public static void main(String[] args) {
//         rightHalfPyramid();
//         reverseRightHalfPyramid();
         leftHalfPyramid();
     }

     public  static  void rightHalfPyramid(){
         for (int i = 0; i < 5 ; i++) {
             for (int j = 0; j <= i; j++) {
                 System.out.print("*");
             }
             System.out.println();
         }

     }

     public  static void  reverseRightHalfPyramid(){
         for (int i = 0; i < 5 ; i++) {
             for (int j = 5; j >=i; j--) {
                 System.out.print("*");
             }
             System.out.println();
         }
     }
     public  static void  leftHalfPyramid(){
         for (int i = 0; i < 5 ; i++) {
             for (int j = 5; j >=i; j--) {
                 System.out.print(" ");
             }
             for (int j = 0; j<=i; j++) {
                 System.out.print("*");
             }
             System.out.println();
         }
     }


}
