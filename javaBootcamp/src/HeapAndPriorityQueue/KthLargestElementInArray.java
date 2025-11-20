package HeapAndPriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargestElementInArray {
  static   class Pair implements Comparable<Pair>{
        int index;
        int val;
        public Pair(int val, int index){
            this.val = val;
            this.index = index;
        }
        @Override
        public int compareTo(Pair p2){
            return p2.val-this.val;
        }
    }
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        int[] res = new int[nums.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for (int i = 0; i < nums.length ; i++) {
            pq.add(new Pair(nums[i],i));
        }
        for (int i = 0; i <k-1 ; i++) {
          pq.poll();
        }

        System.out.println("kth element " +pq.peek().val );
    }
}
