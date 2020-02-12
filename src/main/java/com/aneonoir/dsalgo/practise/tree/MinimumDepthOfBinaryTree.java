package com.aneonoir.dsalgo.practise.tree;

/**
 * link: https://leetcode.com/problems/minimum-depth-of-binary-tree/
 * <p>
 * https://leetcode.com/problems/minimum-depth-of-binary-tree/
 * <p>
 * <p>
 * Some good learning:
 * > use ^ when you wanto check if either of two exp is true.
 * > YOU can easily get this question wrong.
 * <p>
 * <p>
 * <p>
 * [3]
 * [3,4]
 * [3,9,20,null,null,15,7,343,3,null,null,null,4]
 * [3,9,20,2,null,15,7,343,3,null,null,null,4]
 * [3,9,20,3,4,15,7,343,3,null,null,null,4]
 * <p>
 * tag: interview, easy to get it wrong, tree,recursion.
 *
 * TODO: catch, you can easily get this one wrong.
 *
 * related: Target Sum(https://leetcode.com/problems/target-sum/)
 * Equal Tree Partition ( https://leetcode.com/problems/equal-tree-partition/)
 * Number of Distinct Islands II( https://leetcode.com/problems/number-of-distinct-islands-ii/)
 *
 */
public class MinimumDepthOfBinaryTree {

    public int minDepth(TreeNode root) {
        return depth(root, 1);
    }

    private int depth(TreeNode root, int depth) {
        if (root != null) {
            if (root.left == null ^ root.right == null) {
                return Math.max(depth(root.left, depth + 1), depth(root.right, depth + 1));
            }
            return Math.min(depth(root.left, depth + 1), depth(root.right, depth + 1));
        } else {
            return depth - 1;
        }
    }
}