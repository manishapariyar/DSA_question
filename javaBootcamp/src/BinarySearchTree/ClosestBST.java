package BinarySearchTree;

import java.util.ArrayList;

public class ClosestBST {
    static class  Node{
        int data;
        Node left,right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;

        }
        static int minDiff = Integer.MAX_VALUE;
        static int closestVal = -1;
        public static  int closestNum(Node root,int target){
            if (root==null) return 0;
            int  closesDiff = Math.abs(root.data-target);
             if (closesDiff<minDiff){
                 minDiff=closesDiff;
                 closestVal = root.data;
             }

               closestNum(root.left,target);
              closestNum(root.right,target);
              return  closestVal;


        }
        static  ArrayList<Integer> list = new ArrayList<>();
        public  static  int kthSmallest(Node root, int k) {
            if(root==null)return 0;

            kthSmallest(root.left,k);
            list.add(root.data);
            kthSmallest(root.right,k);
            int val =  kthNode(list,k);
            return val;
        }
        public  static  int kthNode(ArrayList<Integer> list, int k){
            int val=0;
            for(int i = 0; i<list.size();i++){
                if(i==k){
                    val = list.get(i);
                }
            }
            return val;

        }

        public static void main(String[] args) {
            Node root = new Node(8);
             root.left = new Node(5);
             root.left.left = new Node(3);
             root.left.right = new Node(6);
             root.right = new Node(11);
             root.right.right = new Node(20);

            System.out.println(kthSmallest(root,1));
        }
    }
}
