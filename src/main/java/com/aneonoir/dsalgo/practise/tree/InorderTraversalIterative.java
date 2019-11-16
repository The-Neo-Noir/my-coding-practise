package com.aneonoir.dsalgo.practise.tree;

import java.util.Stack;

/**
 * link: https://leetcode.com/problems/binary-tree-inorder-traversal/
 * <p>
 * tags: stack,tree,inorder,iterative,interview.
 * <p>
 * TODO: practise two more times.
 * <p>
 * <p>
 * // Check the solution below in comments as below , at the very end of this file.
 */
public class InorderTraversalIterative {
    public static void main(String[] args) {

        TreeNode t = new TreeNode(1);

        t.left = new TreeNode(2);

        t.right = new TreeNode(3);
        t.left.left = new TreeNode(4);
        t.right.right = new TreeNode(5);

        inorderTraversal(t);
    }

    private static void inorderTraversal(TreeNode t) {

        TreeNode curr = t;
        Stack<TreeNode> st = new Stack<>();

        if (t == null) {
            return;
        }

        while (curr != null || st.size() > 0) {

            while (curr != null) {
                st.push(curr);
                curr = curr.left;
            }

            curr = st.pop();
            System.out.print(curr.val + " ");
            curr = curr.right;

        }
    }
}


/*
public List<Integer> inorderTraversal2(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    if (root == null) return res;

    Stack<TreeNode> stack = new Stack<>();
    pushAllLeft(root, stack);
    while (!stack.isEmpty()) {
        TreeNode cur = stack.pop();
        res.add(cur.val);
        pushAllLeft(cur.right, stack);
    }
    return res;
}

public void pushAllLeft(TreeNode node, Stack stack){
    while (node != null) {
        stack.add(node);
        node = node.left;
    }
}



AND CHECK THIS ONE OUT>


public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.empty()) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                list.add(stack.peek().val);
                root = stack.pop().right;
            }
        }
        return list;
    }
 */