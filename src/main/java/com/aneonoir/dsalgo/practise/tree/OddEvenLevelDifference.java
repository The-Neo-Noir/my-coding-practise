package com.aneonoir.dsalgo.practise.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * link: https://practice.geeksforgeeks.org/problems/odd-even-level-difference/1
 * <p>
 * appraoch : iterative approach
 * <p>
 * TODO: do recursively .
 * tag: tree,interview
 */
public class OddEvenLevelDifference {
    /*You are required to complete this function*/
    int getLevelDiff(Node root) {
        Queue<Node> que = new LinkedList<>();
        if (root != null) {
            que.add(root);
        }
        int sumEven = 0, sumOdd = 0;
        int level = 1;
        while (!que.isEmpty()) {
            List<Node> list = new ArrayList<>();
            while (!que.isEmpty()) {
                list.add(que.remove());

            }
            for (Node no : list) {
                if (level % 2 == 0) {
                    sumEven += (no == null ? 0 : no.data);
                } else {
                    sumOdd += (no == null ? 0 : no.data);
                }
                if (no.left != null) que.add(no.left);
                if (no.right != null) que.add(no.right);
            }

            level++;
        }
        return sumOdd - sumEven;

    }
}
