package com.aneonoir.dsalgo.practise.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * link: https://practice.geeksforgeeks.org/problems/top-view-of-binary-tree/1
 * <p>
 * approach:
 */
public class TopViewBinaryTree {
    // function should print the topView of the binary tree
    static void topView(Node root) {
        LinkedList<Node> printlist = new LinkedList<>();
        Queue<Wrap> que = new LinkedList<>();
        if (root != null) {
            que.add(new Wrap(root, 0));
            printlist.add(root);
        }
        int lower = 0;
        int higher = 0;
        while (!que.isEmpty()) {
            List<Wrap> list = new LinkedList<>();
            while (!que.isEmpty()) {
                list.add(que.remove());
            }
            for (Wrap wrap : list) {
                if (wrap.node.left != null) {
                    if (wrap.weight - 1 < lower) {
                        printlist.addFirst(wrap.node.left);
                        lower = wrap.weight - 1;
                    }
                    que.add(new Wrap(wrap.node.left, wrap.weight - 1));
                }
                if (wrap.node.right != null) {
                    if (wrap.weight + 1 > higher) {
                        printlist.addLast(wrap.node.right);
                        higher = wrap.weight + 1;
                    }
                    que.add(new Wrap(wrap.node.right, wrap.weight + 1));
                }
            }
        }
        for (Node n : printlist) {
            System.out.print(n.data + " ");
        }

    }

    static class Wrap {
        Node node;
        int weight;

        Wrap(Node node, int weight) {
            this.node = node;
            this.weight = weight;
        }
    }
}
