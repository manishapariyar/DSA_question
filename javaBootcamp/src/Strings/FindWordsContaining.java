package Strings;

public class FindWordsContaining {
    public static void main(String[] args) {
        String[] words = {"leet", "code"};
        String s2 = "cdba";
        char[] charArray = s2.toCharArray();

        // Swap adjacent characters
        for (int i = 0; i < charArray.length - 1; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[i + 1];
            charArray[i + 1] = temp;

            s2 = new String(charArray);
            System.out.println(s2);
        }
    }
}
