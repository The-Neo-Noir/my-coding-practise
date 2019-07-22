package com.aneonoir.dsalgo.practise.tree;

import java.util.LinkedList;
import java.util.List;

/**
 * link: https://leetcode.com/problems/leaf-similar-trees/
 * apporach: simple one
 */
public class LeafSimilarTrees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leafNodeRoot1 = new LinkedList<>();
        List<Integer> leafNodeRoot2 = new LinkedList<>();

        buildLeafNodes(root1, leafNodeRoot1);
        buildLeafNodes(root2, leafNodeRoot2);

        return leafNodeRoot1.equals(leafNodeRoot2);

    }

    private void buildLeafNodes(TreeNode node, List<Integer> leafs) {
        if (node != null) {
            if (node.left == null && node.right == null) {
                leafs.add(node.val);
            }
            buildLeafNodes(node.left, leafs);
            buildLeafNodes(node.right, leafs);
        }
    }
}