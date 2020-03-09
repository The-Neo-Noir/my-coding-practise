package com.aneonoir.dsalgo.practise.tree;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * link: https://www.codewars.com/kata/57e5279b7cf1aea5cf000359/train/java
 *
 *
 * TODO: can you do it iteratively ?
 *
 * tag: recursion, warmup
 */
public class MaxSumInPath {

    class TreeNode{
        TreeNode left;
        TreeNode right;
        int value;
    }
    static int maxSum(TreeNode root) {
        IntStream.rangeClosed(1,3).filter(value->value%2==1).toArray();
        return maxSum(root, 0);

    }

    static int maxSum(TreeNode root, int sum) {
        if (root != null) {
            return Math.max(maxSum(root.left, root.value + sum), maxSum(root.right, root.value + sum));
        } else {
            return sum;
        }
    }
}
