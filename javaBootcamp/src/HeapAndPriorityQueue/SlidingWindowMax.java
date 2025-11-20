package HeapAndPriorityQueue;

import java.util.PriorityQueue;

public class SlidingWindowMax {
    static class Pair implements Comparable<Pair>{
        int num;
        int idx;
        public Pair(int num, int idx){
            this.num = num;
            this.idx = idx;
        }
        @Override
        public int compareTo(Pair p2){
            //descending order ---> max first
            return  p2.num-this.num;
        }

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int k = 3;
        int[] res = new int[arr.length-k+1];
        PriorityQueue<Pair> pairs = new PriorityQueue<>();

        for (int i = 0; i <k  ; i++) {
            pairs.add(new Pair(arr[i],i ));
        }
        res[0] = pairs.peek().num;
        for (int i = k; i < arr.length; i++) {
            while (pairs.size()>0&& pairs.peek().idx<=(i-k)){
                pairs.remove();
            }
            pairs.add(new Pair(arr[i], i));
            res[i-k+1] = pairs.peek().num;
        }
        for (int i = 0; i < res.length ; i++) {
            System.out.print(res[i] + " ");
        }

    }
}
