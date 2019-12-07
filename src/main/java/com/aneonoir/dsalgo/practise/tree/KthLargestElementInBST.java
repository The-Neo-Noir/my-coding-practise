package com.aneonoir.dsalgo.practise.tree;

import java.util.LinkedList;

/**
 * link:https://practice.geeksforgeeks.org/problems/kth-largest-element-in-bst/1
 * <p>
 * approach: do a post order traversal with right, root, and left
 * <p>
 * TODO: can you do it without using list,
 * tag: interview, tree , kth largest
 */
public class KthLargestElementInBST {
    public void kthLargest(Node root, int k) {
        LinkedList<Node> list = new LinkedList<>();
        formAnArray(root, k, list);
        System.out.println(list.get(k - 1).data);
    }

    private void formAnArray(Node node, int k, LinkedList<Node> list) {
        if (node != null) {
            formAnArray(node.right, k, list);
            list.add(node);
            formAnArray(node.left, k, list);
        }

    }
}
