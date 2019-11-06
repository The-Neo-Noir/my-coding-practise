package com.aneonoir.dsalgo.practise.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * link: https://practice.geeksforgeeks.org/problems/level-order-traversal-line-by-line/1/?ref=self
 */
public class LevelOrderWithSeparator {

    static void levelOrder(Node node) {
        Queue<Node> nodes = new LinkedList<>();

        if (node != null) {
            nodes.add(node);

        }
        while (!nodes.isEmpty()) {
            List<Node> local = new LinkedList<>();
            while (!nodes.isEmpty()) {
                local.add(nodes.remove());
            }
            for (Node nod : local) {
                if (nod != null) {
                    System.out.print(nod.data + " ");
                    if (nod.left != null) nodes.add(nod.left);
                    if (nod.right != null) nodes.add(nod.right);
                }
            }
            System.out.print("$ ");
        }
    }
}
