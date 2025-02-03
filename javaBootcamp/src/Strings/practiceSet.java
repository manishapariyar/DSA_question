package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class practiceSet {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        StringBuilder  input = new StringBuilder(sc.nextLine());
//          int count = 0;
//        for (int i = 0; i <input.length() ; i++) {
//            char ch = input.charAt(i);
//            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//                count++;
//            }
//
//        }
//        System.out.println("Number of lowercase vowels: " + count);
     anagrams();
    }
    public static void anagrams(){
        String s1 = "ca0re";
        String s2 = "rac8o";

        if(s2.length()== s1.length()){
            char[] characterS1 = s1.toCharArray();
            char[] characterS2 = s2.toCharArray();

            Arrays.sort(characterS1);
            Arrays.sort(characterS2);
            boolean result = Arrays.equals(characterS1,characterS2);
            if(result){
                System.out.println("yes");
            }else {
                System.out.println("nono");
            }
        }
    }
}
