package Queue;

import java.util.*;

public class ConnectNropes {
    public static int connectRopes(int[] arr , int n){
        int add = 0;
         Arrays.sort(arr);
       PriorityQueue<Integer>  q = new PriorityQueue<>();
        for (int i = 0; i <n ; i++) {
            q.add(arr[i]);

        }
        while(q.size()>1){
            int first = q.poll();
            int second = q.poll();
            add += first+ second;
            q.add(first+second);
        }
        return add;
    }
    public static void main(String[] args) {
        int n = 3;
        int[] arr = {1,3,2};
        System.out.println(connectRopes(arr,n));
    }
}
