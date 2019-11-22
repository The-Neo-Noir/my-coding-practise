package com.aneonoir.dsalgo.practise.tree;

import java.util.LinkedList;
import java.util.List;

/**
 *
 */
public class NodesAtOddLevel {
    public static void main(String[] args) {
        NodesAtOddLevel nodesAtOddLevel = new NodesAtOddLevel();
        Node root = new Node(1);
        root.left = new Node(2);
        nodesAtOddLevel.nodeAtOdd(root);

    }

    public void nodeAtOdd(Node root) {
        if (root != null) {
            List<Node> nodes = new LinkedList<>();
            nodes.add(root);
            nodeAtOdd(nodes, 1);
        }
    }

    private void nodeAtOdd(List<Node> roots, int level) {
        List<Node> loca = new LinkedList<>();
        if (roots != null && roots.size() > 0) {
            if (level % 2 == 1) {
                for (Node root : roots) {
                    if (root != null) {
                        System.out.print(root.data + " ");
                    }
                }
            }
            for (Node root : roots) {
                if (root != null) {
                    loca.add(root.left);
                    loca.add(root.right);
                }
            }

            nodeAtOdd(loca, level + 1);
        }
    }
}
