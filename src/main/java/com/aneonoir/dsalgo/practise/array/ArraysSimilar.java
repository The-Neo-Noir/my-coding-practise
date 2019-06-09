package com.aneonoir.dsalgo.practise.array;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertTrue;

/**
 * link: https://app.codesignal.com/arcade/intro/level-4/xYXfzQmnhBvEKJwXP
 * <p>
 * Struggle: when the item is contains then only you should retrieve
 * <p>
 * TODO: Did pass, but the code can be optimized
 */
public class ArraysSimilar {

    @Test
    public void test() {
        boolean b = areSimilar(new int[]{1, 2, 1, 2, 1, 2}, new int[]{1, 1, 1, 2, 2, 2});
        assertTrue(b);

    }

    boolean areSimilar(int[] a, int[] b) {
        Map<Integer, Integer> setA = new HashMap<>();
        Map<Integer, Integer> setB = new HashMap<>();
        boolean result = false;
        // All the elements and the element count must be same
        //
        //
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (setA.containsKey(a[i])) {
                setA.put(a[i], setA.get(a[i]) + 1);

            } else {
                setA.put(a[i], 0);
            }
            if (setB.containsKey(b[i])) {
                setB.put(b[i], setB.get(b[i]) + 1);
            } else {
                setB.put(b[i], 0);

            }
            // positional matches
            if (a[i] == b[i]) {
                count++;
            }
        }

        result = (count == a.length - 2 && setA.equals(setB));
        return result;
    }


}
