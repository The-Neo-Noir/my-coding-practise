package com.aneonoir.dsalgo.practise.tree;

/**
 * link:https://practice.geeksforgeeks.org/problems/expression-tree/1
 * <p>
 * solution: pretty standard postprix traversal , using recursion
 * <p>
 * todo: can you do it iterativley.
 * <p>
 * tag: interview, tree, expression evaluation
 */
public class ExpressionEvaluation {

    public int evalTree(Node root) {
        if (root != null) {
            int left = evalTree(root.left);
            int right = evalTree(root.right);
            return op(left, right, root.data);
        } else {
            return 0;
        }

    }

    private int op(int left, int right, String operation) {
        if (operation.equals("+")) {
            return left + right;
        } else if (operation.equals("-")) {
            return left - right;
        } else if (operation.equals("*")) {
            return left * right;
        } else if (operation.equals("/")) {
            return left / right;
        } else {
            return Integer.valueOf(operation);
        }
    }

    class Node {
        String data;
        Node left, right;

        Node(String data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }
}