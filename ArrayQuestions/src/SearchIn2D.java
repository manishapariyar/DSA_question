import java.util.Scanner;

class SearchIn2D {
     public static void main(String[] args) {

         int [][] ar = ArrayUtility.input2DArrays();
         Scanner in = new Scanner(System.in);
         System.out.println("Enter searching number");
         int num = in.nextInt();
         boolean isFound = search(ar, num);
         if (isFound){
             System.out.println("the number is found");
         }
         else {
             System.out.println("Number isn't exist");
         }

     }
     public static  boolean search(int[][] numArr,int n){
         for (int i = 0; i < numArr.length; i++) {
             for (int j = 0; j < numArr.length; j++) {
                 if(n==numArr[i][j]){
                     return true;
                 }
             }
         }
         return false;
     }
}
