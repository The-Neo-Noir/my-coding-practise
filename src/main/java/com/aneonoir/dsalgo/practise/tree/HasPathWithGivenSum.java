package com.aneonoir.dsalgo.practise.tree;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * LINK:  https://app.codesignal.com/interview-practice/task/TG4tEMPnAc3PnzRCs
 * <p>
 * approach: solved using non recursion, and Level order traversal
 * TOOD: solve it using recursion
 */
public class HasPathWithGivenSum {

    boolean hasPathWithGivenSum(Tree<Integer> t, int s) {
        Queue<QueEle> q = new ArrayDeque<>();
        if (t != null) {
            q.add(new QueEle(t, t.value));
        }

        while (q.size() > 0) {
            QueEle current = q.poll();
            if (current.t.left == null & current.t.right == null) {
                if (s == current.sum) {
                    return true;
                }
            }
            if (current.t.left != null) {
                q.add(new QueEle(current.t.left, current.sum + current.t.left.value));
            }
            if (current.t.right != null) {
                q.add(new QueEle(current.t.right, current.sum + current.t.right.value));
            }
        }
        return false;
    }

    class Tree<T> {
        T value;
        Tree<T> left;
        Tree<T> right;

        Tree(T x) {
            value = x;
        }
    }

    class QueEle {
        Tree<Integer> t;
        Integer sum;

        QueEle(Tree<Integer> t, Integer sum) {
            this.t = t;
            this.sum = sum;
        }
    }
}
