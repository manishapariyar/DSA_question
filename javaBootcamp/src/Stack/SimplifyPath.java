package Stack;

import java.util.Stack;

public class SimplifyPath {
    public static void main(String[] args) {
        String str ="/../";
        Stack<String> st = new Stack<>();
        StringBuilder res = new StringBuilder();

        for (int i = 0; i <str.length() ; i++) {
            StringBuilder dir = new StringBuilder("/");
            while(i<str.length() && str.charAt(i)=='/'){
                i++;
            }
            while(i<str.length() && str.charAt(i)!= '/'){
                 dir.append(str.charAt(i));
                i++;
            }
            if (dir.toString().equals("/..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }else if(dir.toString().equals(".")){
                st.pop();
                continue;
            } else if (!dir.isEmpty()) {
                st.push(dir.toString());
            }
            Stack<String> st1 = new Stack<>();
            while(!st.empty()){
                st1.push(st.pop());
            }
            while (!st1.empty()){
                if (st1.size()!=1){
                    res.append(st1.pop());
                }else{
                    res.append(st1.pop());
                }
            }
        }
        System.out.println(res);
    }
}
