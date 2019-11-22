package com.aneonoir.dsalgo.practise.tree;

/**
 * link: https://practice.geeksforgeeks.org/problems/level-of-a-node-in-binary-tree/1
 * <p>
 * solution: pretty straight forward recursive solution
 * <p>
 * TODO: can you do it iteratively ?
 */
public class LevelOfANodeInBinaryTree {
    public static int getLevel(Node root, int key) {
        if (root == null) {
            return 0;
        } else {
            return getLevel(root, key, 1);
        }
    }

    private static int getLevel(Node root, int key, int level) {
        if (root != null) {
            if (root.data == key) {
                return level;
            } else {
                return getLevel(root.left, key, level + 1) + getLevel(root.right, key, level + 1);
            }
        } else {
            return 0;
        }
    }
}
