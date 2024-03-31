import java.util.Arrays;
import java.util.Scanner;

class DeletingFromArray {
     public static void main(String[] args) {
         int[] array = ArrayUtility.inputArrays();
         Scanner input  = new Scanner(System.in);
         System.out.println("input element which you want to eliminate");
         int n = input.nextInt();
         int[] theResultArray = deletingTheElement(array,n);
         System.out.println("The Array after Deleting element" + Arrays.toString(theResultArray));
     }
 public static int[] deletingTheElement(int[] array,int n){
     int occur = occurrence(array, n);
     System.out.println(occur);
     if (occur == 0) {
         return array; // Return original array if element not found
     }
     int newSize = array.length - occur;
     int[] newArray = new int[newSize];
     int j = 0;
     for (int i = 0; i < array.length; i++) {
         if (array[i] != n) {
             newArray[j] = array[i];
             j++;
         }
     }
     return newArray;
     }

     public  static  int occurrence(int[] array, int n){
         int occur = 0;
         for (int j : array) {
             if (j == n) {
                 occur++;
             }
         }
         return  occur;
     }
 }
