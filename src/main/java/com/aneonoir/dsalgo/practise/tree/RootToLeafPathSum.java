package com.aneonoir.dsalgo.practise.tree;

/**
 * link: https://practice.geeksforgeeks.org/problems/root-to-leaf-path-sum/1/
 * <p>
 * TODO: can you do it iteratively
 * <p>
 * <p>
 * tag: tree, root to leaf path check sum, recursive, interview,
 */
public class RootToLeafPathSum {
    /*you are required to complete this function */
    boolean hasPathSum(Node node, int sum) {
        return hasPathSum(node, sum, 0);
    }

    private boolean hasPathSum(Node node, int sum, int nodepathsum) {
        if (node != null) {
            int sumLocal = node.data + nodepathsum;
            if (node.left == null && node.right == null) {
                return sumLocal == sum;
            }
            return hasPathSum(node.left, sum, sumLocal) |
                    hasPathSum(node.right, sum, sumLocal);
        } else {
            return false;
        }
    }
}
