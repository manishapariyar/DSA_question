package Stack;

import java.util.Stack;

public class DecodeString {
    public static void stringDecode(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i <s.length() ; i++) {
            char ch = s.charAt(i);
            if (ch != ']'){
                st.push(ch);
            }else {
                StringBuilder decode = new StringBuilder();
                while(!st.isEmpty() && st.peek() != '['){
                    decode.insert(0,st.pop());
                }
                st.pop();
                StringBuilder numStr = new StringBuilder();
                while(!st.isEmpty() && Character.isDigit(st.peek())){
                    numStr.insert(0,st.pop());
                }
                int count = Integer.parseInt(numStr.toString());
                String repeat = decode.toString().repeat(count);
                for (char c : repeat.toCharArray()){
                    st.push(c);
                }
            }
            StringBuilder result = new StringBuilder();
            for (char c : st) {
                result.append(c);
            }
            System.out.println(result.toString());
        }

    }

    public static void decode(String s) {
        Stack<Integer> numberStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder currString = new StringBuilder();
        int currNum = 0;
        for (char ch:
             s.toCharArray()) {
            if (Character.isDigit(ch)){
                // Build the full number (in case of multiple digits)
                currNum = currNum *10 + (ch - '0');
            } else if (ch == '[') {
                numberStack.push(currNum);
                stringStack.push(currString);
                currString = new StringBuilder();
                 currNum = 0;
            } else if (ch == ']') {
                int repeatTimes = numberStack.pop();
                StringBuilder prevString = stringStack.pop();
                StringBuilder repeated = new StringBuilder();
                for (int i = 0; i < repeatTimes; i++) {
                    repeated.append(currString);
                }
                currString = prevString.append(repeated);
            }else {
                currString.append(ch);
            }
        }
        System.out.println(currString.toString());
    }
    public static void main(String[] args) {
        String   s = "3[a2[bc]]";
        decode(s);
    }

}
