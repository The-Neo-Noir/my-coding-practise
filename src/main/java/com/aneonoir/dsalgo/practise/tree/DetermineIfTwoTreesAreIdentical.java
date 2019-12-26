package com.aneonoir.dsalgo.practise.tree;

/**
 * link: https://practice.geeksforgeeks.org/problems/determine-if-two-trees-are-identical/1
 * <p>
 * approach: recusive,
 * <p>
 * tag: identical, tree, interview, same tree
 * <p>
 * TODO: recursive
 */
public class DetermineIfTwoTreesAreIdentical {

    boolean isIdentical(Node root1, Node root2) {
        if (root1 != null && root2 != null) {
            return root1.data == root2.data &&
                    isIdentical(root1.left, root2.left) &&
                    isIdentical(root1.right, root2.right);
        } else return root1 == null && root2 == null;
    }
}
