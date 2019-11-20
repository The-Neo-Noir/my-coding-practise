package com.aneonoir.dsalgo.practise.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * link: https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/
 * <p>
 * solution: used a bfs approach using queue
 * <p>
 * runtime: Runtime: 3 ms, faster than 8.56% of Java online submissions for Populating Next Right Pointers in Each Node II.
 * <p>
 * TODO: need to improve on it
 * try : recursion
 * try dfs:
 */
public class PopulatingNextRightPointersInEachNodeII {

    public Node connect(Node root) {
        Queue<Node> que = new LinkedList<>();
        if (root != null) {
            que.add(root);
        }
        while (!que.isEmpty()) {
            List<Node> list = new LinkedList<>();
            while (!que.isEmpty()) {
                list.add(que.remove());
            }
            Node temp = null;
            for (Node node : list) {
                node.next = temp;
                temp = node;
                if (node.right != null) que.add(node.right);
                if (node.left != null) que.add(node.left);
            }
        }
        return root;
    }

    private class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }
}
