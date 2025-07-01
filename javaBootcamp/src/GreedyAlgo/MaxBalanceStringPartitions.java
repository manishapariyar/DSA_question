package GreedyAlgo;

public class MaxBalanceStringPartitions {
    public static void main(String[] args) {
        String s = "LRRRRLLRLLRL";
        int count = 0;
        int cL = 0;
        int rL = 0;
        for (int i = 0; i <s.length() ; i++) {
                if (s.charAt(i)=='L'){
                    cL++;
                }else if(s.charAt(i)=='R') {
                    rL++;
                }
            if (cL==rL){
                count++;
            }
        }

        System.out.println(count);
    }
}
