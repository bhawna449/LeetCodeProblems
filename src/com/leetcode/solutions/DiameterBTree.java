package com.leetcode.solutions;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class DiameterBTree {

    static TreeNode root1;

    public static void main(String[] args) {
        DiameterBTree bTree = new DiameterBTree();
        bTree.diameterOfBinaryTree(root1);
    }

    public DiameterBTree() {
        root1 = new TreeNode(1);
        TreeNode root2 = new TreeNode(2);
        TreeNode root3 = new TreeNode(3);
        TreeNode root4 = new TreeNode(4);
        TreeNode root5 = new TreeNode(5);
        root1.left = root2;
        root1.right = root5;
        root2.left = root3;
        root2.right = root4;
    }

    public int diameterOfBinaryTree(TreeNode root) {

        int diameter = 0;
        TreeNode node = root;
        return calcDiameter(node, diameter);
    }

    private int calcDiameter(TreeNode root, int diameter) {
        while (root != null) {
            System.out.println(root.val);
            int leftDia = diameter +calcDiameter(root.left, diameter);
            int rightDia = diameter + calcDiameter(root.right, diameter);
            System.out.println("Max " + Math.max(leftDia, rightDia));
            return Math.max(leftDia, rightDia);
        }
        return diameter;
    }

   
}
