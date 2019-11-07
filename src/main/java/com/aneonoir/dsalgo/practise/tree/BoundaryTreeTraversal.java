package com.aneonoir.dsalgo.practise.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * link:https://practice.geeksforgeeks.org/problems/boundary-traversal-of-binary-tree/1
 * <p>
 * <p>
 * tag: traversal,tree,interview.
 * <p>
 * approach: I misunderstood this question, so my solution as below {$link {@link BoundaryTreeTraversal.printBoundary} is a levelorder traversal, with each level
 * first and last node being printed and pushed onto the stack. However I failed passing few test cases,when the tree is sweked
 * <p>
 * approach: 2 correct approach. I had to learn the way {$link: https://www.youtube.com/watch?v=uemjIijtu2I}
 * <p>
 * Boundary Traversal of binary tree
 */


public class BoundaryTreeTraversal {

    static void printBoundary(Node node) {
        Queue<Node> que = new LinkedList<>();
        Stack<Node> st = new Stack<>();
        if (node != null) {
            que.add(node);
        }
        while (!que.isEmpty()) {
            LinkedList<Node> lists = new LinkedList<>();
            while (!que.isEmpty()) {
                lists.add(que.remove());
            }
            for (Node n : lists) {
                if (n.left != null) que.add(n.left);
                if (n.right != null) que.add(n.right);
            }
            System.out.print(lists.getFirst() + " ");
            if (lists.size() > 1)
                st.push(lists.getLast());
        }
        while (!st.isEmpty()) {
            System.out.print(st.pop().data);
        }

    }


}
