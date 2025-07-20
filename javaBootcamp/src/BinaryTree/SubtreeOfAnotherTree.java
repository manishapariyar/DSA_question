package BinaryTree;

public class SubtreeOfAnotherTree {
    public  static  class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static  boolean isSubtree(Node root, Node subRoot){
       if (root==null){
           return false;
       }
        if (root.data == subRoot.data){
            if (isIdentical(root,subRoot)){
                return true;
            }
        }
        return   isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }

    public static boolean isIdentical(Node node ,Node subNode) {
        if (node == null && subNode==null) return true;
        else if (node==null || subNode==null || node.data != subNode.data) {
            return false;
        }
        if (!isIdentical(node.left,subNode.left)) return false;
        if (!isIdentical(node.right,subNode.right)) return false;

        return true;
    }


    public static void main(String[] args) {
        /*
          1
         / \
        2   3
       / \  / \
      4   5 6  7
       */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left .right= new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        /*
        2
       / \
      4   5
       */
        Node subNode = new Node(1);
        subNode.left = new Node(2);
        subNode.right = new Node(3);
//        subNode.right.left = new Node(6);

        System.out.println(isSubtree(root,subNode));
    }
}
