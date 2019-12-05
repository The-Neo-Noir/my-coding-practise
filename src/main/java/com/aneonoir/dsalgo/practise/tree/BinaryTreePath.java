package com.aneonoir.dsalgo.practise.tree;

import java.util.List;

/**
 * a Major struggle
 */
public class BinaryTreePath {

    public static void main(String[] args) {

        BinaryTreePath binaryTreePath = new BinaryTreePath();

        TreeNode no = new TreeNode(1);
        no.left = new TreeNode(2);
        no.right = new TreeNode(3);
        no.left.right = new TreeNode(4);

        binaryTreePath.binaryTreePaths(no);
    }

    public List<String> binaryTreePaths(TreeNode root) {
        String strings = binaryTreePath(root, new StringBuffer());
        System.out.println(strings);
        return null;
    }


    private String binaryTreePath(TreeNode root, StringBuffer sbr) {
        if (root.left == null && root.right == null) {
            System.out.println(root.val + "");
            return root.val + "";
        } else {
            String rootS = root.val + "->";
            String rootR = root.val + "->";
            if (root.left != null)
                rootS += binaryTreePath(root.left, sbr);
            if (root.right != null) {
                rootR += binaryTreePath(root.right, sbr);
            }
            return rootS + "SSS" + rootR;
        }
    }
}
