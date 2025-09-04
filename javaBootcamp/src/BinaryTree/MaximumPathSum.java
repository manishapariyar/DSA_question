package BinaryTree;

public class MaximumPathSum {
    static class  Node{
        int val;
       Node left,right;
        Node(int data){
            this.val = data;
            this.left = null;
            this.right = null;
        }
    }
    static int maxSum = Integer.MIN_VALUE;
    public static int helper(Node root){

        if (root==null) return 0;
        int left = Math.max(helper(root.left), 0);
        int right = Math.max(helper(root.right), 0);
        int best_path = root.val+left+right;
        maxSum = Math.max(maxSum,best_path);
        return root.val+Math.max(left,right);

    }
    public static  int  maxPathSum(Node root){
        maxSum = Integer.MIN_VALUE;
        helper(root);
        return maxSum;
    }
    public static  void parseInt(){
        int a = 1;
        int b = 2;
        int number = a * 10 + b; // 1*10 + 3 = 13

        System.out.println(number);
    }
    public static void main(String[] args) {
        Node root = new Node(-10);
         root.left = new Node(9);
         root.right = new Node(20);
         root.right.left = new Node(15);
         root.right.right = new Node(7);
        System.out.println(maxPathSum(root));
        parseInt();
    }
}
