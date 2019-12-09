package com.aneonoir.dsalgo.practise.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * link: https://practice.geeksforgeeks.org/problems/reverse-alternate-levels-of-a-perfect-binary-tree/1
 * <p>
 * failed attempt: TODO again
 */
public class ReverseAlternateLevelsOfAPerfectBinaryTree {

    public static void main(String[] args) {
        Node n = new Node(0);
        n.left = new Node(1);
        n.right = new Node(2);
        n.left.left = new Node(3);
        n.left.right = new Node(4);
        n.right.left = new Node(5);
        n.right.right = new Node(6);

        ReverseAlternateLevelsOfAPerfectBinaryTree reverseAlternateLevelsOfAPerfectBinaryTree = new ReverseAlternateLevelsOfAPerfectBinaryTree();
        reverseAlternateLevelsOfAPerfectBinaryTree.reverseAlternate(n);

    }


    void reverseAlternate(Node node) {
        Queue<Node> que = new LinkedList<>();
        if (node != null) que.add(node);
        int level = 0;
        while (!que.isEmpty()) {
            List<Node> list = new LinkedList<>();
            while (!que.isEmpty()) {
                list.add(que.remove());
            }
            for (Node n : list) {
                if (level % 2 == 0) {
                    if (n.right != null || n.left != null) {
                        System.out.println(n.left + " " + n.right);
                        int temp = n.right.data;
                        n.right.data = n.left.data;
                        n.left.data = temp;
                    }
                }
                if (n.left != null) que.add(n.left);
                if (n.right != null) que.add(n.right);
            }
            level++;
        }
    }
}
