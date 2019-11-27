package com.aneonoir.dsalgo.practise.tree;

import java.util.Set;
import java.util.TreeSet;

/**
 * link: https://leetcode.com/problems/second-minimum-node-in-a-binary-tree/submissions/
 * approadh:
 * I thought inorder traversal will be good enough with duplicates being removed by using a linkedHashset, it turns out I read the question wrong , I had assumed it like a binary search tree.
 * <p>
 * NOw I used a TreeSet to hold the data and sort automatically .
 * <p>
 * Set Don't have get method.
 * <p>
 * Runtime: 2 ms, faster than 5.22% of Java online submissions for Second Minimum Node In a Binary Tree.
 * <p>
 * Bad runtime: TreeSet to blame. Can you do better?
 * <p>
 * TODO:
 * tag: interview,tree,
 */
public class SecondMinimumNodeInABinaryTree {
    public int findSecondMinimumValue(TreeNode root) {
        TreeSet<Integer> ls = new TreeSet<>();
        intr(root, ls);
        System.out.println(ls);
        if (ls.size() <= 1) return -1;
        int counter = 1;
        int result = -1;
        for (Integer l : ls) {
            if (counter == 2) {
                result = l;
                break;
            }
            counter++;
        }
        return result;
    }

    public void intr(TreeNode root, Set<Integer> ls) {
        if (root != null) {
            intr(root.left, ls);
            ls.add(root.val);
            intr(root.right, ls);
        }
    }
}
