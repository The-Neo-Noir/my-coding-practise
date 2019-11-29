package com.aneonoir.dsalgo.practise.tree;

import java.util.HashSet;

/**
 * link: https://leetcode.com/problems/find-elements-in-a-contaminated-binary-tree/
 * <p>
 * approach: pretty easy to construct the tree, and I was in limbo finding how to find in faster instead of looking for
 * every node which will be o(n) , then I thought could there is in logn solution for finding. What did not
 * come naturally to me was to put it in hashset to find it in o(1)
 * <p>
 * Runtime: 21 ms, faster than 86.47% of Java online submissions for Find Elements in a Contaminated Binary Tree.
 * <p>
 * tag: interview, tree,hashing
 * <p>
 * TODO: can you improve the runtime. see how others are doing it.
 */
public class FindElementsInAContaminatedBinaryTree {

    HashSet<Integer> s = new HashSet<>();

    public FindElementsInAContaminatedBinaryTree(TreeNode root) {
        root.val = 0;
        s.add(0);
        construct(root);
    }

    private void construct(TreeNode root) {
        if (root != null) {
            if (root.left != null) {
                root.left.val = 2 * root.val + 1;
                s.add(root.left.val);
                construct(root.left);
            }
            if (root.right != null) {
                root.right.val = 2 * root.val + 2;
                s.add(root.right.val);
                construct(root.right);
            }
        }
    }

    public boolean find(int target) {
        return s.contains(target);
    }
}
