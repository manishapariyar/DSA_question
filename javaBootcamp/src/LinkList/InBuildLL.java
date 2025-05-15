package LinkList;

public class InBuildLL {
    static class Node{
        int data;
        Node next ;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static  Node head;
    static  Node tail;
    public  void addFirst(int data){

        //step1 create new Node
      InBuildLL.Node newNode = new InBuildLL.Node(data);

        if(head == null){
            head = tail = newNode;
            return;

        }
        //step2 - newNode next = data
        newNode.next = head; //linking step
        //step3 - head = newNode
        head = newNode;

    }
    void print (){
        if (head == null){
            System.out.println("empty");
        }
        InBuildLL.Node temp = head;
        while (temp!=null){ // O(N)
            System.out.print(temp.data + "-->" + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static Node mergeSort(Node head){
        //base case
        if (head==null || head.next == null){
            return head;
        }
        //find mid
         Node mid = getMid(head);
          Node rightHead = mid.next;
          mid.next=null;
        //left and right
        Node leftLL = mergeSort(head);
        Node rightLL= mergeSort(rightHead);

        //merge left and right
        return mergeLinkedList(leftLL,rightLL);
    }
    private static  Node mergeLinkedList(Node head1 , Node head2){
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;
        while (head1 != null && head2!=null){
            if (head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }
        while(head1!=null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;

        }
        while (head2!=null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
         return mergeLL.next;
    }
    public static Node getMid(Node head){
        Node slow = head;
        Node fast = head.next; // for even case also
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // mid node
    }


    public static void main(String[] args) {
       InBuildLL ll = new InBuildLL();
       ll.addFirst(1);
       ll.addFirst(2);
       ll.addFirst(3);
       ll.addFirst(8);
       ll.addFirst(9);
       ll.addFirst(5);
       //5->4->3->2->1
      ll.print();
      ll.head = ll.mergeSort(ll.head);
      ll.print();


    }


}
