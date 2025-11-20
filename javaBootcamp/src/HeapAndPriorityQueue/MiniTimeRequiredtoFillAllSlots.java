package HeapAndPriorityQueue;

import java.util.PriorityQueue;

public class MiniTimeRequiredtoFillAllSlots {
    static  class Pair implements Comparable<Pair>{
        int time;
        int slot_i;
        public Pair(int time, int slot_i){
            this.time = time;
            this.slot_i = slot_i;
        }

        @Override
       public int compareTo(Pair other){
          return this.time -other.time;
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,6};
        int n = 6;
        int k = 2;
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for (int i = 0; i <k ; i++) {
            pq.add(new Pair(0, arr[i]));
        }
        for (int i = 0; i <n ; i++) {
            while (!pq.isEmpty()){
             pq.add(new Pair(i,arr[i]-1));
            }
        }
        while (!pq.isEmpty()){
            System.out.println(pq.peek().time + " " + pq.peek().slot_i);
            pq.poll();
        }
    }
}
