package BinarySearchTree;

import java.util.ArrayList;

public class MergeBSt {
    static class  Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static  void inorder(Node root, ArrayList<Integer> arr){
        if (root==null) return ;
        inorder(root.left,arr);
        arr.add(root.data);
        inorder(root.right,arr);

    }
    public static Node createBST(ArrayList<Integer> arr,int start, int end){
        if (start>end) return null;
        int mid = (start+end)/2;
      Node  root = new Node(arr.get(mid));
        root.left = createBST(arr, start, mid - 1);
        root.right = createBST(arr, mid + 1, end);
        return root;
    }
    public static  Node mergeBSTs(Node root1, Node root2) {
        ArrayList<Integer> inorder1 =  new ArrayList<>();
        inorder(root1,inorder1);
        ArrayList<Integer> inorder2 =new ArrayList<>();
        inorder(root2,inorder2 );

        int i = 0, j = 0;
        ArrayList<Integer> mergeBst = new ArrayList<>();
        while (i < inorder1.size() && j < inorder2.size()) {
            if (inorder1.get(i) <= inorder2.get(j)) {
                mergeBst.add(inorder1.get(i));
                i++;
            } else {
                mergeBst.add(inorder2.get(j));
                j++;
            }
        }
        while (i < inorder1.size()) {
            mergeBst.add(inorder1.get(i));
            i++;
        }
        while (j < inorder2.size()) {
            mergeBst.add(inorder2.get(j));
            j++;
        }

       return createBST(mergeBst,0, mergeBst.size()-1);
    }
    public static void preOrder(Node root){
        if (root==null) return;
        System.out.print(root.data + "-->");
        preOrder(root.left);
        preOrder(root.right);

    }
    public static void  main(String[] args){
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        //bst 2

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);


        Node root = mergeBSTs(root1,root2);
        preOrder(root);
        System.out.print("null");

    }
}
