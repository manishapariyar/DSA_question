package BinaryTree;

public class PracticeQuestion {
    public static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean isUniValued(TreeNode root) {
        if (root==null) return true;
         if(root.left !=null && root.data !=root.left.data) return false;
         if(root.right !=null && root.data !=root.right.data) return false;
         return isUniValued(root.left) && isUniValued(root.right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(2);
        root.right = new TreeNode(2);
        System.out.println( isUniValued(root));
    }
}
