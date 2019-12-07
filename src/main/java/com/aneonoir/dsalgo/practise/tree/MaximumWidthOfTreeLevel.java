package com.aneonoir.dsalgo.practise.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * link: https://practice.geeksforgeeks.org/problems/maximum-width-of-tree/1/
 * <p>
 * approach: used a bfs iterative approach.
 * <p>
 * TODO: can you do it recursively.
 * <p>
 * tags: tree, interview, width of tree
 */
public class MaximumWidthOfTreeLevel {
    int getMaxWidth(Node root) {
        Queue<Node> que = new LinkedList<>();
        if (root == null) return 0;
        if (root != null) que.add(root);
        int maxSofar = 0;
        while (!que.isEmpty()) {
            List<Node> list = new LinkedList<>();
            while (!que.isEmpty()) {
                list.add(que.remove());
            }
            if (maxSofar < list.size()) {
                maxSofar = list.size();
            }
            for (Node n : list) {
                if (n.left != null) que.add(n.left);
                if (n.right != null) que.add(n.right);
            }
        }
        return maxSofar;

    }
}
