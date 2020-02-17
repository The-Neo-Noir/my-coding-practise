package com.aneonoir.dsalgo.practise.tree;

/**
 * link: https://leetcode.com/problems/add-one-row-to-tree/submissions/
 *
 * struggle : when the d is the max +1 then it fails. but fixed.
 *
 *
 * tag: interview, tree, recursion, medium
 *
 * related: https://leetcode.com/problems/flip-equivalent-binary-trees/
 * https://leetcode.com/problems/house-robber-iii/
 * https://leetcode.com/problems/binary-tree-postorder-traversal/
 */
public class AddARowToTree {
    public static void main(String[] args) {
        AddARowToTree addARowToTree = new AddARowToTree();
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(1);

        root.right.left = new TreeNode(5);

        addARowToTree.addOneRow(root, 1, 2);
    }

    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if (root == null) {
            return null;
        } else {
            return addOneRow(root, v, d, 1, "left");
        }
    }

    public TreeNode addOneRow(TreeNode root, int v, int d, int cd, String dir) {
        if (root != null) {
            if (cd < d) {
                root.left = addOneRow(root.left, v, d, cd + 1, "left");
                root.right = addOneRow(root.right, v, d, cd + 1, "right");
                return root;
            } else if (d == cd) {
                TreeNode n = new TreeNode(v);
                if (dir.equals("left")) {
                    n.left = root;
                } else if (dir.equals("right")) {
                    n.right = root;
                }
                return n;
            } else {
                return root;
            }
        } else {
            if (d == cd) {
                TreeNode n = new TreeNode(v);
                if (dir.equals("left")) {
                    n.left = root;
                } else if (dir.equals("right")) {
                    n.right = root;
                }
                return n;
            } else {

                return null;
            }
        }
    }
}
