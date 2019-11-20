package com.aneonoir.dsalgo.practise.math;

import java.util.LinkedList;
import java.util.List;

/**
 * LINK: https://leetcode.com/problems/find-positive-integer-solution-for-a-given-equation/
 * <p>
 * Hmm, could not understand it the first time, after seing the hint , I did the solution, but peroformed very bad.
 * <p>
 * TODO
 * <p>
 * tag: interview, binary search, math
 */
public class FIndPositiveIntegerSolutionForAGivenEquation {

    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        List<List<Integer>> l = new LinkedList<>();
        for (int i = 1; i <= 1000; i++) {
            for (int j = 1; j <= 1000; j++) {
                if (z == customfunction.f(i, j)) {
                    List ss = new LinkedList<>();
                    ss.add(i);
                    ss.add(j);
                    l.add(ss);
                }
            }
        }
        return l;
    }

    private class CustomFunction {

        public int f(int i, int j) {

            return 0;
        }
    }
}
