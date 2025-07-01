package GreedyAlgo;

import java.util.ArrayList;
import java.util.*;

public class ActivitySelection {
    // if activity is not sorted
    public static void activitySelect(int[] start , int[] end){
        ArrayList<Integer> ans = new ArrayList<>();
        //sorting on the basis of end time
        int[][] activities = new int[start.length][3];
        for (int i = 0; i < start.length ; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        //lambda function -> shortForm
        Arrays.sort(activities, Comparator.comparingDouble(o-> o[2]));
        int maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];
        for (int i = 1; i <end.length ; i++) {
            if (activities[i][1] >= lastEnd) {
                // activity select
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];

            }
        }
        System.out.println("maximum Activities" + " " + maxAct);
        for (int i = 0; i <ans.size() ; i++) {
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();

    }

    // max Length chain of pairs
    public static void maxLengthOfPairs() {
       int[][] pairs = {{5,24},
               {39,60},
               {5,28},
               {27,40},
               {50,90}};
       Arrays.sort(pairs,Comparator.comparingDouble(o -> o[1]));
       int chainLen = 1;
       int pairEnd = pairs[0][1]; //last selected pairs end // chain end
        for (int i = 1; i < pairs.length ; i++) {
            if (pairs[i][0]>pairEnd){
                chainLen++;
                pairEnd = pairs[i][1];
            }
        }
        System.out.println("Max Length of Chain = " + chainLen);
    }





    public static void main(String[] args) {
        int[] start = {10,30,20};
        int[] end = {20,25,15};
        ArrayList<Integer> ans = new ArrayList<>();
         //sorting on the basis of end time
         int[][] activities = new int[start.length][3];
        for (int i = 0; i < start.length ; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        //lambda function -> shortForm
        Arrays.sort(activities, Comparator.comparingDouble(o-> o[2]));
        int maxAct = 1;
        ans.add(0);
        int lastEnd = end[0];
        for (int i = 1; i <end.length ; i++) {
           if (start[i]>=lastEnd){
                // activity select
               maxAct++;
               ans.add(i);
               lastEnd = end[i];
           }
        }
        System.out.println("maximum Activities" + " " + maxAct);
        for (int i = 0; i <ans.size() ; i++) {
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();

        maxLengthOfPairs();
    }
}
