package com.aneonoir.dsalgo.practise.tree.heap;

/**
 * link: https://practice.geeksforgeeks.org/problems/is-binary-tree-heap/1
 *
 * TODO: tell me what this works but binary search tree does'nt work this strategy ?
 *
 *
 * tag: easy , heap , binary heap , interview
 */
public class CheckBinaryTreeHeap {

    class Node
    {
        int data;
        Node left, right;
        Node(int item)
        {
            data = item;
            left = right = null;
        }
    }
    /*You are required to complete this method */
    boolean isHeap(Node tree) {
        if (tree != null) {
            boolean le = false;
            if (tree.left == null) {
                le = true;
            } else {
                le = tree.data > tree.left.data;
            }
            boolean re = false;
            if (tree.right == null) {
                re = true;
            } else {
                re = tree.data > tree.right.data;
            }
            return (le && re)
                    &&
                    isHeap(tree.left) && isHeap(tree.right);
        } else {
            return true;
        }
    }
}
