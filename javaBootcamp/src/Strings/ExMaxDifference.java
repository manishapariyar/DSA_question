package Strings;

import java.util.Arrays;

public class ExMaxDifference {
    public static void main(String[] args) {
        String input = "abcabcab";
        int[] freq = new int[26];
        int maxDiff = Integer.MIN_VALUE;
        for (int i = 0; i <input.length() ; i++) {
            char ch = input.charAt(i);
            freq[ch-'a']++;
        }
        for (int i =0; i<freq.length;i++) {
           if (freq[i]%2==1){
               for (int j = 0; j <freq.length ; j++) {
                    if (freq[j]%2==0 && freq[j]!=0){
                        int diff = freq[i]-freq[j];
                        maxDiff = Math.max(maxDiff,diff);
                    }
               }
             }

        }
        System.out.println(maxDiff);
    }
}
