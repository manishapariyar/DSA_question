package BinaryTree;

import java.util.ArrayList;

public class LowestCommonAncestor {
   static class Node {
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left = null;
            this.right = null;
        }
    }

    public static Boolean getPath(Node root, int n, ArrayList<Node> path){
       if (root==null) return false;

         path.add(root);
         if (root.data == n){
             return true;
         }
        boolean foundLeft =  getPath(root.left,n,path);
        boolean foundRight= getPath(root.right,n,path);
        if (foundLeft||foundRight){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
    public static Node  lca(Node root, int n1, int n2 ) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        getPath(root,n1,path1);
        getPath(root,n2,path2);
        
        // last common ancestor
        int i = 0;
        for ( ; i<path1.size() && i<path2.size() ; i++) {
            if (path1.get(i) != path2.get(i)){
                break;
            }
        }
        //last eqaul node --> 1th
        Node lca = path1.get(i-1);
        return lca;
    }
    public static Node lca2(Node root, int n1, int n2){
        if  (root==null || root.data==n1 || root.data == n2){
            return root;
        }
        Node leftLca=  lca2(root.left, n1,n2);
        Node rightLca =   lca2(root.right, n1,n2);
        // left = value right = null
        if (rightLca==null){
            return leftLca;
        }
        if (leftLca==null){
            return rightLca;
        }
        return root;
    }
   public static int lcaDist(Node root, int n){
       if (root ==null){
           return -1;
       }
       if (root.data ==n){
           return  0;

       }
       int leftDis = lcaDist(root.left,n);
       int rightDis = lcaDist(root.right,n);
       if (leftDis==-1 && rightDis ==-1){
           return -1;
       }else if (leftDis==-1){
           return rightDis+1;
       }else {
           return leftDis+1;
       }
   }
    public static int minDis(Node root,int n1, int n2){
       Node lca = lca2(root, n1, n2);
       int dist1 = lcaDist(root,n1);
       int dist2 = lcaDist(root,n2);
       return dist1+dist2;
    }

    public static int kAncestor(Node root, int n , int k){
        if (root ==null){
            return -1;
        }
       if (root.data==k){
           return 0;
       }
       int leftDis = (kAncestor(root.left,n,k));
       int rightDis = (kAncestor(root.right,n,k));

       if (leftDis==-1 && rightDis==-1){
           return -1;
       }
       int max = Math.max(leftDis,rightDis);
       if (max+1==k){
           System.out.println(root.data);
       }
       return max+1;
    }

    public static int transformSum(Node root){
       if (root==null){
           return 0;
       }
       int leftChild= transformSum(root.left);
       int rightChild= transformSum(root.right);
       int sum = root.data;
       int newLeft = root.left ==null?0:root.left.data;
       int newRight = root.right ==null?0:root.right.data;
       root.data = leftChild+newLeft+newRight+rightChild;
        return sum;
    }
    static void preOder(Node root){
       if (root==null) return;
        System.out.print(root.data + " ");
        preOder(root.left);
        preOder(root.right);
    }

    public static void main(String[] args) {
       Node root = new Node(1);
       root.left = new Node(2);
       root.right = new Node(3);
       root.left.left = new Node(4);
       root.left.right = new Node(5);
       root.right.left = new Node(6);
       root.right.right = new Node(7);
       int n1 = 4, n2 =5;
        transformSum(root);
        preOder(root);
    }


}
