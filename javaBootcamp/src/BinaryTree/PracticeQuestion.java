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
    public static TreeNode invertTree(TreeNode root){
        if (root==null) return null;
        TreeNode leftData = invertTree(root.left);
        TreeNode rightData = invertTree(root.right);

        root.left = rightData;
        root.right = leftData;

        return root;
    }
    public static void inOrder(TreeNode root){
        if (root ==null) return;
        System.out.print(root.data+ " ");
        inOrder(root.left);

        inOrder(root.right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        inOrder(root);
        invertTree(root);
        System.out.println();
        inOrder(root);
    }
}
