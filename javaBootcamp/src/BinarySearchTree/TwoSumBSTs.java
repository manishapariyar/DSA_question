package BinarySearchTree;

public class TwoSumBSTs {
    static class  Node {
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static  int twoSumPair(Node root,Node root1, int target){
        if (root == null)return 0;
        int totalPair = 0;
        int need = target-root.data;
        if (pair(root1,need)){
            totalPair++;
        }

        totalPair += twoSumPair(root.left, root1, target);
        totalPair += twoSumPair(root.right, root1, target);
        return totalPair;
    }
    public static boolean pair(Node root, int target){
        if (root == null ) return  false;
        if (root.data==target) return true;
        if (target<root.data){
          return   pair(root.left, target);
        }else {
          return   pair(root.right, target);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(3);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right = new Node(7);
        root.right.left = new Node(6);
        root.right.right = new Node(8);


        Node root1 = new Node(10);
        root1.left = new Node(6);
        root1.left.left = new Node(3);
        root1.left.right = new Node(8);
        root1.right = new Node(15);
        root1.right.left = new Node(11);
        root1.right.right = new Node(18);


        System.out.println(twoSumPair(root,root1,16));
    }
}
