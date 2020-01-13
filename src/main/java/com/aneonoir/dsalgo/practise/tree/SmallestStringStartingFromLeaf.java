package com.aneonoir.dsalgo.practise.tree;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * link:
 * https://leetcode.com/problems/smallest-string-starting-from-leaf/
 *
 * todo: can you do it bfs, and dfs itarative.
 *
 * tag: interview, medium , tree, sorting
 */
public class SmallestStringStartingFromLeaf {
    public String smallestFromLeaf(TreeNode root) {
        // creat all the path from leaf to root, and add them to a string of list.
        // sort them and return the first one
        if (root != null) {
            List<String> list = new LinkedList<>();
            mallestFromLeaf(root, "", list);
            Collections.sort(list);
            return list.get(0);
        }
        return "";
    }

    void mallestFromLeaf(TreeNode root, String st, List<String> list) {
        if (root != null) {
            String local = (char) (97 + root.val) + "" + st;
            if (root.left == null && root.right == null) {
                list.add(local);
            }
            mallestFromLeaf(root.left, local, list);
            mallestFromLeaf(root.right, local, list);
        }
    }
}
