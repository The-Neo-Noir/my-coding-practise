package com.aneonoir.dsalgo.practise.tree;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import static junit.framework.TestCase.assertEquals;

/**
 * link: https://leetcode.com/problems/binary-tree-pruning/
 * <p>
 * approach : a recursive one is very acceptable and intuitive.
 * <p>
 * TODO : Can you do it without using recursion ?
 * <p>
 * tag: interview, practise, tree, pruning, deleting nodes in tree,
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class BinarayTreePruning {

    @Test
    public void rootIsZero() {
        BinarayTreePruning binarayTreePruning = new BinarayTreePruning();
        TreeNode root = new TreeNode(0);

        TreeNode treeNode = binarayTreePruning.pruneTree(root);
        assertEquals(treeNode, null);
    }

    @Test
    public void rootWithLeftLeafZero() {
        BinarayTreePruning binarayTreePruning = new BinarayTreePruning();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(1);

        TreeNode treeNode = binarayTreePruning.pruneTree(root);
        assertEquals(null, treeNode.left);
        assertEquals(root.right, treeNode.right);
    }

    @Test
    public void rootWithLeftLeafZeroAndRight0WithLeft0AndRight1() {
        BinarayTreePruning binarayTreePruning = new BinarayTreePruning();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(0);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(1);

        TreeNode treeNode = binarayTreePruning.pruneTree(root);
        assertEquals(null, treeNode.left);
        assertEquals(root.right, treeNode.right);
        assertEquals(null, treeNode.right.left);
        assertEquals(root.right.right, treeNode.right.right);
    }

    @Test
    public void rootWithLeftLeafZeroAndRight0WithLeft0AndRight12() {
        BinarayTreePruning binarayTreePruning = new BinarayTreePruning();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(0);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(1);

        root.right.left.left = new TreeNode(0);
        root.right.left.right = new TreeNode(0);

        TreeNode treeNode = binarayTreePruning.pruneTree(root);
        assertEquals(null, treeNode.left);
        assertEquals(root.right, treeNode.right);
        assertEquals(null, treeNode.right.left);
        assertEquals(root.right.right, treeNode.right.right);
    }


    @Test
    public void rootWithLeftLeafZeroAndRight0WithLeft0AndRight123() {
        BinarayTreePruning binarayTreePruning = new BinarayTreePruning();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(1);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(1);


        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(0);

        TreeNode treeNode = binarayTreePruning.pruneTree(root);
        assertEquals(null, treeNode.left);
        assertEquals(root.right, treeNode.right);
        assertEquals(null, treeNode.right.left);
        assertEquals(root.right.right, treeNode.right.right);
    }


    @Test
    public void rootWithLeftLeafZeroAndRight0WithLeft0AndRight1234() {
        BinarayTreePruning binarayTreePruning = new BinarayTreePruning();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);
        root.right = new TreeNode(0);

        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(1);


        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(1);

        root.left.left.left = new TreeNode(0);

        TreeNode treeNode = binarayTreePruning.pruneTree(root);
        assertEquals(null, root.left.left.left);
        assertEquals(0, treeNode.right.val);
        assertEquals(null, treeNode.right.left);
        assertEquals(null, root.right.left);
    }

    public TreeNode pruneTree(TreeNode root) {
        if (root != null) {
            if (root.left == null && root.right == null) {
                return null;
            }
            prune(root, null, null);
        }
        return root;
    }

    public void prune(TreeNode root, TreeNode parent, String leftOrRight) {
        if (root != null) {
            if (root.left == null && root.right == null && root.val == 0) { // a node that is eligible for deletion .
                if (leftOrRight != null && leftOrRight.equals("left")) {
                    if (parent != null) parent.left = null;
                } else {
                    if (parent != null) parent.right = null;
                }
            }
            prune(root.left, root, "left");
            prune(root.right, root, "right");

            if (root.left == null && root.right == null && root.val == 0) { // a node that is eligible for deletion .
                if (leftOrRight != null && leftOrRight.equals("left")) {
                    if (parent != null) parent.left = null;
                } else {
                    if (parent != null) parent.right = null;
                }
            }
        }
    }
}

