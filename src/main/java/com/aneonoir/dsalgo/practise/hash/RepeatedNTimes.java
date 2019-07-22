package com.aneonoir.dsalgo.practise.hash;

import java.util.HashMap;

/**
 * link:
 */
public class RepeatedNTimes {
    public int repeatedNTimes(int[] A) {
        HashMap<Integer, Integer> s = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (s.containsKey(A[i])) {
                s.put(A[i], s.get(A[i]) + 1);
            } else {
                s.put(A[i], 1);
            }
        }
        int N = A.length / 2;
        int result = -1;
        for (Integer key : s.keySet()) {
            if (s.get(key) == N) {
                result = key;
                break;
            }
        }
        return result;
    }
}