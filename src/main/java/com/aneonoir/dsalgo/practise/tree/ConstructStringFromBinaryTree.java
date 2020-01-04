package com.aneonoir.dsalgo.practise.tree;

/**
 * link: https://leetcode.com/problems/construct-string-from-binary-tree/
 *
 * appraoch: recursive.
 * can you do it iteratively ?
 *
 * Bit of struggle,
 * Case forgoten again, for null tree, or emtpry tree why do I always forget this. ?
 *
 * TODO: DO it iteratively s
 *
 * tag: tree,recursive, string, interview.
 */
public class ConstructStringFromBinaryTree {

    public String tree2str(TreeNode t) {
        if (t != null) {
            String ca = tree2str2(t);
            return ca.substring(1, ca.length() - 1);
        }
        return "";

    }

    public String tree2str2(TreeNode root) {
        if (root != null) {
            if (root.left == null && root.right == null) {
                return "(" + root.val + ")";
            }
            String roo = "(" + root.val;
            String left = tree2str2(root.left);
            String right = tree2str2(root.right);
            if (left.equals("") && !right.equals("")) left = "()";
            return roo + left + right + ")";
        } else {
            return "";
        }
    }
}