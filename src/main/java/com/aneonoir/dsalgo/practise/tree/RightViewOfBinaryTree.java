package com.aneonoir.dsalgo.practise.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * link: https://practice.geeksforgeeks.org/problems/right-view-of-binary-tree/1
 * <p>
 * solution: I did it using queue , bfs approach iterative.
 * <p>
 * TODO: can you solve it better , without using two loops?  What is the complexity of the problem  ?
 * TODO: can you solve it in recursion ?
 */
public class RightViewOfBinaryTree {
    void rightView(Node node) {
        Queue<Node> que = new LinkedList<>();
        if (node != null) {
            que.add(node);
        }
        while (!que.isEmpty()) {
            List<Node> list = new LinkedList<>();
            while (!que.isEmpty()) {
                list.add(que.remove());
            }
            for (int i = 0; i < list.size(); i++) {
                Node n = list.get(i);

                if (n.left != null) {
                    que.add(n.left);
                }
                if (n.right != null) {
                    que.add(n.right);
                }
                if (i == list.size() - 1) {
                    System.out.print(list.get(i).data + " ");
                }
            }
        }
    }
}
