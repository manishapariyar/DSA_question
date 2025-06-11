package Strings;

public class ExMergeAlternately {
    public static void main(String[] args) {
        String word1 = "abcd";
        String word2 = "pq";
        StringBuilder merged = new StringBuilder();
        int i=0,j=0;
        while (i<word1.length()||j<word2.length()){
            if (i<word1.length()){
                merged.append(word1.charAt(i));
                i++;
            }
            if (j<word2.length()){
                merged.append(word2.charAt(j));
                j++;
        }
        }

        System.out.println(merged);

    }
}
