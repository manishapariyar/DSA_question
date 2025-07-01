package DailyQuestion;
public class ReverseVowels {
    public static void main(String[] args) {
        String s = "leetcode";
       StringBuilder list = new StringBuilder();
        for (int i = 0; i < s.length() ; i++) {
            char ch = s.charAt(i);
           if (isVowel(ch)){
               list.append(ch);
           }
        }
        list.reverse();
        StringBuilder result = new StringBuilder(s);
        int vowelIndex = 0;
        for (int i = 0; i < result.length() ; i++) {
            if (isVowel(result.charAt(i))){
                 result.setCharAt(i,list.charAt(vowelIndex));{
                     vowelIndex++;
                }
            }
        }
        System.out.println(result.toString());
    }
    public static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
}
