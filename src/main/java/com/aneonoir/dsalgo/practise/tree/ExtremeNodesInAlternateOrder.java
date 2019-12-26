package com.aneonoir.dsalgo.practise.tree;

import java.util.LinkedList;
import java.util.List;

/**
 * link: https://practice.geeksforgeeks.org/problems/extreme-nodes-in-alternate-order/1
 * <p>
 * approach: recursive,
 * <p>
 * tag: tree, interview, extreme nodes ,traversal
 * <p>
 * TODO: iteratively.
 */
public class ExtremeNodesInAlternateOrder {

    public void printExtremeNode(Node node) {
        List<Node> nodes = new LinkedList<>();
        if (node != null) {
            nodes.add(node);
            printExtremeNode(nodes, 0);
        }

    }

    private void printExtremeNode(List<Node> nodes, int evenOrOdd) {
        if (nodes.size() != 0) {
            List<Node> nodeList = new LinkedList<>();
            if (evenOrOdd % 2 == 0) {
                System.out.print(nodes.get(nodes.size() - 1).data + " ");
            } else {
                System.out.print(nodes.get(0).data + " ");
            }
            for (Node n : nodes) {
                if (n.left != null) nodeList.add(n.left);
                if (n.right != null) nodeList.add(n.right);
            }
            printExtremeNode(nodeList, evenOrOdd + 1);
        }

    }
}
