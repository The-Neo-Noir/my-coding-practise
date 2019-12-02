package com.aneonoir.dsalgo.practise.tree;

/**
 * link: https://leetcode.com/problems/sum-root-to-leaf-numbers/
 */
public class SumRootToLeafNumbers {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        SumRootToLeafNumbers sumRootToLeafNumbers = new SumRootToLeafNumbers();
        String i = sumRootToLeafNumbers.sumNumbers(0, root);
        System.out.println(i);
    }

    public String sumNumbers(int val, TreeNode root) {

        if (root == null) {
            return "";
        } else {
            return root.val + "" + "->" + sumNumbers(root.val, root.left) +
                    root.val + "R>" + sumNumbers(root.val, root.right);
        }
    }
}
