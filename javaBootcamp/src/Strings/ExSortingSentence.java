package Strings;

public class ExSortingSentence {
    public static void main(String[] args) {
        String input = "Myself2 Me1 I4 and3";
        String[] words = input.split(" ");
        String[] result = new String[words.length];
        for (String word: words
             ) {
          String text = word.substring(0,word.length()-1);
          int position = Character.getNumericValue(word.charAt(word.length()-1));
          result[position-1] = text;
        }
        String finalSentence = String.join(" ", result);
        System.out.println(finalSentence);
    }
}
