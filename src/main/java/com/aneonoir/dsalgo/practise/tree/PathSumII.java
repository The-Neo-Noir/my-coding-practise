package com.aneonoir.dsalgo.practise.tree;

import java.util.LinkedList;
import java.util.List;


/**
 * link: https://leetcode.com/problems/path-sum-ii/
 * <p>
 * struggle, in dealing when to create the list and when to add
 * <p>
 * tag: practise, interview, tree, path ,
 * <p>
 * pattern identified, this needs to be practised often.
 * <p>
 * * TODO: can you do it even faster , the performance is slow.
 *
 * RUNTIME: Runtime: 13 ms, faster than 5.27% of Java online submissions for Path Sum II.
 *
 *
 * TODO:  Can you do it iteratively ?
 */
public class PathSumII {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> list = new LinkedList<>();
        if (root != null) {
            pathSum(root, list, 0, null, sum);
        }
        return list;
    }

    private void pathSum(TreeNode root, List<List<Integer>> list, int sum, List<Integer> listS, int target) {
        if (root != null) {
            List<Integer> stacklist = new LinkedList<>();
            int s = sum + root.val;
            if (listS != null) {
                for (Integer in : listS) {
                    stacklist.add(in);
                }
            }
            stacklist.add(root.val);
            if (root.left == null && root.right == null) {
                if (s == target) {
                    list.add(stacklist);
                    System.out.println(s);
                }
            }
            pathSum(root.left, list, s, stacklist, target);
            pathSum(root.right, list, s, stacklist, target);
        }
    }
}
