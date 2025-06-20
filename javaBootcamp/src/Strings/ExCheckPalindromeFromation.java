package Strings;

import java.util.Arrays;

public class ExCheckPalindromeFromation {
    public static boolean checkPalindrome(String a, String b){
        return check(a,b) || check(b,a);

    }
    public static boolean check(String a , String b ){
        int left = 0;
        int right = a.length()-1;
        while (left<right && a.charAt(left)==b.charAt(right)){
            left++;
            right--;
        }
        return isPalindrome(a,left,right) || isPalindrome(b,left,right);
    }
    public static boolean isPalindrome(String s, int left, int right){
        while(left<right){
            if (s.charAt(left)!= s.charAt(right)) return false;
            left++;
            right--;
        }
        return  true;
    }
    public static void main(String[] args) {
        String a = "x";
        String b = "y";
        System.out.println(checkPalindrome(a,b));








    }
}
