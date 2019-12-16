package com.aneonoir.dsalgo.practise.dynamicprogramming;

/**
 * link: https://www.lintcode.com/problem/climbing-stairs-ii/description
 * <p>
 * solution: ierative approach, STRUGGLE, watchout where are you keeping your if conditions,
 * <p>
 * <p>
 * TODO: I seems to get wrong for inputs for 0,1,2.  do recursive, memoization is still a trick I don't do right.
 * <p>
 * <p>
 * <p>
 * tag: interview,dynamic programming, practise , struggle,
 */
public class ClimbStairs {


    public int climbStairs2(int n) {
        int in[] = new int[n + 1];

        if (n == 0 || n == 1) return 1;
        if (n == 2) return 2;
        if (n > 2) {
            in[0] = 1;
            in[1] = 1;
            in[2] = 2;
            for (int i = 3; i <= n; i++) {
                in[i] = in[i - 1] + in[i - 2] + in[i - 3];
            }
        }
        return in[n];
    }
}
