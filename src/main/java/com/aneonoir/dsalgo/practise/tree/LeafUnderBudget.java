package com.aneonoir.dsalgo.practise.tree;

/**
 * link: https://practice.geeksforgeeks.org/problems/leaf-under-budget/1
 * <p>
 * TODO: Its not yet done
 */
public class LeafUnderBudget {
    public int getCount(Node node, int bud) {
        return getCount(node, 1, bud);
    }

    private int getCount(Node node, int level, int bud) {
        if (node != null) {
            if (node.left == null & node.right == null) {
                return level <= bud ? level : 0;
            }
            return getCount(node.left, level + 1, bud) + getCount(node.right, level + 1, bud);
        } else {
            return 0;
        }
    }
}
