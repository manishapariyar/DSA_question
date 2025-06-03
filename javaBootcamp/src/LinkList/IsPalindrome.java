package LinkList;

public class  IsPalindrome {
    //slow  fast concept
    // reverse half ll
     public  static  class  Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }
      public static Node head;
      public  static Node tail;
      public static int size;

    public  void addFirst(int data){

        //step1 create new Node
        IsPalindrome.Node newNode = new IsPalindrome.Node(data);
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

    void print (){
        if (head == null){
            System.out.println("empty");
        }
      IsPalindrome.Node temp = head;
        while (temp!=null){ // O(N)
            System.out.print(temp.data + "-->" + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //slow fast technique
    public Node findMid(Node head){

        Node slow = head;
        Node fast = head;

     while (fast != null && fast.next !=null){
         slow = slow.next; //+1
         fast = fast.next.next; //+2
     }
     return slow; //slow is midNode
    }

    public boolean checkPailndrome(){
        if (head == null || head.next ==null){
            return true;
        }
        //step1 -find mid
        Node midNode = findMid(head);
        // step2-reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr !=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        // step3 check left half and right half
        Node right = prev;
        Node left = head;
        while(right!=null){
            if (left.data != right.data){
                return false;
             }
            left = left.next;
            right = right.next;
        }
       return true;
    }
    public static boolean isCycle(){
        Node slow  = head;
          Node      fast = head;
          while(fast != null && fast.next != null){
              slow = slow.next;
              fast = fast.next.next;
              if (slow==fast){
                  return true;
              }
          }
          return false;

    }
     static  void removeCycle(){
        //detect cycle
         Node slow = head;
         Node fast = head;
         Node prev = null;
         boolean exist = false;
         while(fast!=null&&fast.next!=null){
             slow = slow.next;
             fast = fast.next.next;
             if (fast == slow){
                 exist = true;
                 break;
             }
         }
         if (!exist){
             return;
         }
         //find meeting point
         slow = head;

         while (slow!=fast){
             prev = fast;
             slow = slow.next;
             fast = fast.next;
         }
         //remove cycle -> last.next = null
         prev.next = null;

     }
          public static void main(String[] args) {
        IsPalindrome pp = new IsPalindrome();
             head = new Node(1);
             Node temp = new Node(2);
             head.next = temp;
             head.next.next = new Node(3);
             head.next.next.next = temp;

        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
    }
} 
