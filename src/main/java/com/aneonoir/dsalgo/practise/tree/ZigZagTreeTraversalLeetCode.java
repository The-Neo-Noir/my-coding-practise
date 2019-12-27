package com.aneonoir.dsalgo.practise.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZagTreeTraversalLeetCode {
    public static void main(String[] args) {
        ZigZagTreeTraversalLeetCode zigZagTreeTraversalLeetCode = new ZigZagTreeTraversalLeetCode();
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        treeNode.right = new TreeNode(20);
        treeNode.right.left = new TreeNode(15);
        treeNode.right.right = new TreeNode(7);

        List<List<Integer>> lists = zigZagTreeTraversalLeetCode.zigzagLevelOrder(treeNode);
        System.out.println(lists);

    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> result = new LinkedList<>();
        Queue<TreeNode> que = new LinkedList<>();
        if (root != null) {
            que.add(root);
        }
        int counter = 0;
        while (!que.isEmpty()) {
            List<TreeNode> list = new LinkedList<>();

            while (!que.isEmpty()) {
                list.add(que.remove());
            }
            LinkedList<Integer> l = new LinkedList();
            if (counter % 2 == 0) {
                for (int i = 0; i < list.size(); i++) {
                    l.add(list.get(i).val);
                }
            } else {
                for (int i = list.size() - 1; i >= 0; i--) {
                    l.add(list.get(i).val);
                }
            }
            for (TreeNode node : list) {

                if (node.left != null) que.add(node.left);
                if (node.right != null) que.add(node.right);

            }
            counter++;
            result.add(l);
        }
        return result;
    }

}
