package com.aneonoir.dsalgo.practise.tree;

/**
 *  link: https://www.codewars.com/kata/5a04450c8ba914083700000a/solutions/java
 *
 *
 *  TODO: can you do iteratively ?
 *  There are one liner solutions , why can't you come up with one?
 *
 *  tag: recursion,interview, easy, warm up
 */
public class FindMaxValueInTree {
    class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;
    }
    static int findMax(TreeNode root) {
        if (root != null) {
            if (root.left == null && root.right == null) {
                return root.value;
            }

            int r = root.value;
            int lv = findMax(root.left);
            int rv = findMax(root.right);
            int max = r;
            if (max < lv) {
                max = lv;
            }
            if (max < rv) {
                max = rv;
            }
            return max;
        } else {
            return Integer.MIN_VALUE;
        }

    }
}
