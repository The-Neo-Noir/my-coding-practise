package com.aneonoir.dsalgo.practise.tree;

import java.util.LinkedList;
import java.util.List;

/**
 * link: https://www.lintcode.com/problem/find-leaves-of-binary-tree/description
 * <p>
 * todo: failed test cases
 * <p>
 * tag: interview, medium, tree,
 */
public class FindLeavesBinaryTree {
    public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> list = new LinkedList<>();

        if (root != null) {
            List<TreeNode> levels = new LinkedList<>();
            LinkedList<Integer> leaves = new LinkedList<>();
            levels.add(root);
            findLeaves(list, levels, leaves);
            list.add(0, leaves);
        }
        return list;
    }

    public void findLeaves(List<List<Integer>> list, List<TreeNode> levels, LinkedList<Integer> leaves) {
        if (levels.size() > 0) {
            LinkedList<Integer> nonLeaves = new LinkedList<>();
            List<TreeNode> toLevels = new LinkedList<>();
            for (int i = levels.size() - 1; i >= 0; i--) {
                TreeNode levelItem = levels.get(i);
                if (levelItem.left == null && levelItem.right == null) {
                    leaves.addFirst(levelItem.val);
                } else {
                    nonLeaves.addFirst(levelItem.val);
                }
                if (levelItem.left != null) toLevels.add(levelItem.left);
                if (levelItem.right != null) toLevels.add(levelItem.right);
            }
            if (nonLeaves.size() > 0)
                list.add(0, nonLeaves);
            findLeaves(list, toLevels, leaves);
        }

    }

}
