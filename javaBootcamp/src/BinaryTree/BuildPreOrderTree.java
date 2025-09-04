package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BuildPreOrderTree {
    static  class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }
    static class BinaryTree{
        static  int index = -1;
        public static Node buildTree(int[] nodes){
          index++;
          if (nodes[index]==-1){
              return null;
          }
          Node newNode = new Node(nodes[index]);
          newNode.left = buildTree(nodes);
          newNode.right= buildTree(nodes);
          return newNode;

        }
        public static void preorder(Node root){
            if (root==null){
                return;
            };
            System.out.print(root.data + " ");
            preorder(root.left) ;
            preorder(root.right);
        }
        public static void inorder(Node root){
            if (root==null){
                return;
            };

            inorder(root.left) ;
            System.out.print(root.data + " ");
            inorder(root.right);
        }
        public static void postorder(Node root){
            if (root==null){
                return;
            };

            postorder(root.left) ;

            postorder(root.right);
            System.out.print(root.data + " ");
        }
        static class Info{
            int diam;
            int ht;

            public Info(int diam,int ht){
                this.diam = diam;
                this.ht= ht;
            }
        }
 // level order tree travers
        public static void levelOrder(Node root){
            if (root==null) return;
            Queue<Node> q= new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()){
                Node currNode = q.remove();
                if (currNode==null){
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    }else {
                        q.add(null);
                    }
                }else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left !=null){
                        q.add(currNode.left);
                    }  if (currNode.right !=null){
                        q.add(currNode.right);
                    }
                }
            }
        }
        public static  int count(Node root){
            if (root==null){
                return 0;
            }
            int leftCount = count(root.left);
            int rightCount = count(root.right);
            return leftCount+rightCount+1;
        }

        public static int sum(Node root){
            if (root==null) return 0;
            int leftSum = sum(root.left);
            int rightSum = sum(root.right);
            return leftSum+rightSum+root.data;
        }
        public static int height(Node root){
            if (root==null) return 0;
            int lh = height(root.left);
            int rh = height(root.right);
            return Math.max(lh,rh)+1;
        }
        public static int diameter(Node root){
            if (root==null) return 0;

            int lDiameter = diameter(root.left);
            int rDiameter = diameter(root.right);
            int lh = height(root.left);
            int rh = height(root.right);
            int selfDia = lh+rh+1;

            return Math.max(Math.max(lDiameter,rDiameter),selfDia);
        }

        public static Info diameter2(Node root){
            if (root==null){
                return  new Info(0,0);
            }
        Info leftInfo= diameter2(root.left);
        Info rightInfo= diameter2(root.right);
        int diameter = Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht+rightInfo.ht+1);
        int  ht = Math.max(leftInfo.ht,rightInfo.ht)+1;
        return new Info(diameter,ht);
        }
     }


    public static void main(String[] args) {
        int[] node = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(node);
        tree.levelOrder(root);




    }
}
