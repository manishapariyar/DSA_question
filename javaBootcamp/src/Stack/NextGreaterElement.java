package Stack;

import javax.swing.*;
import java.util.Stack;

public class NextGreaterElement {


     public  static int[]  nextGreaterElement(int[]stack , int[] nextGreat){
          Stack<Integer> s = new Stack<>();
          for (int i = stack.length-1; i >=0 ; i--) {
               while(!s.isEmpty() && stack[s.peek()]<=stack[i]){
                    s.pop();
               }
               if (s.isEmpty()) {
                    nextGreat[i] = -1;
               }else{
                    nextGreat[i] = stack[s.peek()];
               }
               s.push(i);
          }
          return nextGreat;
     }
     public static void main(String[] args) {
          int[] arr = {6,8,0,1,3};
          int[] nextGreat = new int[arr.length];
          nextGreaterElement(arr,nextGreat);
          for (int i = 0; i < arr.length; i++) {
               System.out.print(nextGreat[i] + " ");
          }
     }
}
