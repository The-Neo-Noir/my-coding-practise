package com.aneonoir.dsalgo.practise.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * link: https://leetcode.com/problems/binary-tree-right-side-view/
 * <p>
 * approach: My intuitin says, If I do level order traversal and at each level , if I add the element first removed from the que then that should solve it.
 * This intuition worked, solved pretty fast .
 * <p>
 * TODO:  Can you do it recursively ?
 */
public class BinaryTreeRightSideView {

    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<>();
        if (root != null) {
            que.add(root);
        }
        List<Integer> result = new LinkedList<>();
        while (!que.isEmpty()) {
            List<TreeNode> list = new LinkedList<>();
            boolean isFirst = true;
            while (!que.isEmpty()) {
                TreeNode n = que.remove();
                if (isFirst) {
                    result.add(n.val);
                }
                isFirst = false;
                list.add(n);
            }
            for (TreeNode node : list) {
                if (node.right != null) que.add(node.right);
                if (node.left != null) que.add(node.left);
            }

        }
        return result;
    }
}
