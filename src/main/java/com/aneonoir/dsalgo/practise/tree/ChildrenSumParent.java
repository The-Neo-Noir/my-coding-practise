package com.aneonoir.dsalgo.practise.tree;

/**
 * link: https://practice.geeksforgeeks.org/problems/children-sum-parent/1
 * <p>
 * <p>
 * tag: tree,interview, warm up.
 */
public class ChildrenSumParent {

    public static int isSumProperty(Node node) {
        return isSumProperty2(node) == true ? 1 : 0;
    }

    private static boolean isSumProperty2(Node node) {
        if (node != null) {
            if (node.left == null && node.right == null) {
                return true;
            } else {
                int left = node.left == null ? 0 : node.left.data;
                int right = node.right == null ? 0 : node.right.data;
                return node.data == left + right &&
                        isSumProperty2(node.left) &&
                        isSumProperty2(node.right);
            }
        } else {
            return true;
        }
    }
}
