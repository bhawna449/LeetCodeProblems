package com.leetcode.solutions;

import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class BST {

    public static void main(String[] args) {

        int[] arr = { 8, 5, 1, 7, 10, 12 };
        BST.bstFromPreorder(arr);
    }

    public static TreeNode bstFromPreorder(int[] preorder) {

        TreeNode root = new TreeNode(preorder[0]);
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);

        for (int i = 1; i < preorder.length; i++) {

            TreeNode temp = null;

            while (!stack.isEmpty() && preorder[i] > stack.peek().val) {
                temp = stack.pop();
            }

            if (temp != null) {
                temp.right = new TreeNode(preorder[i]);
                stack.push(temp.right);
            } else {

                temp = stack.peek();
                temp.left = new TreeNode(preorder[i]);
                stack.push(temp.left);
            }

        }
        return root;

    }
}
