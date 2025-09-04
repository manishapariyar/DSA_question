package BinaryTree;
import java.util.*;

public class ZigZagLevelOrder {
    static class Node{
        int val;
        Node left,right;
        Node(int data){
            this.val = data;
            this.left = null;
            this.right = null;
        }
    }
    public static  List<List<Integer>> zigzagOrder(Node root){
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) return  list;
        Queue<Node> queue = new LinkedList<>();
         queue.add(root);
         int levelSize =0;
         while(!queue.isEmpty()){
             int size = queue.size();
             List<Integer> arr = new ArrayList<>();

             for (int i = 0; i < size ; i++) {
                 Node curr = queue.poll();
                 arr.add(curr.val);

                     if (curr.left!=null) queue.add(curr.left);
                     if (curr.right!=null) queue.add(curr.right);
                 }
             if (levelSize%2==1){
                 Collections.reverse(arr);
             }
             list.add(arr);
             levelSize++;
         }
         return list;
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right= new Node(7);
        System.out.println(zigzagOrder(root));
    }
}
