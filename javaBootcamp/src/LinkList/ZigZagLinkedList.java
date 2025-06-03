package LinkList;


public class ZigZagLinkedList {
    class Node{
        int data;
        Node next ;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static  Node head;
    static  Node tail;
    static  int size;
    public static void zigZagLL(){

        //get mid
        Node mid = getMid(head);

         //revers second half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while (curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        //alternative merging
        Node left = head;
        Node right = prev;
        Node nextL,nextR;
        while(left!= null && right!= null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }
    void addLast(int data){

        //1 - create a node
       ZigZagLinkedList.Node newNode = new ZigZagLinkedList.Node(data);
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
     ZigZagLinkedList.Node temp = head;
        while (temp!=null){ // O(N)
            System.out.print(temp.data + "-->" + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static Node getMid(Node head) {
        Node slow = head ;
        Node fast = head.next;
        while(fast!=null&&fast.next!=null){
            slow= slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
       ZigZagLinkedList ll = new ZigZagLinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.print();
        zigZagLL();
        ll.print();





    }
}
