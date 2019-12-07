package com.aneonoir.dsalgo.practise.tree;

/**
 * link: https://practice.geeksforgeeks.org/problems/full-binary-tree/1
 * <p>
 * struggled a little
 * TODO: do it iteratively.
 * <p>
 * tag: intervie,tree, fullbinary tree.
 */
public class FullBinaryTree {

    boolean isFullTree(Node node) {
        if (node != null) {
            int lC = node.left == null ? 0 : 1;
            int rC = node.right == null ? 0 : 1;
            if (lC + rC == 0) {
                return true;
            } else if (lC + rC == 1) {
                return false && isFullTree(node.left) && isFullTree(node.right);
            } else {
                return true && isFullTree(node.left) && isFullTree(node.right);
            }

        } else {
            return true;
        }
    }
    // Can you spot a bug ?  ?
/**
 boolean isFullTree(Node node) {
 Queue<Node> que = new LinkedList<>();
 if (node == null) return true;
 if (node != null) {
 que.add(node);
 }
 int levelCount = 0;
 int levelNumber = 0;
 boolean result = false;
 while (!que.isEmpty()) {
 levelNumber = 1 << levelCount;
 List<Node> list = new LinkedList();
 while (!que.isEmpty()) {
 list.add(que.remove());
 }
 for (Node n : list) {
 if ((n.left == null && n.right == null) ||
 (n.left != null && n.right != null)) {
 result = true;
 } else {
 result = false;
 break;
 }
 if (n.left != null) que.add(n.left);
 if (n.right != null) que.add(n.right);
 }
 if (result == false) {
 break;
 }
 levelCount++;
 }
 return result;
 }**/
}
