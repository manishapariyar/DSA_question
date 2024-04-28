package stringsQuestion;

import java.util.Arrays;

public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i <26 ; i++) {
           char ch = (char) ('a' + i);
           builder.append(ch);

        }
        System.out.println(builder.reverse());
        String name = "manishaPariyar";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toUpperCase());
        System.out.println(name.indexOf('a'));
    }

}
