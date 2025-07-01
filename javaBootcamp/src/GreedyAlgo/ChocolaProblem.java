package GreedyAlgo;

import java.lang.reflect.Array;
import java.util.*;


public class ChocolaProblem {
    public static void main(String[] args) {
        int n = 4,m = 6;
        Integer[] costVar = {2,3,1,4,1}; // m-1
        Integer[] costHor = {2,1,4}; // n-1;


        // array into descending order
        Arrays.sort(costHor, Collections.reverseOrder());
        Arrays.sort(costVar, Collections.reverseOrder());
       int h = 0, v= 0;
       int hp = 1,vp=1;
       int cost =0;
       while(h<costHor.length && v<costVar.length){
           if (costVar[v]<=costHor[h]){
               cost+= (costHor[h]*vp);
               hp++;
               h++;
           }else{
               cost+= (costVar[v]*hp);
               vp++;
               v++;
           }
       }
       while (h<costHor.length){
           cost+= (costHor[h]*vp);
           hp++;
           h++;
       }
       while (v<costVar.length){
           cost+= (costVar[v]*hp);
           vp++;
           v++;
       }
        System.out.println("print total cost " + cost);
    }
}
