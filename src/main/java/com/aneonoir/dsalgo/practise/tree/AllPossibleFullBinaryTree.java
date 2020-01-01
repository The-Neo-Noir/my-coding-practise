package com.aneonoir.dsalgo.practise.tree;

import java.util.LinkedList;
import java.util.List;

/**
 * link: https://leetcode.com/problems/all-possible-full-binary-trees/
 * <p>
 * TODO: I could not solve it. Another try is required
 */
public class AllPossibleFullBinaryTree {
    public static void main(String[] args) {
        AllPossibleFullBinaryTree allPossibleFullBinaryTree = new AllPossibleFullBinaryTree();
        allPossibleFullBinaryTree.allPossibleFBT(5);
    }


    public List<TreeNode> allPossibleFBT(int N) {

        if (N % 2 == 0) {
            return new LinkedList<>();
        } else {
            if (N == 1) {
                return new LinkedList<TreeNode>() {{
                    add(new TreeNode(0));
                }};
            } else {
                List<TreeNode> list = new LinkedList<>();
                recurse(list, null, N);
                return list;
            }
        }
    }

    private void recurse(List<TreeNode> list, TreeNode o, int n) {
        if (n < 2) {
            return;
        } else {
            if (o == null) {
                TreeNode t = new TreeNode(0);
                t.left = new TreeNode(0);
                t.right = new TreeNode(0);
                recurse(list, t.left, n - 3);
                list.add(t);
                recurse(list, t.right, n - 3);
                list.add(t);
            } else {
                o.left = new TreeNode(0);
                o.right = new TreeNode(0);
                recurse(list, o.left, n - 2);

                recurse(list, o.right, n - 2);
            }

        }
    }
}
