package com.aneonoir.dsalgo.practise.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * link: https://practice.geeksforgeeks.org/problems/zigzag-tree-traversal/1
 * approach: level order traveral with check for even or odd.
 * <p>
 * tag: interview, tree , zigzag traversal.
 */
public class ZipZagTreeTraversal {

    void zigZagTraversal(TreeNode root) {
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
            if (counter % 2 != 0) {
                for (int i = 0; i < list.size(); i++) {
                    System.out.print(list.get(list.size() - 1 - i).val + " ");
                    TreeNode node = list.get(i);
                    if (node.left != null) que.add(node.left);
                    if (node.right != null) que.add(node.right);
                }
            } else {
                for (TreeNode node : list) {
                    System.out.print(node.val + " ");
                    if (node.left != null) que.add(node.left);
                    if (node.right != null) que.add(node.right);
                }
            }
            counter++;
        }
    }
}
