package com.aneonoir.dsalgo.practise.tree;

import java.util.LinkedList;
import java.util.List;

/**
 * link: https://leetcode.com/problems/n-ary-tree-preorder-traversal/
 * <p>
 * approach: pretty trivial , can you do it without recursion ?
 * <p>
 * TODO: do it without recursion ? I could think of level order traversal and finish it
 */
public class NaryTreePreOrderTraversal {
    public List<Integer> preorder(Node root) {
        List<Integer> result = new LinkedList<>();
        travPre(root, result);
        return result;
    }

    void travPre(Node node, List<Integer> result) {
        if (node != null) {

            result.add(node.val);
            for (int i = 0; i < node.children.size(); i++) {
                travPre(node.children.get(i), result);
            }
        }
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