package com.aneonoir.dsalgo.practise.tree;

import java.util.TreeSet;

/**
 * link: https://practice.geeksforgeeks.org/problems/print-all-nodes-that-dont-have-sibling/1
 * <p>
 * approach: pretty straightforward
 * <p>
 * TODO: iteratively .
 * <p>
 * tag:interview, tree,sibling
 */
public class PrintSiblings {
    void printSibling(Node node) {
        TreeSet<Integer> s = new TreeSet<>();
        prntSibLing(node, "", null, s);
        if (s.size() == 0) {
            System.out.print("-1");
        }
        for (Integer in : s) {
            System.out.print(in + " ");
        }
    }

    void prntSibLing(Node node, String dir, Node parent, TreeSet<Integer> s) {
        if (node != null) {
            if (parent != null) {
                if (dir.equals("left")) {
                    if (parent.right == null) {
                        s.add(node.data);
                    }
                }
                if (dir.equals("right")) {
                    if (parent.left == null) {
                        s.add(node.data);
                    }
                }
            }
            prntSibLing(node.left, "left", node, s);
            prntSibLing(node.right, "right", node, s);
        }
    }
}
