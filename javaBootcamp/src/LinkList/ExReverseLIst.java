package LinkList;


public class ExReverseLIst {

    public static LinkList.LinkedList.Node head;

    public static LinkList.LinkedList.Node tail;
    public static int size;


    public static void reverseList(){
        int left = 2;
        int right = 4;
        LinkedList.Node curr = head;
        LinkedList.Node next ;
        LinkedList.Node prev = null;
        while (left<=right){

            while(curr != null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
           left++;
        }
        System.out.println(prev);

    }
    public static void main(String[] args) {
        LinkList.LinkedList ll = new LinkList.LinkedList();
        ll.addFirst(2);
        ll.addLast(3);

        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
//        ll.reverseList();
        ll.print();
    }
}
