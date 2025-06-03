package LinkList;

public class DubleLL {

 class ListNode{
    int data;
     ListNode next;
     ListNode prev;
     public ListNode(int data){
          this.data = data;
          this.next = null;
          this.prev = null;
     }
 }
    static  ListNode head;
    static  ListNode tail;
    static  int size;
    // add
    public void addFirst(int data){
        ListNode newNode = new ListNode(data);
        size++;
        if (head==null){
            head=tail=newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
 // addLast
    public void addLast(int data){
        ListNode newNode = new ListNode(data);
        size++;
        if (head==null){
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        newNode.next = null;
        tail=newNode;

    }

    //remove
    // remove first
    public int removeFirst(){
        if (head == null){
            System.out.println("list is empty");
            return Integer.MIN_VALUE;
        }

         if (size ==1){
             int val = head.data;
             head =tail = null;
              size--;
             return val;
         }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }
   //last remove
     public int removeLast(){
        if (head==null){
            System.out.println("list is empty");
            return  Integer.MIN_VALUE;
        }
        if (size == 1){
            int val = tail.data;
            head=tail=null;
            size--;
            return val;
        }
         int val = tail.data;
        tail =  tail.prev;
        tail.next = null;
         size--;
         return val;
     }

    //print
    public  void print(){
        ListNode temp = head;
        while (temp!=null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void reverse(){
        ListNode current = head;
        ListNode prev=null;
        ListNode next;
        while (current!=null){
            next = current.next;
            current.next = prev;
            current.prev= next;
            prev = current;
            current = next;
        }
        head = prev;
    }
    public static void main(String[] args) {
        DubleLL dll = new DubleLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(4);
        dll.addLast(5);
        dll.print();
        dll.reverse();
        dll.print();


    }
}
