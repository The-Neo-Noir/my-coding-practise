package com.aneonoir.dsalgo.practise.tree;

import java.util.Scanner;

/**
 * link: https://practice.geeksforgeeks.org/problems/preorder-to-postorder/0
 * <p>
 * struggle: bit of struggle in array index.
 * <p>
 * approach: created the tree from the preorder bst and then printed it to postorder
 * <p>
 * todo: can you do it iteratively ?
 * <p>
 * tag: interview, medium level, tree.
 */
public class PrintPostOrderFromPreorderBST {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            int i = 0;
            while (n-- > 0) {
                arr[i++] = sc.nextInt();
            }
            TreeNode node = buildTree(arr, 0, arr.length - 1);
            postorder(node);
            System.out.println();
        }
    }

    private static void postorder(TreeNode n) {
        if (n != null) {
            postorder(n.left);
            postorder(n.right);
            System.out.print(n.val + " ");
        }
    }

    private static TreeNode buildTree(int a[], int lowIndex, int highIndex) {

        //    0  1  2  3  4   5   6  7
        // 40 30 32 35 80 90 100 120
        TreeNode node = null;
        if (lowIndex <= highIndex) {
            node = new TreeNode(a[lowIndex]);
            int leftHigh = lowIndex + 1;
            for (int i = lowIndex + 1; i <= highIndex; i++) {
                if (a[i] > node.val) {
                    leftHigh = i;
                    break;
                }
            }
            node.left = buildTree(a, lowIndex + 1, leftHigh - 1);
            node.right = buildTree(a, leftHigh, highIndex);
            return node;
        } else {
            return node;
        }
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
}
