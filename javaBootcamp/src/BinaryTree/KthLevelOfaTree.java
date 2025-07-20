package BinaryTree;

import java.util.*;
import java.util.List;
import java.util.logging.Level;

public class KthLevelOfaTree {
    static  class  Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

     // recursive
        public static void  kthLevel(Node root,int level,int k) {
           if (root == null) return;

           if (level==k){
                     System.out.print(root.data + " ");
                     return;

           }
           kthLevel(root.left,level+1,k);
           kthLevel(root.right,level+1,k);


    }

    // iterative
    public static void kthLevel2(Node root,int k) {
                   Queue<Node> q = new LinkedList<>();
                          List<Integer> level = new ArrayList<>();
                        if (root==null) {
                            System.out.println(level);
                        }
                          q.add(root);
                       int levelCount = 1;
                       int sum = 0;
                       while(!q.isEmpty()) {
                           int levelSize = q.size();
                           if (levelCount==k){
                               for (int i = 0; i <levelSize ; i++) {
                                   sum += q.poll().data;
                               }

                           break;
                           }
                           for (int i = 0; i < levelSize; i++) {
                               Node curr = q.poll();
                               if (curr.left != null) {
                                   q.add(curr.left);
                               }
                               if (curr.right != null) {
                                   q.add(curr.right);
                               }
                           }
                           levelCount++;
                       }
        System.out.println(sum);


    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left .right= new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

      kthLevel2(root,3);
    }
}
