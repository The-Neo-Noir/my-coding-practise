package com.aneonoir.dsalgo.practise.tree;

import java.util.LinkedList;

/**
 * link: https://practice.geeksforgeeks.org/problems/symmetric-tree/1
 * <p>
 * approach: bfs, iterative, used a list using addFirst addLast
 * <p>
 * tags: tree, symmetric tree
 */
public class SymmetricTreeIterative {


    public static boolean isSymmetric(Node root) {
        if (root == null) return true;
        LinkedList<Node> s = new LinkedList<>();
        if (root.left != null) s.add(root.left);
        if (root.right != null) s.add(root.right);
        return isSymmetric(s);
    }

    private static boolean isSymmetric(LinkedList<Node> list) {
        if (list.size() == 0) {
            return true;
        } else {
            if (list.size() % 2 == 0) {
                int low = 0;
                int high = list.size() - 1;
                boolean result = true;
                LinkedList<Node> mn = new LinkedList<>();
                while (low <= high) {
                    if (list.get(low).data == list.get(high).data) {
                        if (list.get(low).right != null) mn.addFirst(list.get(low).right);
                        if (list.get(low).left != null) mn.addFirst(list.get(low).left);
                        if (list.get(high).left != null) mn.addLast(list.get(high).left);
                        if (list.get(high).right != null) mn.addLast(list.get(high).right);
                    } else {
                        result &= false;
                        break;
                    }
                    low++;
                    high--;
                }
                return result & isSymmetric(mn);
            } else {
                return false;
            }
        }

    }
}
