package Arrays.Arraylist;

import java.util.*;

public class FindMax {
    public static void main(String[] args) {
        ArrayList<Integer> arn = new ArrayList<>();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <=5; i++) {
              arr.add(i*1);
              arn.add(i*2);
            }
           list.add(arr);
            list.add(arn);
//        for(int j = 0; j <list.size(); j++) {
//            ArrayList<Integer> currList = list.get(j);
//            for (int k = 0; k < currList.size(); k++) {
//                System.out.print(currList.get(k)+" ");
//
//            }
//            System.out.println();
//        }
        System.out.print(list);
    }
    }
