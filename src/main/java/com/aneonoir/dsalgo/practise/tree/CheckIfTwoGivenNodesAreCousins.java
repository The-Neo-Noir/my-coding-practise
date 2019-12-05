package com.aneonoir.dsalgo.practise.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * link: https://practice.geeksforgeeks.org/problems/check-if-two-nodes-are-cousins/1
 * <p>
 * approach: do level order traversal iteratively, and we are sure there is no cousins in the first two levels , so keep
 * count of the levels, only whenlevels are more than 1 ( 0 , 1) then check if x, and y are found in the level of elements
 * if found check if thier parents are different.
 * <p>
 * TODO: can you do it recusively using inorder , preorder or post order traversal ? or level order traversal using recursion
 * <p>
 * tag: interview, tree,cousin finding
 */
public class CheckIfTwoGivenNodesAreCousins {
    // Function to complete
    public boolean isCousins(Node root, int x, int y) {
        Queue<Con> que = new LinkedList<>();
        if (root != null) que.add(new Con(root, null));
        int level = 0;
        boolean result = false;
        while (!que.isEmpty()) {
            List<Con> list = new LinkedList<>();
            while (!que.isEmpty()) {
                list.add(que.remove());
            }
            Con aFound = null;
            Con bFound = null;
            for (Con n : list) {
                if (level > 1) {
                    if (x == n.node.data) {
                        aFound = n;
                    }
                    if (y == n.node.data) {
                        bFound = n;
                    }
                }
                if (n.node.left != null) que.add(new Con(n.node.left, n.node));
                if (n.node.right != null) que.add(new Con(n.node.right, n.node));
            }
            if (aFound != null && bFound != null) {
                if (aFound.par != bFound.par) {
                    result = true;
                    break;
                }
            }
            level++;
        }
        return result;
    }

    class Con {
        Node node;
        Node par;

        Con(Node node, Node par) {
            this.node = node;
            this.par = par;
        }
    }
}

