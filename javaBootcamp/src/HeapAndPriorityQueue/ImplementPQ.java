package HeapAndPriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ImplementPQ {
    //store object into pq
    static  class  Student implements Comparable<Student>{
        String name;
        int rank;
         public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }
       @Override
       public int compareTo(Student s2) {
          return this.rank - s2.rank;
       }

    }
    public static void main(String[] args)   {
        //Comparator.reverseOrder() used  to reverse the order
        PriorityQueue<Student> pq = new PriorityQueue<>();
         pq.add(new Student("radha",43));
         pq.add(new Student("ram",40));
         pq.add(new Student("sita",30));
         pq.add(new Student("hari",24));

         while (!pq.isEmpty()){
             System.out.println (pq.peek().name + "-->"+ pq.peek().rank);
             pq.remove();
         }
    }
}
