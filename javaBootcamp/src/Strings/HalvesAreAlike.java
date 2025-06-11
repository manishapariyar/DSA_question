package Strings;

import java.util.Arrays;

public class HalvesAreAlike {
    public static void main(String[] args) {
        String input = "textbook";
        String sb1 = input.substring(0,input.length()/2);
        String sb2 = input.substring(input.length()/2);
        System.out.println(sb1 + " " + sb2);
        int countA=0;
        int countB=0;
        for (int i = 0; i <sb1.length() ; i++) {
            if (sb1.charAt(i) == 'a'||sb1.charAt(i) == 'e'|| sb1.charAt(i) == 'i'||sb1.charAt(i) == 'o'||sb1.charAt(i) == 'u'){
                countA++;
            }
        }  for (int i = 0; i <sb2.length() ; i++) {
            if (sb2.charAt(i) == 'a'||sb2.charAt(i) == 'e'|| sb2.charAt(i) == 'i'||sb2.charAt(i) == 'o'||sb2.charAt(i) == 'u'){
                countB++;
            }
        }
        if (countA==countB){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
