package stringsQuestion;

import java.util.Locale;

//https://leetcode.com/problems/remove-palindromic-subsequences/description/
public class RemovePalindromicSubsequences {
    public static void main(String[] args) {
        String str = "abaaa";
       System.out.println( checkSteps(str));
    }

    public static int checkSteps(String s) {
       if (s.length()==0)  return 0;

       if (isPalindrome(s)){
           return 1;
       }
       else{
           return 2;
       }

    }
    static  boolean isPalindrome(String str){
        if (str ==null || str.length()==0){
            return true;
        }
        str = str.toLowerCase();
        for (int i = 0; i <str.length(); i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);
            if (start != end) return  false;
        }
        return  true;
    }

}
