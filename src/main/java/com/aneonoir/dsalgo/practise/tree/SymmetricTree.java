package com.aneonoir.dsalgo.practise.tree;

/**
 * link:
 * <p>
 * tag: interview, tree, symmetry
 * <p>
 * approach: recursive, TODO: iterative.
 * <p>
 * <p>
 * Some noteS:
 * I could not get my head around the recursive solution,
 * <p>
 * I am trying with the iterative solution: I will go with a que approach, bfs. I nevr did this.
 * <p>
 * Trying again with a recursive solution. I passed all the test cases.
 * Here my hinderance was the different scenarios. So here is how I approached it
 * <p>
 * null , null ( true) // node==null && node2==null;
 * <p>
 * val, null  ( false) // any other case;
 * null, val ( false) / / any other case;
 * <p>
 * val , val ( true) //When only node!=null && node2!=null
 * val, val1( false ) //When only node!=null && node2!=null
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root != null) {
            return isSym(root.left, root.right);
        } else {
            return true;
        }
    }

    private boolean isSym(TreeNode left, TreeNode right) {
        if (left != null && right != null) {
            return left.val == right.val &&
                    isSym(left.right, right.left) &&
                    isSym(left.left, right.right);
        } else return left == null && right == null;
    }

}
