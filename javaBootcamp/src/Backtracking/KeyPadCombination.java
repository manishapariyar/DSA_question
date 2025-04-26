package Backtracking;

import java.util.ArrayList;

public class KeyPadCombination {

     static void solve(String digits,StringBuilder output,int index,
                           ArrayList<String> ans,String[] keys){
             // base-case
          if(index>= digits.length()){
                ans.add(output.toString());
              return;
          }

         int num = digits.charAt(index) - '0';
         String value = keys[num];

         for (int i = 0; i < value.length() ; i++) {
             output.append(value.charAt(i));
             solve(digits,output,index+1,ans,keys);
             output.deleteCharAt(output.length() - 1);;
         }


     }
    public static void main(String[] args) {
        String digits = "45";
        String[] keys = { " ", " ","abc","def","ghi","jkl","mno","pqrs","tuv",
                "wxyz"};
        ArrayList<String> ans = new ArrayList<>();
          if (!digits.isEmpty()){
              StringBuilder output = new StringBuilder();
              solve(digits,output,0,ans,keys);
          }
        for (String s : ans){
            System.out.print(s + " ");
        }
    }
}
