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
        return null;
    }


    private String binaryTreePath(TreeNode root, StringBuffer sbr) {
        if (root.left == null && root.right == null) {
            return sbr.toString() + "" + root.val + "";
        } else {
            String s = "";
            String ts = "";
            StringBuffer sb = new StringBuffer();
            if (root.left != null) {

                s = binaryTreePath(root.left, sb.append(root.val + "->"));
            }
            if (root.right != null) {

                ts = binaryTreePath(root.right, sb.append(root.val + "->"));
            }
            return s + ts;
        }
    }
}
