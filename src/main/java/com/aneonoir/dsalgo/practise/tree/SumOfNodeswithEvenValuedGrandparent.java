package com.aneonoir.dsalgo.practise.tree;

/**
 * link: https://leetcode.com/problems/sum-of-nodes-with-even-valued-grandparent/
 *
 * TODO: can you do it using bfs ?  iterative method using dfs ?
 *
 *
 * tag: twisted, tricky, tree,grandparent, interview.
 */
public class SumOfNodeswithEvenValuedGrandparent {


    public int sumEvenGrandparent(TreeNode root) {
        return sumEvenGrandParent(root, null, null);
    }

    int sumEvenGrandParent(TreeNode node, TreeNode parent, TreeNode grandParent) {
        if (node != null) {
            if (grandParent != null && grandParent.val % 2 == 0) {
                int val = node.val;
                return val + sumEvenGrandParent(node.left, node, parent) + sumEvenGrandParent(node.right, node, parent);
            }
            return sumEvenGrandParent(node.left, node, parent) + sumEvenGrandParent(node.right, node, parent);
        } else {
            return 0;
        }
    }
}
