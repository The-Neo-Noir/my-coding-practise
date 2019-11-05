package com.aneonoir.dsalgo.practise.tree;

/**
 * link: https://www.geeksforgeeks.org/find-n-th-node-inorder-traversal/
 * stuggle , TODO : stuggle in finding the count and matching loation in the code .
 * <p>
 * tags: interview
 */
public class FIndNthNodeInOrderTraversal {

    static int j = 0;

    public static void main(String[] args) {
        TreeNode t = new TreeNode(10);
        t.left = new TreeNode(20);
        t.right = new TreeNode(30);
        t.left.left = new TreeNode(40);
        t.left.right = new TreeNode(50);

        findNthNodeInOrder(t, 4);
    }

    private static void findNthNodeInOrder(TreeNode t, int i) {
        if (t != null) {


            findNthNodeInOrder(t.left, i);
            j++;
            if (j == i) {
                System.out.println("Found " + t.val);
            }
            System.out.println(t.val);

            findNthNodeInOrder(t.right, i);
        }
    }
}
//       [10] 1
////  [20]2  [30]
////[40]3  [50]
//40,20,10,50,30