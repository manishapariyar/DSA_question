package BinaryTree;

import java.util.*;

public class RightSideView {

    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void rightSideView(Node root){
        Queue<Node> q = new LinkedList<>();
        List<Integer> level = new ArrayList<>();
      if (root==null) {
          System.out.println(level);
      }
        q.add(root);

     while(!q.isEmpty()){
         int levelSize = q.size();
         Node rightMost = null;
         for (int i = 0; i <levelSize ; i++) {
             Node curr = q.poll();
              rightMost = curr;
//             level.add(curr.data);
             if (curr.left !=null){
                 q.add(curr.left);
             }
             if (curr.right !=null){
                 q.add(curr.right);
             }
         }
         level.add(rightMost.data);
         }

        System.out.println(level);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right= new Node(5);
        root.right.right = new Node(4);
        rightSideView(root);
    }
}
