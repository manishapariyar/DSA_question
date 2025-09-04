package BinarySearchTree;



public class BuildBST {
    public  static class Node{
        int data;
        Node left;
        Node right;
         Node(int data){
            this.data= data;
        }
    }
    public static Node insert(Node root, int val){
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

    public static boolean search(Node root ,int val){
        if (root==null)return false;
        if (root.data==val){
            return true;
        }
        if (root.data>val) {
           return search(root.left,val);
        }else{
          return   search(root.right,val);
        }

    }
    public static void inorder(Node root) {
        if (root==null)return;
        inorder(root.left);
        System.out.print(root.data+ " ");
        inorder(root.right);
    }
    public static Node delete(Node root,int val){
        if (root.data<val) {
            root.right=delete(root.right,val);
        } else if(root.data>val){
            root.left = delete(root.left,val);
        }
        else { // voila case
            //single child
            if (root.left ==null && root.right ==null){
                return null;
            }
            // two child
            if (root.left==null){
                return root.right;
            } else if (root.right==null) {
                return root.left;
            }
            //both children
            Node iS = findInorderSuccessor(root.right);
            root.data = iS.data;
            root.right = delete(root.right,iS.data);
        }
        return root;
    }
     public static Node findInorderSuccessor(Node root){
        while (root.left!=null){
            root = root.left;
        }
        return root;
     }
    public static void main(String[] args) {
       int[] values = {8,5,3,1,4,6,10,11,14};
       Node root = null;
        for (int i = 0; i < values.length ; i++) {
          root =  insert(root,values[i]);
        }

        inorder(root);
        System.out.println();
         root = delete(root,1);
        System.out.println();
        inorder(root);

        System.out.println();
    }
}
