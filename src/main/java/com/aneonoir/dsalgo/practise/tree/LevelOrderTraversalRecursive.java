package com.aneonoir.dsalgo.practise.tree;

import java.util.ArrayList;
import java.util.List;

public class LevelOrderTraversalRecursive {

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
        List<TreeNode> treeNodes = new ArrayList<>();
        treeNodes.add(treeNode);
        recursive(treeNodes);

    }

    private static void recursive(List<TreeNode> treeNodes) {
        ArrayList<TreeNode> objects = new ArrayList<>();
        if (treeNodes.size() != 0) {
            for (TreeNode treeNode : treeNodes) {
                System.out.println(treeNode.val);
                if (treeNode.left != null) {
                    objects.add(treeNode.left);
                }
                if (treeNode.right != null) {
                    objects.add(treeNode.right);
                }
            }
            recursive(objects);
        }
    }
}
