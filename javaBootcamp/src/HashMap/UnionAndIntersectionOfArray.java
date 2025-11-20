package HashMap;

import java.util.Arrays;
import java.util.HashSet;

public class UnionAndIntersectionOfArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {3,4,6,7,9};
        System.out.println(Arrays.toString(intersectionOfArr(arr1, arr2)));
    }
    public static int[] intersectionOfArr(int[] n1,int[] n2){
        HashSet<Integer> set   = new HashSet<>();
        HashSet<Integer> result   = new HashSet<>();

        for (int i = 0; i < n1.length; i++) {
            set.add(n1[i]);
        }
        for (int i = 0; i < n2.length ; i++)
        {
            if (set.contains(n2[i])){
                result.add(n2[i]);
                result.remove(n2[i]);
            }
        }
         int[] ans = new int[result.size()];
        int idx = 0;
        for (int val:result
             ) {
            ans[idx++]=val;
        }
        return ans ;
    }
}
