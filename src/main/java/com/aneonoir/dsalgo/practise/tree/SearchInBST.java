package com.aneonoir.dsalgo.practise.tree;

/**
 * link: https://leetcode.com/problems/search-in-a-binary-search-tree/
 * <p>
 * tag: bst,recursive
 * <p>
 * TODO: can you solve it using iterative apporach ?
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class SearchInBST {


    public TreeNode searchBST(TreeNode root, int val) {
        if (root != null) {
            if (val > root.val) {
                return searchBST(root.right, val);
            } else if (val == root.val) {
                return root;
            } else {
                return searchBST(root.left, val);
            }

        } else {
            return null;
        }


    }

}
