package com.aneonoir.dsalgo.practise.tree;

public class TreeFromInorderAndPostOrderTraversal {
    public static void main(String[] args) {
        int inorder[] = {9, 3, 15, 20, 7};
        int postorder[] = {9, 15, 7, 20, 3};
//          int inorder[] = {1,2};
//        int postorder[] = {2,1};
        TreeFromInorderAndPostOrderTraversal treeFromInorderAndPostOrderTraversal = new TreeFromInorderAndPostOrderTraversal();
        TreeNode treeNode = treeFromInorderAndPostOrderTraversal.buildTree(inorder, postorder);
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        TreeNode root = new TreeNode(postorder[postorder.length - 1]);
        buildTree(root, 0, inorder.length - 1, inorder,
                0, postorder.length - 1, postorder, null);
        return root;
    }

    public void buildTree(TreeNode root, int lowI, int highI, int inorder[],
                          int lowP, int highP, int postorder[], String dir) {
        if (lowI <= highI || lowP <= highP) {

            int rootVal = postorder[highP];
            TreeNode rootC = null;
            if (highP == postorder.length - 1) {
                rootC = root;
            } else {
                if (dir.equals("left")) {
                    root.left = new TreeNode(rootVal);
                    rootC = root.left;
                } else {
                    root.right = new TreeNode(rootVal);
                    rootC = root.right;
                }
            }

            int indexFound = 0;
            for (int i = lowI; i <= highI; i++) {
                if (rootVal == inorder[i]) {
                    indexFound = i;
                    break;
                }
            }
            buildTree(rootC, lowI, indexFound - 1, inorder,
                    lowP, lowP + (indexFound - 1 - lowI), postorder,
                    "left");
            buildTree(rootC, indexFound + 1, highI, inorder,
                    lowP + 1, highP - 1, postorder,
                    "right");
        }

    }
}
