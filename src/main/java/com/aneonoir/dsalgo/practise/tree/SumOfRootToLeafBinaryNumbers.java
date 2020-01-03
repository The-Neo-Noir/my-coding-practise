package com.aneonoir.dsalgo.practise.tree;

/**
 * link: https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/submissions/
 *
 * appraoch: recursive, and using MSB calculation to do the addition .
 *
 * tag: recursion, tree,binary , bitwise, binary number to decimal conversion, interview.
 *
 * TODO: can you do it iteratively ?
 * 
 */
public class SumOfRootToLeafBinaryNumbers {
    public int sumRootToLeaf(TreeNode root) {
        if (root != null) {
            return sumRootToLeaf(root, 0);
        }
        return 0;
    }

    public int sumRootToLeaf(TreeNode root, int num) {
        if (root != null) {
            int res = (num << 1) + root.val;
            if (root.left == null && root.right == null) {
                return res;
            }
            return sumRootToLeaf(root.left, res) + sumRootToLeaf(root.right, res);
        } else {
            return 0;
        }
    }
}
