package com.aneonoir.dsalgo.practise.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * link: https://practice.geeksforgeeks.org/problems/level-order-traversal/1
 * <p>
 * Level order traversal
 */
public class LevelOrderTraversalIterative {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(4);
        TreeNode treeNode1 = new TreeNode(3);


        TreeNode treeNode2 = new TreeNode(5);
        TreeNode treeNode2_left = new TreeNode(2);
        TreeNode treeNode2_right = new TreeNode(7);
        treeNode2.left = treeNode2_left;
        treeNode2.right = treeNode2_right;

        treeNode.left = treeNode1;
        treeNode.right = treeNode2;

        traverse(treeNode);
    }

    private static void traverse(TreeNode treeNode) {
        Queue<TreeNode> nodes = new LinkedList<>();

        if (treeNode != null) {
            nodes.add(treeNode);

        }
        while (!nodes.isEmpty()) {
            TreeNode treeNode1 = nodes.remove();
            if (treeNode1 != null) {
                System.out.println(treeNode1.val);
                nodes.add(treeNode1.left);
                nodes.add(treeNode1.right);
            }


        }
    }

}
