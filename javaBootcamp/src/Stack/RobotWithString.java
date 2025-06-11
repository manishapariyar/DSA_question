package Stack;

import java.util.Stack;

public class RobotWithString {
    public static void robotWithString(String s){
        int n = s.length();
        char[] minCharRight = new char[n];
        minCharRight[n-1] = s.charAt(n-1);
        for (int i = s.length()-2; i >=0; i--) {
            minCharRight[i] = (char)Math.min(s.charAt(i),minCharRight[i+1]);
        }


        Stack<Character> st = new Stack<>();
        StringBuilder p = new StringBuilder();
        for (int i = 0; i <n ; i++) {
              st.push(s.charAt(i));
              while (!st.isEmpty() && ( i==n-1|| st.peek()<=minCharRight[i+1])) {
                  p.append( st.pop());
              }
            }

        System.out.println(p);
    }
    public static void main(String[] args) {
        String s = "bachg";
        robotWithString(s);
    }
}
