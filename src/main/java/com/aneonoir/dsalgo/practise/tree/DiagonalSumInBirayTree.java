package com.aneonoir.dsalgo.practise.tree;

import java.util.LinkedList;
import java.util.List;

/**
 * link: https://practice.geeksforgeeks.org/problems/diagonal-sum-in-binary-tree/1
 * <p>
 * approach:
 * <p>
 * tag: diagonal traversal, tree, interview,
 * <p>
 * TODO: iteratively
 */
public class DiagonalSumInBirayTree {
    public void diagonalsum(List<Node> nodes) {
        if (nodes.size() > 0) {
            List<Node> local = new LinkedList<>();
            int sum = 0;
            for (Node node : nodes) {
                while (node != null) {
                    sum += node.data;
                    if (node.left != null) local.add(node.left);
                    node = node.right;
                }
            }
            System.out.print(sum + " ");
            diagonalsum(local);
        }

    }

    public void diagonalsum(Node root) {
        List<Node> nodes = new LinkedList<>();
        if (root != null) {
            nodes.add(root);
            diagonalsum(nodes);
        }
    }
}
