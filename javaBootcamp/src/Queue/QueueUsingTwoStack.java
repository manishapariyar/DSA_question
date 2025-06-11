package Queue;

import java.util.Stack;

public class QueueUsingTwoStack {
    static  class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
          return s2.isEmpty() && s1.isEmpty();
        }

        // add
        public static void  add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while (!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }


        // remove
        public static  int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.pop();
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.peek();
        }


        // Enqueue O(1)
        public static void push(int data){
            s1.push(data);
        }
        // Dequeue O(n)
        public static int pop(){
            if (isEmpty()){
                return -1;
            }
            if(s2.isEmpty()){
                while(!s1.isEmpty()){
                    s2.push(s1.pop());
                }
            }

            return s2.pop();
        }
        public static int peekN(){
            if (isEmpty()){
                return -1;
            }
            if(s2.isEmpty()){
                while(!s1.isEmpty()){
                    s2.push(s1.pop());
                }
            }

            return s2.peek();
        }
    }

    public static void main(String[] args) {
          Queue q = new Queue();
          q.push(1);
          q.push(2);
          q.push(3);

        while (!q.isEmpty()) {
            System.out.println(q.peekN());
            q.pop();
        }
    }
}
