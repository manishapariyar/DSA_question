package Queue;


import java.util.*;

public class QueueReversal {
    public static void reversal(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();
        while (!q.isEmpty()) {
            st.push(q.remove());
        }
        while (!st.empty()){
            q.add(st.pop());
        }
        while (!q.isEmpty()){
            System.out.println(q.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        reversal(q);
    }
}
