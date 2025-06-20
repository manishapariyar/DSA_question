package Strings;

public class ExPalindrome {
    public static void main(String[] args) {
        String str = "abca";
        int i = 0;
        int j = str.length()-1;
        while (i<j){
            if (str.charAt(i) != str.charAt(j)){
                System.out.println("its not palindrome");
            }
            i++;
            j--;
        }

    }

}
