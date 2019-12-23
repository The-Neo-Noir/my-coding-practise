package com.aneonoir.dsalgo.practise.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.TreeMap;

/**
 * link: https://practice.geeksforgeeks.org/problems/bottom-view-of-binary-tree/1/
 */
public class BottomViewOfBinaryTree {
    // Should print bottom view of tree with given root
    public void bottomView(Node root) {
        TreeMap<Integer, Node> printResult = new TreeMap<>();
        Queue<Wrap> que = new LinkedList<>();
        if (root != null) {
            que.add(new Wrap(root, 0));
            printResult.put(0, root);
        }
        while (!que.isEmpty()) {
            List<Wrap> list = new LinkedList<>();
            while (!que.isEmpty()) {
                list.add(que.remove());
            }
            for (Wrap wrap : list) {
                if (wrap.node.left != null) {
                    que.add(new Wrap(wrap.node.left, wrap.weight - 1));
                    printResult.put(wrap.weight - 1, wrap.node.left);
                }
                if (wrap.node.right != null) {
                    que.add(new Wrap(wrap.node.right, wrap.weight + 1));
                    printResult.put(wrap.weight + 1, wrap.node.right);
                }
            }
        }
        for (Node node : printResult.values()) {
            System.out.print(node.data + " ");
        }
    }

    class Wrap {
        Node node;
        Integer weight;

        Wrap(Node node, Integer weight) {
            this.node = node;
            this.weight = weight;
        }
    }
}
