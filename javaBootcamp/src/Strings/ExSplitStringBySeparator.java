package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExSplitStringBySeparator {
    public static List<String> splitString(String[] words, char sep){
        var res = new ArrayList<String>();
        for (var w : words) {
            var left = 0;
            var len = w.length();
            for (var right = 0; right < len; right++) {
                if (w.charAt(right) == sep) {
                    if (right - left > 0)
                        res.add(w.substring(left, right));
                    left = right + 1;
                }
            }
            if (len - left > 0)
                res.add(w.substring(left, len));
        }

        return res;
    }
    public static void main(String[] args) {
        String[] words = {"one.two.three","four.five","six"};
        char separator = '.';
        System.out.println(splitString(words,separator) );

    }
}
