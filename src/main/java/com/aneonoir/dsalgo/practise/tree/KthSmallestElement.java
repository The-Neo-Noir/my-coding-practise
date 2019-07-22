package com.aneonoir.dsalgo.practise.tree;

import java.util.LinkedList;
import java.util.List;

/**
 * link: https://leetcode.com/problems/kth-smallest-element-in-a-bst/
 * <p>
 * approach: used a list which contains the items of inorder traversal to and get(k-1) is the answer.
 * <p>
 * TODO: It asks for a follow up , check more
 */
public class KthSmallestElement {

    public int kthSmallest(TreeNode root, int k) {
        List<Integer> ord = new LinkedList<>();
        inrd(root, ord);
        return ord.get(k - 1);
    }

    private void inrd(TreeNode node, List<Integer> list) {
        if (node != null) {
            inrd(node.left, list);
            list.add(node.val);
            inrd(node.right, list);
        }
    }
}
