import java.util.Arrays;

class PalindromeOrNot {

     public static void main(String[] args) {
          int[] array = ArrayUtility.inputArrays();
          boolean isPalindrome = palindromeOrNot(array);
         if(isPalindrome) {
              System.out.println("the given array is palindrome");
         }
         else {
              System.out.println("the give number is not palindrome");
         }
     }

     public static boolean palindromeOrNot(int[] ar) {
          int[] copyArr =  new int[ar.length];
          for (int i = 0; i <ar.length/2 ; i++) {
               int swap = ar[i];
               ar[i] = ar[(ar.length - 1) - i];
               ar[(ar.length - 1) - i] = swap;
          }
          for(int i = 0; i <ar.length; i++) {
          copyArr[i] = ar[i];
          }
          System.out.println(Arrays.toString(copyArr));
          for (int i = 0; i < ar.length ; i++) {
               if(copyArr[i] == ar[i]){
                    return true;
               }
          }
        return false;
     }


}
