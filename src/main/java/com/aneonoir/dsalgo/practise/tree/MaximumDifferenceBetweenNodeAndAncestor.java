package com.aneonoir.dsalgo.practise.tree;

/**
 * link: https://leetcode.com/problems/maximum-difference-between-node-and-ancestor/
 *
 * TODO: solved it using recursion, can you do it in iterative fashion ?
 *
 * tag: medium , must-do-interview, tree,recursion, bit of struggle.
 *
 */
public class MaximumDifferenceBetweenNodeAndAncestor {
    public int maxAncestorDiff(TreeNode root) {
        int max = -1;
        int min = 100001;
        return findMax(root, max, min);
    }

    private int findMax(TreeNode root, int max, int min) {
        if (root != null) {
            int maxl = root.val > max ? root.val : max;
            int minl = root.val < min ? root.val : min;
            return
                    Math.max(
                            Math.max(findMax(root.left, maxl, minl), findMax(root.right, maxl, minl)),
                            Math.abs(maxl - minl)
                    );
        } else {
            return 0;
        }
    }
}
