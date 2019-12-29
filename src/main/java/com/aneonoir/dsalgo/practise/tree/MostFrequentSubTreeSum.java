package com.aneonoir.dsalgo.practise.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

/**
 * link: https://leetcode.com/problems/most-frequent-subtree-sum/
 * <p>
 * approach: used two treemap , to capture the data and another one to keep the weight and get the last key
 * <p>
 * TODO: slow , must have been a better way to solve it faster.
 * Runtime: 10 ms, faster than 24.68% of Java online submissions for Most Frequent Subtree Sum.
 * <p>
 * tag: intervew, tree, grouping, tree , subtree sum.
 */
public class MostFrequentSubTreeSum {
    public int[] findFrequentTreeSum(TreeNode root) {
        if (root != null) {
            TreeMap<Integer, Integer> map = new TreeMap<>();
            deduceSubTreeSum(root, map);
            TreeMap<Integer, List<Integer>> resul = new TreeMap<>();
            for (Integer key : map.keySet()) {
                if (resul.containsKey(map.get(key))) {
                    resul.get(map.get(key)).add(key);
                } else {
                    List<Integer> list = new LinkedList<>();
                    list.add(key);
                    resul.put(map.get(key), list);
                }
            }
            int result[] = new int[resul.get(resul.lastKey()).size()];
            int i = 0;
            for (Integer in : resul.get(resul.lastKey())) {
                result[i++] = in;
            }
            return result;
        } else {
            return new int[]{};
        }


    }

    private int deduceSubTreeSum(TreeNode root, TreeMap<Integer, Integer> map) {
        if (root != null) {
            int left = deduceSubTreeSum(root.left, map);
            int right = deduceSubTreeSum(root.right, map);
            int leftRightSum = left + right;
            int rootVal = root.val + leftRightSum;
            map.put(rootVal, map.getOrDefault(rootVal, 0) + 1);
            return rootVal;
        } else {
            return 0;
        }
    }
}