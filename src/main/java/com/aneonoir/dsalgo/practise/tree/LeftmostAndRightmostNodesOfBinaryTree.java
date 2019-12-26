package com.aneonoir.dsalgo.practise.tree;

import java.util.LinkedList;
import java.util.List;

/**
 * link: https://practice.geeksforgeeks.org/problems/leftmost-and-rightmost-nodes-of-binary-tree/1
 * <p>
 * approarch: recursive
 * <p>
 * TODO: can you do iteratively.
 * <p>
 * tag: extreme nodes print, tree,
 */
public class LeftmostAndRightmostNodesOfBinaryTree {

    public static void printCorner(Node node) {
        List<Node> nodes = new LinkedList<>();
        if (node != null) {
            nodes.add(node);
            printCorners(nodes);
        }
    }

    private static void printCorners(List<Node> nodes) {
        if (nodes.size() > 0) {
            List<Node> local = new LinkedList<>();
            if (nodes.size() == 1) System.out.print(nodes.get(0).data + " ");
            else
                System.out.print(nodes.get(0).data + " " + nodes.get(nodes.size() - 1).data + " ");

            for (Node n : nodes) {
                if (n.left != null) local.add(n.left);
                if (n.right != null) local.add(n.right);
            }
            printCorners(local);
        }
    }
}
