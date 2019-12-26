package com.aneonoir.dsalgo.practise.tree;

/**
 * link: https://practice.geeksforgeeks.org/problems/root-to-leaf-paths/1
 * <p>
 * <p>
 * TODO: 1. iterative.
 * 2. can you do it with the -> inbetween ?
 * tag: print, root to leaf, tree, interview.
 */
public class RootToLeafPath {

    public void printPaths(Node root) {
        printPaths(root, "");
    }

    private void printPaths(Node root, String sbr) {
        if (root != null) {
            String sb = sbr + "" + root.data + " ";
            if (root.left == null && root.right == null) {
                System.out.print(sb + "#");
            }

            printPaths(root.left, sb);
            printPaths(root.right, sb);
        }
    }
}