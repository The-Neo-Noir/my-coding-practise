package com.aneonoir.dsalgo.practise.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * link: https://practice.geeksforgeeks.org/problems/leaf-at-same-level/1/
 * <p>
 * appraoch: iterative,bfs
 * <p>
 * There were a bit of struggle.
 * <p>
 * TODO : can you do it recursively.
 * <p>
 * tag: tree,leaf level,interview
 */
public class LeafAtSameLevel {
    public static void main(String[] args) {
        LeafAtSameLevel leafAtSameLevel = new LeafAtSameLevel();
        Node n = new Node(10);
        n.left = new Node(20);
        n.right = new Node(60);

//        n.left.left = new Node(40);
//        n.left.right = new Node(30);
        boolean check = leafAtSameLevel.check(n);
        System.out.println(check);
    }

    boolean check(Node root) {
        boolean result = false;
        Queue<Node> que = new LinkedList<>();
        if (root != null) que.add(root);
        boolean leafFound = false;
        while (!que.isEmpty()) {
            List<Node> list = new LinkedList<>();
            while (!que.isEmpty()) {
                list.add(que.remove());
            }
            boolean local = true;
            if (leafFound) {
                result = false;
                break;
            }
            for (Node n : list) {
                if (n.left == null && n.right == null) {
                    local &= true;
                    leafFound = true;
                } else {
                    local &= false;
                }
                if (n.left != null) que.add(n.left);
                if (n.right != null) que.add(n.right);
            }
            result = local;
            if (local == true) {
                break;
            }
        }
        return result;
    }
}

