package com.aneonoir.dsalgo.practise.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * link: https://practice.geeksforgeeks.org/problems/level-order-traversal-in-spiral-form/1
 * approach : is pretty straight forward, but little tricky.
 * <p>
 * TODO: can you do recursive ??
 * tag: level order traversal,traversal,level,tree,interview
 */
public class LevelOrderSpiralTraversal {
    void printSpiral(Node node) {
        Queue<Node> que = new LinkedList<>();
        if (node != null) {
            que.add(node);
        }
        int counter = 0;
        List<Node> list = new LinkedList<>();
        while (!que.isEmpty()) {
            List<Node> local = new LinkedList<>();
            Stack<Node> st = new Stack<>();
            while (!que.isEmpty()) {
                Node ele = que.remove();
                local.add(ele);
                if (counter % 2 == 0) {
                    st.push(ele);
                }
            }

            while (!st.isEmpty()) {
                list.add(st.pop());
            }
            for (Node lo : local) {
                if (lo.left != null) que.add(lo.left);
                if (lo.right != null) que.add(lo.right);
                if (counter % 2 != 0) {
                    list.add(lo);
                }
            }
            counter++;
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i).data + " ");
        }
    }
}
