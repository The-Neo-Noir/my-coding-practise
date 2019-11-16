package com.aneonoir.dsalgo.practise.tree;

import java.util.Stack;

public class PreOrderTraversalUsingStack {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(4);
        node.left.right = new TreeNode(5);

        preOrderTraversalIterative(node);
    }

    private static void preOrderTraversalIterative(TreeNode node) {
        Stack<TreeNode> st = new Stack<>();

        if (node != null) {
            st.push(node);
        }
        while (!st.isEmpty()) {
            TreeNode pop = st.pop();
            System.out.println(pop.val);

            if (pop.right != null) st.push(pop.right);
            if (pop.left != null) st.push(pop.left);

        }
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}
