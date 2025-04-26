package Searching;
import java.util.*;
//https://leetcode.com/problems/intersection-of-two-arrays/description/
public class Intersection {
    public static void search(int[] arr, int target) {

    }
    public static void main(String[] args) {
        int[] n1 = {4,9,5};
        int[] n2 = {9,4,9,8,4};
        Arrays.sort(n1);
        for (int i = 0; i < n1.length; i++) {
            for (int j = 0; j <n2.length ; j++) {
                search(n1,n2[j]);
            }
        }
    }
}
