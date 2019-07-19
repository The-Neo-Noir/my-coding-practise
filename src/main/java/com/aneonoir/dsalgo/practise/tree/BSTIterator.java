package com.aneonoir.dsalgo.practise.tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * link: https://leetcode.com/problems/binary-search-tree-iterator/submissions/
 * <p>
 * approach: I have used a list to hold the data from the treeas in inroder , and used iteratior from java
 * library to handle the hasnext and next part of the code.
 * <p>
 * TODO: can you use a stack to do this job ?
 */
public class BSTIterator {
    Iterator<TreeNode> iterator;
    private List<TreeNode> list = new ArrayList<>();

    public BSTIterator(TreeNode root) {
        traverseInorder(root);
        iterator = list.iterator();
    }

    private void traverseInorder(TreeNode root) {
        if (root != null) {
            if (root.left != null) {
                traverseInorder(root.left);
            }
            list.add(root);
            if (root.right != null) {
                traverseInorder(root.right);
            }
        }

    }

    /**
     * @return the next smallest number
     */
    public int next() {
        return iterator.next().val;
    }

    /**
     * @return whether we have a next smallest number
     */
    public boolean hasNext() {
        return iterator.hasNext();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */