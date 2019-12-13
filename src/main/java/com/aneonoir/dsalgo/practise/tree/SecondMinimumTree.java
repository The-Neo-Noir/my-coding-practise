package com.aneonoir.dsalgo.practise.tree;

import java.util.TreeSet;

/**
 * link: https://www.lintcode.com/problem/second-minimum-node-in-a-binary-tree/description
 * <p>
 * todo: tree,
 * <p>
 * approach is easy,solved it,  but put some brain into it.It could have been done much easier way .
 */
public class SecondMinimumTree {
    public int findSecondMinimumValue(TreeNode root) {
        TreeSet<Integer> in = new TreeSet<>();
        findSecondMinimumValue(root, in);
        if (in.size() < 2) return -1;
        int count = 1;
        int result = -1;
        for (Integer s : in) {
            System.out.println(s);
            if (count == 2) {
                result = s;
            }
            count++;
        }
        return result;
    }

    public void findSecondMinimumValue(TreeNode root, TreeSet<Integer> in) {
        if (root != null) {
            findSecondMinimumValue(root.left, in);
            in.add(root.val);
            findSecondMinimumValue(root.right, in);
        }
    }
}
