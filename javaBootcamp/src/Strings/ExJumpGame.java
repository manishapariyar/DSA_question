package Strings;
// idiot use BFS in queue or sliding window this doesn't wrok
public class ExJumpGame {
    public static boolean canReach(String s, int min,int max) {
        int i = 0;
        while(i <s.length()) {
            for (int j = 0; j<s.length()-1 ; j++) {
                int minOfMax = Math.min(i+max,s.length()-1);
             if ((i+min<=j && j<=minOfMax)){
                 if (s.charAt(j)=='0'){
                     return true;
                 }
                }
                i=j;
            }

        }

        return  false;
    }
    public static void main(String[] args) {
        String s = "011010";
        int minJump = 2;
        int maxJump = 3;

        System.out.println(canReach(s,minJump,maxJump));
    }
}
