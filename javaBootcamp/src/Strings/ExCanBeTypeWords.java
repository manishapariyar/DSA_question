package Strings;

import java.util.Arrays;
import java.util.Objects;

public class ExCanBeTypeWords {
    public static void main(String[] args) {
        String text = "Hello world";
        String brokenLetter = "ad";
        int count = 0;
        String[] split = text.split(" ");
        System.out.println(Arrays.toString(split));

        for (String word: split
             ) {

            boolean canType = true;
            for (int i = 0; i < brokenLetter.length(); i++) {
                if (word.toLowerCase().contains(String.valueOf(brokenLetter.charAt(i)))) {
                    canType = false;
                    break;
                }

            }
            if (canType) {
                count++;
            }
        }
        System.out.println(count);
    }
}
