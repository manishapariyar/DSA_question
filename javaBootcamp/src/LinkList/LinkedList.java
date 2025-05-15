package LinkList;

public class LinkedList {

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;

    public static Node tail;
    public static int size;


    public  void addFirst(int data){

        //step1 create new Node
        Node newNode = new Node(data);
        size++;
        if(head == null){
           head = tail = newNode;
           return;

        }
        //step2 - newNode next = data
        newNode.next = head; //linking step
        //step3 - head = newNode
        head = newNode;

    }

    void addLast(int data){

        //1 - create a node
        Node newNode = new Node(data);
        size++;
        if (head == null){
            head =  tail= newNode;
            return;
        }
        //2-tail.next = newNode
        tail.next = newNode;
        // 3 - tail = newnode
        tail=newNode;
    }
    void print (){
        if (head == null){
            System.out.println("empty");
        }
        Node temp = head;
        while (temp!=null){ // O(N)
            System.out.print(temp.data + "-->" + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }
     void addInMiddle(int index,int  data){
        if (index == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
         size++;
        Node temp = head;
        int i = 0;
        while(i<index-1){
            temp = temp.next;
            i++;
        }
        // i = index-1;temp -> previous
         newNode.next = temp.next;
         temp.next = newNode;
     }


    int removeFirst(){
        if (size==0){
            System.out.println("linkedlist is empty");
            return Integer.MIN_VALUE;
        } else if (size==1) {
            int val = head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val = head.data;
         head = head.next;
         size--;
         return val;
     }


     int removeLast(){
        if (size==0){
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        }
        if (size ==1){
            int val = head.data;
            head = tail = null;
            size= 0;
            return val;
        }
        Node prev = head;
        for (int i = 0; i <size-2 ; i++) {
            prev = prev.next;
        }
        int val = prev.next.data; //tail.data
        prev.next = null;
        tail= prev;
        size--;
       return val;
     }
     int searchIterative(int target){
        int i = 0;
        Node temp = head;
        while (temp!=null){
            if (temp.data ==target){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
     }
     public int helper (Node head,int key){
        if (head==null){
            return -1;
        }
        if (head.data==key){
            return 0;
        }
        int idx = helper(head.next,key);
        if (idx==-1){
            return -1;
        }
        return idx+1;
     }
     int searchRecursive(int target){
      return helper(head,target);
     }
     void reverseInLinkedList(){
        //0(N)

        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
     }
     void RemoveNthNode(int n){
        //calculate size
         int size = 0;
         Node temp = head;
         while(temp!=null){
             temp = temp.next;
             size++;
         }
         if (n==size){
             head = head.next; // remove first;
             return;
         }
         int i = 1;
         int iToFind = size-n;
         Node prev = head;
         while(i<iToFind){
             prev = prev.next;
             i++;
         }
         prev.next = prev.next.next;
         return;

     }
    public static void main(String[] args) {
          LinkedList ll = new LinkedList();
          ll.addFirst(2);
          ll.addFirst(1);
          ll.addLast(4);
          ll.addLast(5);
          ll.addInMiddle(2,3);
          ll.RemoveNthNode(4 );
        ll.print();
    }
}
