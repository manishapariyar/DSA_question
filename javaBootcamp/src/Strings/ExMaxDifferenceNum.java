package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExMaxDifferenceNum {
    public static void main(String[] args) {
        String s = "110";
        int k = 3;
        int maxDiff =-1;
        List<String> substrings = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + k; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                 substrings.add(sub);
                int[] freq = new int[10];
                for ( char c: sub.toCharArray()
                ){
                    freq[c - '0']++;
                }
                for (int a = 0; a < 10; a++) {
                    if (freq[a] % 2 == 1) { // odd
                        for (int b = 0; b < 10; b++) {
                            if (freq[b] % 2 == 0 && freq[b] != 0) { // even and non-zero
                                int diff = freq[a] - freq[b];
                                maxDiff = Math.max(maxDiff, diff);
                            }
                        }
                    }
                }
            }
        }

        System.out.println(maxDiff);





    }

}
