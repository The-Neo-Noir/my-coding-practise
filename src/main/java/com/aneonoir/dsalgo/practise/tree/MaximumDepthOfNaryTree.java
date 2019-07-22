package com.aneonoir.dsalgo.practise.tree;

import java.util.*;

/**
 * link: https://leetcode.com/problems/maximum-depth-of-n-ary-tree/submissions/
 */
public class MaximumDepthOfNaryTree {
    public int maxDepth(Node root) {
        int height = 0;
        Queue<List<Node>> queue = new ArrayDeque<>();
        if (root != null) {
            List<Node> rootNode = new ArrayList<>();
            rootNode.add(root);
            queue.add(rootNode);
        }
        while (queue.size() > 0) {
            height++;
            List<Node> nodes = queue.poll();
            List<Node> children = new LinkedList<>();
            for (int i = 0; i < nodes.size(); i++) {
                Node current = nodes.get(i);
                children.addAll(current.children);
            }
            if (children.size() > 0) {
                queue.add(children);
            }

        }
        return height;
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}