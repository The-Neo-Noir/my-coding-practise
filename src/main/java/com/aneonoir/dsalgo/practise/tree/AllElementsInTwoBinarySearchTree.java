package com.aneonoir.dsalgo.practise.tree;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * link: https://leetcode.com/problems/all-elements-in-two-binary-search-trees/
 * <p>
 * TODO: iteratively, and even faster using O(nlogn)
 * <p>
 * tag: tree, bst, interview,
 */
public class AllElementsInTwoBinarySearchTree {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> que = new LinkedList<>();
        addTree(root1, que);
        addTree(root2, que);
        Collections.sort(que);
        return que;
    }

    private void addTree(TreeNode root, List<Integer> que) {
        if (root != null) {
            que.add(root.val);
            addTree(root.left, que);
            addTree(root.right, que);
        }
    }
}
