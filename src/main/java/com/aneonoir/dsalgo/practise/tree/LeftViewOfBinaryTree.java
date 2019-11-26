package com.aneonoir.dsalgo.practise.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * link: https://practice.geeksforgeeks.org/problems/left-view-of-binary-tree/1/
 * <p>
 * * solution: I did it using queue , bfs approach iterative.
 * * <p>
 * * TODO: can you solve it better , without using two loops?  What is the complexity of the problem  ?
 * * TODO: can you solve it in recursion ?
 */
public class LeftViewOfBinaryTree {
    void leftView(Node root) {

        Queue<Node> que = new LinkedList<>();
        if (root != null) {
            que.add(root);
        }
        while (!que.isEmpty()) {
            List<Node> list = new LinkedList<>();
            while (!que.isEmpty()) {
                list.add(que.remove());
            }
            for (int i = 0; i < list.size(); i++) {
                Node current = list.get(i);

                if (current.right != null) que.add(current.right);
                if (current.left != null) que.add(current.left);
                if (i == list.size() - 1) {
                    System.out.print(list.get(i).data + " ");
                }
            }
        }
    }
}

