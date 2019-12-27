package com.aneonoir.dsalgo.practise.tree;

/**
 * link: https://leetcode.com/problems/sum-root-to-leaf-numbers/
 *
 * appraoch: a recursive approach is much more intuitive
 *
 * tag: interview,
 *
 * TODO: iterative appraoch, can you do it mathematically ( not using a string )
 *
 *
 */
public class SumRootToLeafNumbers {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        SumRootToLeafNumbers sumRootToLeafNumbers = new SumRootToLeafNumbers();
        //  String i = sumRootToLeafNumbers.sumNumbers(0, root);
        //  System.out.println(i);
    }

    public int sumNumbers(TreeNode root) {
        if (root != null) {
            return sumNumbers(root, "");
        } else {
            return 0;
        }
    }

    public int sumNumbers(TreeNode root, String in) {
        if (root != null) {
            String val = in + "" + root.val;
            if (root.left == null && root.right == null) {
                return Integer.parseInt(val);
            }
            return sumNumbers(root.left, val) + sumNumbers(root.right, val);

        } else {
            return 0;
        }
    }
}