package com.aneonoir.dsalgo.practise.tree;

import java.util.HashSet;
import java.util.Set;

/**
 * link: https://practice.geeksforgeeks.org/problems/vertical-width-of-a-binary-tree/1
 * <p>
 * approach: put weight to each node as we traverse and keep track of node weigh in set
 * <p>
 * TODO: iteratively
 * tag: vertical traversal, tree
 */
public class VerticalWidthOfBinaryTree {

    public static int verticalWidth(Node root) {
        Set<Integer> s = new HashSet<>();
        if (root != null) {
            verticalWidht(root, s, 0);
            return s.size();
        } else {
            return 0;
        }
    }

    private static void verticalWidht(Node node, Set<Integer> s, int weight) {
        if (node != null) {
            s.add(weight);
            verticalWidht(node.left, s, weight - 1);
            verticalWidht(node.right, s, weight + 1);
        }
    }
}
