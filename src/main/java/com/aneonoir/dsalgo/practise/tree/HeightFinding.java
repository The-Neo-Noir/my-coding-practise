//package com.aneonoir.dsalgo.practise.tree;
//
//import java.util.ArrayDeque;
//import java.util.Queue;
//
///**
// * https://www.hackerrank.com/challenges/tree-height-of-a-binary-tree/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=trees
// */
//public class HeightFinding {
//
//    class Node {
//        Node left;
//        Node right;
//        int data;
//
//        Node(int data) {
//            this.data = data;
//            left = null;
//            right = null;
//        }
//    }
//
//    class Solution {
//
//        /*
//        class Node
//            int data;
//            Node left;
//            Node right;
//        */
//        public static int height(Node root) {
//            Queue<QueNode> queue = new ArrayDeque<>();
//            if (root != null) {
//                queue.add(new QueNode(root, 0));
//            }
//            int count = 0;
//            while (queue.size() > 0) {
//                QueNode current = queue.poll();
//                if (current.node.left == null && current.node.right == null) {
//                    count = current.depth;
//                }
//                if (current.node.left != null) {
//                    queue.add(new QueNode(current.node.left, current.depth + 1));
//                }
//                if (current.node.right != null) {
//                    queue.add(new QueNode(current.node.right, current.depth + 1));
//                }
//            }
//            return count;
//        }
//
//        public static Node insert(Node root, int data) {
//            if (root == null) {
//                return new Node(data);
//            } else {
//                Node cur;
//                if (data <= root.data) {
//                    cur = insert(root.left, data);
//                    root.left = cur;
//                } else {
//                    cur = insert(root.right, data);
//                    root.right = cur;
//                }
//                return root;
//            }
//        }
//
//        public static void main(String[] args) {
//            Scanner scan = new Scanner(System.in);
//            int t = scan.nextInt();
//            Node root = null;
//            while (t-- > 0) {
//                int data = scan.nextInt();
//                root = insert(root, data);
//            }
//            scan.close();
//            int height = height(root);
//            System.out.println(height);
//        }
//
//        static class QueNode {
//            Node node;
//            int depth;
//
//            QueNode(Node node, int depth) {
//                this.node = node;
//                this.depth = depth;
//            }
//        }
//    }
//}
