package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class MaxOfSubArray {
    static  void printMax(int arr[] , int n , int k){
        Deque<Integer> dq = new LinkedList<>();

        for ( int i = 0; i <k ; i++) {
            while (!dq.isEmpty() && arr[i]>=arr[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        // process rest of the element
        for (int j = k; j <n ; j++) {
            System.out.print(arr[dq.peek()]+ " ");
            while (!dq.isEmpty() && dq.peek()<= j-k ) {
                dq.removeFirst();
            }
                while (!dq.isEmpty() && arr[j]>= arr[dq.peekLast()]){
                    dq.removeLast();

                }

            dq.addLast(j);
        }
        System.out.print(arr[dq.peek()]);
    }
    public static void main(String[] args) {
      int[] arr = {1,2,3,1,4,5,2,3,6};
      int k = 3;
      printMax(arr,arr.length,k);
    }
}
