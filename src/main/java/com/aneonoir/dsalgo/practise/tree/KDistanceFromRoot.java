package com.aneonoir.dsalgo.practise.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * link: https://practice.geeksforgeeks.org/problems/k-distance-from-root/1/
 * <p>
 * tag: interview, tree,distance from root.
 * <p>
 * TODO : recursively
 */
public class KDistanceFromRoot {
    void printKdistance(Node root, int k) {
        Queue<Node> que = new LinkedList<>();
        if (root == null) System.out.print(0);
        if (root != null) {
            que.add(root);
        }
        int level = 0;
        while (!que.isEmpty()) {
            List<Node> list = new LinkedList<>();
            while (!que.isEmpty()) {
                list.add(que.remove());
            }
            for (Node n : list) {
                if (level == k) System.out.print(n.data + " ");
                if (n.left != null) que.add(n.left);
                if (n.right != null) que.add(n.right);
            }
            level++;
        }
    }
}
