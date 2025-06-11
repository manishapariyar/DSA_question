package Stack;

import java.util.Arrays;
import java.util.Stack;

public class ExSimplifyPath {
    public static void main(String[] args) {
        String input = "/home//foo/";
        String[] str = input.split("/");
        Stack<String> stack = new Stack<>();
        for (String dir:str) {
            if (dir.isEmpty()||dir.equals("."))continue;
            if (dir.equals("..")){
                if (!stack.isEmpty()) stack.pop();
            }else {
                stack.push(dir);
            }
        }
        StringBuilder result = new StringBuilder();
        for (String res: stack
             ) {
            result.append("/").append(res);
        }
        System.out.println(result.length() > 0 ? result.toString() : "/");
    }
}
