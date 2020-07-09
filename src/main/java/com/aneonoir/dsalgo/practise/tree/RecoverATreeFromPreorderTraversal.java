package com.aneonoir.dsalgo.practise.tree;

import java.util.Arrays;

/**
 * link: https://leetcode.com/problems/recover-a-tree-from-preorder-traversal/
 * <p>
 * todo: unfinished, have to come back again on this one.
 * <p>
 * tag: hard, interview, must do , tree,
 * <p>
 * "12-234--34--444"
 * "1-2--3--4-5--6--7"
 * "1-2--3---4-5--6"
 * "1-2--3---4-5--6---7"
 * "1-401--349---90--88"
 */
public class RecoverATreeFromPreorderTraversal {
    int last = 0;

    public static void main(String[] args) {
        RecoverATreeFromPreorderTraversal recoverATreeFromPreorderTraversal = new RecoverATreeFromPreorderTraversal();
        TreeNode treeNode = recoverATreeFromPreorderTraversal.recoverFromPreorder("1-2--3--4-5--6--7");

    }

    public TreeNode recoverFromPreorder(String S) {
        return recover(S, 0, 0);
    }

    private boolean test(String s, int curr, int depth) {
        if (depth == 0) {
            return Character.isDigit(s.charAt(curr + depth));
        } else {
            return s.charAt(curr + depth - 1) == '-' && Character.isDigit(s.charAt(curr + depth));
        }
    }

    private TreeNode recover(String s, int curr, int depth) {
        TreeNode node = null;
        int currLocal = curr + depth;
        if (currLocal < s.length()) {
            if (test(s, curr, depth)) {
                String st = s.charAt(currLocal) + "";
                int c = currLocal + 1;
                while (c < s.length() && Character.isDigit(s.charAt(c))) {
                    st += s.charAt(c);
                    c++;
                }
                node = new TreeNode(Integer.parseInt(st));
                node.left = recover(s, c, depth + 1);
                //1-2--3--4-5--6--7
                if (node.left != null) {
                    node.right = recover(s, last, depth + 1);
                } else {
                    last = c;
                }

            }
        }

        return node;
    }
}
