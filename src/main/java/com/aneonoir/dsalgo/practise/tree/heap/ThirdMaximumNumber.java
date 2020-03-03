package com.aneonoir.dsalgo.practise.tree.heap;

import java.util.PriorityQueue;

/**
 * link: https://leetcode.com/problems/third-maximum-number/submissions/
 *
 * TODO: the performance should be imporved.
 *
 * tag: priority queue, heap , easy , interivew.
 * s
 */
public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> in = new PriorityQueue<>((o1, o2) -> o2.compareTo(o1));
        //bug alert , don't do (o1,o2)->o2-o1; there is fear of overflow.
        for (Integer nm : nums) {
            if (!in.contains(nm))
                in.add(nm);
        }
        Integer val = in.poll();

        Integer temp = in.poll();
        if (temp == null) {
            return val;
        }
        Integer fem = in.poll();
        if (fem == null) {
            return val;
        } else {
            val = fem;
        }
        return val;
    }
}
