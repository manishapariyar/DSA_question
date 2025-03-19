package Recursion;

public class PrintValues {

    public static void printInc(int n) {
        if (n==1){
            System.out.print(n + " ");
            return;
        }
        printInc(n-1);
        System.out.print(n + " " );

    } public static void printDec(int n) {
        if (n==1){
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " " );
        printDec(n-1);


    }
    public  static  boolean isSorted(int[] arr, int i){
     if (i == arr.length-1){
         return  true;
     }
     if (arr[i]>arr[i+1]){
         return false;
     }
     return isSorted(arr,i+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,9 ,4,5};
        System.out.println(isSorted(arr,0));

    }
}
