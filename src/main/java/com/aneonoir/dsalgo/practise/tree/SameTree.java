package com.aneonoir.dsalgo.practise.tree;

import java.util.LinkedList;
import java.util.List;

/**
 * link: https://leetcode.com/problems/same-tree/
 * solution: I used a non recursive using a list , added all the elements form tree1 and tree2 into list1 and list 2
 * and equals them , but it failed, one test case.  for example
 * [1,null,1]
 * [1,1]
 * <p>
 * TODO: can you do a recursive and non-recursion solution to this one ?
 */
public class SameTree {

    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(1);

        TreeNode q = new TreeNode(1);
        q.left = null;
        q.right = new TreeNode(1);
        System.out.println(isSameTree(p, q));

    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> nodeP = new LinkedList<>();
        List<Integer> nodeQ = new LinkedList<>();
        traverse(p, nodeP);
        traverse(q, nodeQ);
        System.out.println(nodeP);
        System.out.println(nodeQ);

        return nodeP.equals(nodeQ);
    }

    static void traverse(TreeNode p, List<Integer> nodeP) {
        if (p != null) {
            traverse(p.left, nodeP);
            nodeP.add(p.val);
            traverse(p.right, nodeP);
        } else {
            nodeP.add(null);
        }
    }

}