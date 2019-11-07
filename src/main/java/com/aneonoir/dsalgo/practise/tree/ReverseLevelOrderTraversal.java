package com.aneonoir.dsalgo.practise.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * link: https://practice.geeksforgeeks.org/problems/reverse-level-order-traversal/1
 * <p>
 * tags: traversal,tree,interview
 * approach: using queue,
 * followup:
 * can you do recursively ? TODO:
 * Do you need another List , can you do it without it.
 */
public class ReverseLevelOrderTraversal {

    void reversePrint(Node node) {
        Queue<Node> nodes = new LinkedList<>();

        if (node != null) {
            nodes.add(node);

        }
        LinkedList<Node> local = new LinkedList<>();
        while (!nodes.isEmpty()) {
            Node toR = nodes.remove();
            local.add(toR);
            if (toR.right != null) {
                nodes.add(toR.right);
            }
            if (toR.left != null) {
                nodes.add(toR.left);
            }

        }

        for (int i = local.size() - 1; i >= 0; i--) {
            System.out.print(local.get(i).data + " ");
        }
    }
}
