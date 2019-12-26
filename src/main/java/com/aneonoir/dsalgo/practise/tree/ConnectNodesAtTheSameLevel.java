package com.aneonoir.dsalgo.practise.tree;

import java.util.LinkedList;
import java.util.List;

/**
 * link: https://practice.geeksforgeeks.org/problems/connect-nodes-at-same-level/1
 * <p>
 * approach:
 * <p>
 * <p>
 * tag: tree, traversal , visit nodes and connect
 */
public class ConnectNodesAtTheSameLevel {

    static void connect(Node root) {
        List<Node> nodes = new LinkedList<>();
        if (root != null) {
            nodes.add(root);
            cont(nodes);
        }
    }

    private static void cont(List<Node> nodes) {
        if (nodes.size() > 0) {
            List<Node> local = new LinkedList<>();
            for (int i = 0; i < nodes.size() - 1; i++) {
                nodes.get(i).nextRight = nodes.get(i + 1);
                if (nodes.get(i).left != null) local.add(nodes.get(i).left);
                if (nodes.get(i).right != null) local.add(nodes.get(i).right);
            }
            Node lastNode = nodes.get(nodes.size() - 1);
            if (lastNode.left != null) local.add(lastNode.left);
            if (lastNode.right != null) local.add(lastNode.right);
            cont(local);
        }
    }

    class Node {
        int data;
        Node left, right, nextRight;

        Node(int x) {
            this.data = x;
            left = right = nextRight = null;
        }


    }
}
