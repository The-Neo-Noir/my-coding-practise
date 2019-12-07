package com.aneonoir.dsalgo.practise.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * link: https://practice.geeksforgeeks.org/problems/ancestors-in-binary-tree/1/
 * <p>
 * approach: went bfs with wrapping data.
 * <p>
 * tag: interview, tree, ansestor finding
 */
public class AncesstorBinaryTree {
    public static boolean printAncestors(Node node, int x) {
        ite(node, x);
        return true;
    }

    private static void ite(Node node, int x) {
        Queue<Con> que = new LinkedList<>();
        if (node != null) que.add(new Con(node, null));
        Stack<Con> list = new Stack<>();
        while (!que.isEmpty()) {
            Con curr = que.remove();
            list.add(curr);
            if (curr.node.data == x) {
                break;
            }
            if (curr.node.left != null) que.add(new Con(curr.node.left, curr.node));
            if (curr.node.right != null) que.add(new Con(curr.node.right, curr.node));
        }
        Con lastNode = list.pop();

        while (!list.isEmpty()) {
            Con curr = list.pop();
            if (curr.node == lastNode.parent) {
                System.out.print(curr.node.data + " ");
                lastNode = curr;
            }
        }
    }

    static class Con {
        Node node;
        Node parent;

        Con(Node node, Node parent) {
            this.node = node;
            this.parent = parent;
        }
    }
}