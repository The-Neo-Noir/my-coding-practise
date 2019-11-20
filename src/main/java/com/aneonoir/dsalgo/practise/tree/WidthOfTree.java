package com.aneonoir.dsalgo.practise.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 */
public class WidthOfTree {

    public int widthOfBinaryTree(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<>();
        int count = 0;
        if (root != null) {
            que.add(root);
            count = 1;
        }
        while (!que.isEmpty()) {
            List<TreeNode> list = new LinkedList<>();
            while (!que.isEmpty()) {
                list.add(que.remove());
            }
            int nullCount = 0;
            for (TreeNode node : list) {
                if (node == null) {
                    que.add(null);
                    que.add(null);
                    nullCount++;
                } else {
                    que.add(node.left);
                    que.add(node.right);
                }
            }
            if (nullCount == list.size()) {
                break;
            }

            int maxCurrent = countWidth(list);
            if (count < maxCurrent) {
                count = maxCurrent;
            }
        }
        return count;
    }

    private int countWidth(List<TreeNode> list) {
        if (list.size() == 0) {
            return 0;
        } else {
            int leftPtr = 0;
            int rightPtr = list.size() - 1;
            System.out.println(list);
            while (true) {
                if (leftPtr < rightPtr) {
                    if (list.get(leftPtr) == null) {
                        leftPtr++;
                    }
                    if (list.get(rightPtr) == null) {
                        rightPtr--;
                    }
                    if (list.get(leftPtr) != null && list.get(rightPtr) != null) {
                        break;
                    }
                } else {
                    break;
                }

            }
            if (leftPtr + 1 == rightPtr &&
                    list.get(leftPtr) == null &&
                    list.get(rightPtr) == null) {
                return 0;
            }
            return (rightPtr - leftPtr) + 1;
        }

    }
}
