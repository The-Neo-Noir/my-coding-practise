package com.aneonoir.dsalgo.practise.bitwise;

import java.util.ArrayList;
import java.util.List;

/**
 * link: https://leetcode.com/problems/binary-prefix-divisible-by-5/
 * <p>
 * sollution:
 * v
 * I told you again shift is not self mutating.
 * <p>
 * DO it again, I cheated,
 * But I was clos
 * <p>
 * TODO: do it again
 * tags: interview, bitwise
 */
public class BinaryPrefixDivisibleBy5 {
    public List<Boolean> prefixesDivBy5(int[] A) {
        int k = 0;
        List<Boolean> ans = new ArrayList<>();
        for (int a : A) {
            k = (k << 1 | a) % 5;
            ans.add(k == 0);
        }
        return ans;
    }
}
