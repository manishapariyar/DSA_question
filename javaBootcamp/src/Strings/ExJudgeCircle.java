package Strings;
import java.util.Arrays;
import java.util.Objects;

public class ExJudgeCircle {
    public static boolean judgeCircle(String moves) {
        int x = 0  , y = 0;

        for (char  move: moves.toCharArray()
        ) {
            if (move == 'R') {
                x++;
            } else if (move == 'L') {
                x--;
            } else if (move == 'U') {
                y++;
            } else {
                y--;
            }
        }
        return x==0&&y==0;
    }
    public static String reverseWords(String s){
        String[] sc = s.split(" ");
       StringBuilder st = new StringBuilder();
        for (int i = 0; i<sc.length ; i++) {
                String word = sc[i];
            for (int j = word.length()-1; j >= 0 ; j--) {
                st.append(word.charAt(j));
            }
            if (i < sc.length - 1) {
                st.append(" ");
            }

        }
       return st.toString();
    }
    public static String convertToTitle(int columnNum){
        String result = "";
        int charValue;
        int remainder ;
         while(columnNum>0){
          remainder = (columnNum)%26;
          charValue = (char)(65 + remainder);
          result = charValue+result;
          columnNum -= 1;
         }
      int resultNum =  Integer.parseInt(result);
         return String.valueOf((char) resultNum) ;
    }
    public static int strStr(String haystack, String needle) {

        for(int i = 0, j=needle.length(); j<haystack.length();i++,j++ ){
            if(haystack.substring(i,j).equals(needle)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        String moves = "Let's take LeetCode contest";
        System.out.println(strStr("hello","ll"));
    }
}
