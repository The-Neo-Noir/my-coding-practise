package com.aneonoir.dsalgo.practise.tree;

import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class TopView {

    public static void topView(Node root) {
        if (root != null) {
            if (root.left != null) {
                leftView(root.left);
            }
            System.out.print(root.data + " ");
            if (root.right != null) {
                rightView(root.right);
            }
        }
    }

    public static void leftView(Node node) {

        if (node.left != null) {
            leftView(node.left);
        }
        System.out.print(node.data + " ");
    }

    public static void rightView(Node node) {
        System.out.print(node.data + " ");
        if (node.right != null) {
            rightView(node.right);
        }
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while (t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        topView(root);
    }
}