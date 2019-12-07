package com.aneonoir.dsalgo.practise.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * link: https://practice.geeksforgeeks.org/problems/maximum-node-level/1
 * <p>
 * <p>
 * tag: bfs,tree,iterative bfs.
 */
public class MaximumNodeLevel {
    public static int maxNodeLevel(Node node) {
        Queue<Node> que = new LinkedList<>();
        if (node == null) return 0;
        if (node != null) que.add(node);
        int maxSofar = 0;
        int level = 0;
        int result = 0;
        while (!que.isEmpty()) {
            List<Node> list = new LinkedList<>();
            while (!que.isEmpty()) {
                list.add(que.remove());
            }
            if (maxSofar < list.size()) {
                result = level;
                maxSofar = list.size();
            }
            for (Node n : list) {
                if (n.left != null) que.add(n.left);
                if (n.right != null) que.add(n.right);
            }
            level++;
        }
        return result;
    }
}
