package Searching;

import java.util.Arrays;

public class MinimumAbsoluteSumDifference {
    public static void main(String[] args) {
        int[] num1 = {1,10,4,4,2,7};
        int[] num2 = {9,3,5,1,7,4};
        System.out.println(minimumSumDiff(num1,num2));
    }
    public static int minimumSumDiff(int[] n1, int[] n2){
        int[] tempNum = n1.clone();
        Arrays.sort(tempNum);
        long totalDiff = 0;
        for (int i = 0; i <n1.length ; i++) {
            totalDiff += Math.abs(n1[i]-n2[i]);
        }
        long result = totalDiff;
        for (int i = 0; i < n2.length; i++) {
            int index = binarySearch(tempNum,n2[i]);

            int leftI = index ==0 ? index:index-1;
            int rightI = index == tempNum.length ? index-1: index;
            int diff = Math.min(Math.abs(n2[i]-tempNum[leftI]),Math.abs(n2[i] - tempNum[rightI]));
            result = Math.min(result,totalDiff-Math.abs(n1[i]-n2[i])+diff);
        }
        return (int) ( result % 1000000007);
    }

     public  static  int binarySearch(int[] temp , int target){
        int start = 0;
        int end = temp.length-1;
        while (start<end){
            int mid = start+(end-start)/2;
            if (temp[mid] == target){
                return mid;
            } else if (temp[mid]<target){
                start = mid +1;
            }else {
                end = mid;
            }
        }
        return start;
     }
}
