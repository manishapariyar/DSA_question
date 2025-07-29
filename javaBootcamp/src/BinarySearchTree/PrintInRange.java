package BinarySearchTree;

import java.util.ArrayList;

public class PrintInRange {
   static class Node {
        int data;
        Node left,right;

        Node(int data){
            this.data = data;

        }

       public static Node insert(Node root,int val) {
           if(root==null){
               root = new Node(val);
               return root;
           }
           if (root.data>val){
               root.left = insert(root.left,val);
           }else {
               root.right = insert(root.right,val);
           }
           return root;
       }
       public static void print(Node root){
            if (root==null)return;
            print(root.left);
           System.out.print(root.data + "  ");
           print(root.right);
       }
       public static void printInRange(Node root,int k1,int k2){
            if(root==null )return;
            if(root.data>=k1 && root.data<=k2){
                printInRange(root.left,k1,k2);
                System.out.print(root.data+" ");
                printInRange(root.right,k1,k2);
            } else if (root.data<k1) {
                printInRange(root.right,k1,k2);
            }{
               printInRange(root.left,k1,k2);
           }
       }
       public static void rootToLeafPath(Node root, ArrayList<Integer> path){

           if (root==null)return;
           path.add(root.data);
           if (root.left==null && root.right==null){
               for ( int p:path) {
                   System.out.print(p + "-->");
               }
               System.out.println("null");

           }
           rootToLeafPath(root.left,path);
           rootToLeafPath(root.right,path);
           path.remove(path.size()-1);

       }

       public static void main(String[] args) {
        int[] nums = {8,5,3,6,10,11,14};
        Node root = null;
           for (int num : nums) {
               root = insert(root, num);
           }

           rootToLeafPath(root, new ArrayList<>());
       }
    }
}
