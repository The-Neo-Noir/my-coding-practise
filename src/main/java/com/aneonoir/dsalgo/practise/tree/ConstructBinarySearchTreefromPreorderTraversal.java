package com.aneonoir.dsalgo.practise.tree;

/**
 * link: https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/
 * <p>
 * approach: pretty straight forward approach .
 */
public class ConstructBinarySearchTreefromPreorderTraversal {
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode(preorder[0]);
        for (int i = 1; i < preorder.length; i++) {
            insertNode(root, null, "", preorder[i]);
        }
        return root;
    }

    private void insertNode(TreeNode root, TreeNode parent, String direction, int value) {
        if (root != null) {
            if (value > root.val) {
                insertNode(root.right, root, "right", value);
            } else {
                insertNode(root.left, root, "left", value);
            }
        } else {
            if (!direction.equals("")) {
                if (direction.equals("left")) {
                    parent.left = new TreeNode(value);
                } else {
                    parent.right = new TreeNode(value);
                }
            }
        }

    }
}
