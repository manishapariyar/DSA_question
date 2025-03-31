package Recursion;

public class TillingProblem {
    public static void main(String[] args) {
        String name = "manishsaa";
        removeDuplicates(name,0,new StringBuilder(""),new boolean[26]);
//        System.out.println(tilingProblem(4));
        System.out.println(friendPairing(3));
    }
    public  static  int tilingProblem(int n){
        if(n==0 || n==1){
            return 1;
        }
//        vertical ways
      int  verticalWay = tilingProblem(n-1);
      int  horizontalWay = tilingProblem(n-2);
        return verticalWay+horizontalWay;
    }

    public  static  int friendPairing(int n){
//    baseCase
        if (n==1||n==2){
            return n;
        }
        int single = friendPairing(n-1);
        int doublePair = (n-1)*friendPairing(n-2);
        return single+doublePair;
    }


    public  static  void removeDuplicates(String str,int idx,StringBuilder newStr,boolean[] map){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a']){
            removeDuplicates(str,idx+1,newStr,map);
        }
        else{
            map[currChar-'a']=true;
            removeDuplicates(str,idx+1,newStr.append(currChar),map);
        }
    }
}
