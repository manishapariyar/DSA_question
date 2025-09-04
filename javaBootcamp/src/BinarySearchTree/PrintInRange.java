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
       public static boolean isValidBST(Node root, Node min,Node max){
            if (root==null) return true;
            if (min!=null&& root.data<=min.data)return false;
            if (max!=null && root.data>=max.data)return false;
            return isValidBST(root.left,min,root) && isValidBST(root.right,root,max);
       }
       public static Node sortedArrayToBalanceBST(ArrayList<Integer> nums,int start,int end){
            if (start>end) return null;

            int mid = start+end/2;
            Node root = new Node(nums.get(mid));
            root.left =  sortedArrayToBalanceBST(nums,start,mid-1);
           root.right= sortedArrayToBalanceBST(nums,mid+1,end);
            return root;
       }
       public static ArrayList<Integer> inorderSequence(Node root,ArrayList<Integer> nodes){
            if (root==null) return nodes;
            inorderSequence(root.left,nodes);
            nodes.add(root.data);
            inorderSequence(root.right,nodes);
            return nodes;
       }


       public static void main(String[] args) {
        int[] nums = {8,6,5,3,10,11,14};
        Node root = null;
           for (int num : nums) {
               root = insert(root, num);
           }
           ArrayList<Integer> nodes = new ArrayList<>();
           System.out.println(inorderSequence(root,nodes));
           sortedArrayToBalanceBST(nodes,0,nodes.size()-1);

       }
    }
}
