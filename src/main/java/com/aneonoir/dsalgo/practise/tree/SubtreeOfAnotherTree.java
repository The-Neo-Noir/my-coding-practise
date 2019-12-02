package com.aneonoir.dsalgo.practise.tree;

/**
 * link: https://leetcode.com/problems/subtree-of-another-tree/
 * <p>
 * approach: find the maching root node and then check if two trees are equal.
 * <p>
 * Failed test cases: What if the items are duplicate. this is when I failed.  Need to work on it .
 * <p>
 * tag: TODO, interview, tree , same tree .
 */
public class SubtreeOfAnotherTree {
    TreeNode matching = null;

    public boolean isSubtree(TreeNode s, TreeNode t) {
        //find the matching node ,
        findNode(s, t.val);
        if (matching == null) {
            return false;
        } else {
            return ismatch(matching, t);
        }
    }

    private boolean ismatch(TreeNode s, TreeNode t) {
        if (s == null && t == null) {
            return true;
        } else {
            if (s != null && t != null) {
                return s.val == t.val && ismatch(s.left, t.left) && ismatch(s.right, t.right);
            } else {
                return false;
            }
        }
    }

    private void findNode(TreeNode root, int val) {
        if (root != null) {
            if (root.val == val) {
                System.out.println("matched");
                matching = root;
            } else {
                findNode(root.left, val);
                findNode(root.right, val);
            }
        }
    }
}
