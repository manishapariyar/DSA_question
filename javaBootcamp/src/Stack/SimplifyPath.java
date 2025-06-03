package Stack;

import java.util.Stack;

public class SimplifyPath {
    public static void main(String[] args) {
        String str = "/a/./b/../../c/";
        Stack<String> st = new Stack<>();
        String res = "";

        for (int i = 0; i <str.length() ; i++) {
            String dir = new String(" ");
            while(i<str.length() && str.charAt(i)=='/'){
                i++;
            }
            while(i<str.length() && str.charAt(i)!= '/'){
                 dir+=str.charAt(i);
                i++;
            }
            if (dir.equals(".." )== true){
                if(!st.isEmpty()){
                    st.pop();
                }
            }else if(dir.equals(".")==true){
                continue;
            } else if (dir.length()!=0) {
                st.push(dir);
            }
            Stack<String> st1 = new Stack<>();
            while(!st.empty()){
                st1.push(st.pop());
            }
            while (!st1.empty()){
                if (st1.size()!=1){
                    res+=(st1.pop()+'/');
                }else{
                    res+=st1.pop();
                }
            }
        }
        System.out.println(res);
    }
}
