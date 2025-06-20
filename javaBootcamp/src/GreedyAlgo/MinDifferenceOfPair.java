package GreedyAlgo;
import java.util.*;
public class MinDifferenceOfPair {
    public static void minimumAbsDiff(){
        int[] arr = {1,3,6,10,15};
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length ; i++) {
                minDiff = Math.min(minDiff,arr[i]-arr[i-1]);
            }
        for (int i = 1; i <arr.length; i++) {
             if (arr[i] - arr[i-1] == minDiff){
                 result.add(Arrays.asList(arr[i - 1], arr[i]));
             }

        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {2,1,3};
         Arrays.sort(a);
         Arrays.sort(b);

         int minDiff =0;

        for (int i = 0; i < a.length ; i++) {
            minDiff += Math.abs(a[i]-b[i]);
        }

        minimumAbsDiff();
        System.out.println("Min absolute difference pair " + minDiff);
    }

}
