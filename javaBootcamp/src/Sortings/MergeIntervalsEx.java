package Sortings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervalsEx {
    public static void main(String[] args) {
        int[][] merge = {
                {2,6},
                {1,3},
                {8,10},
                {15,18}
        };
        Arrays.sort(merge,  Comparator.comparingInt(a-> a[0]));
        List<int[]> result = new ArrayList<>();
        int[] current = merge[0];
        result.add(current);

        for (int i = 0; i < merge.length ; i++) {
               int[] next = merge[i];
               if (current[1]>=next[0]){
                   current[1] = Math.max(current[1],next[1] );

            }
               else {
                   current=next;
                   result.add(current);
               }
        }
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
