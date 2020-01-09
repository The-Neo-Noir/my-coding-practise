package com.aneonoir.dsalgo.practise.array;

import java.util.List;

/**
 * On the second attempt , I did the following,.
 * start from the bottom, with the minium value, once found go up in the level, with the adjecent value, but I believe it fails
 * > Yes off course it would fail,
 * > I need to count all the values, along the way and output the lowest. Its an optimization problem, thus dynamic programming. Can you solve it.
 * > Finally solved.
 *
 *
 * approach: working, start from the second last row, count the min by calculating last row,
 *
 * tag: dynamic programming, interview, struggle,
 *
 * TODO: can you do it using memoisation
 */
public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle != null && triangle.size() > 0) {
            for (int i = triangle.size() - 2; i >= 0; i--) {
                manipulte(triangle, i, i + 1);
            }
            return triangle.get(0).get(0);
        }
        return 0;

    }

    private void manipulte(List<List<Integer>> triangle, int manipulateLevel, int referenceLevel) {
        List<Integer> manipulateLevelList = triangle.get(manipulateLevel);
        List<Integer> referenceLevelList = triangle.get(referenceLevel);
        for (int i = 0; i < referenceLevelList.size() - 1; i++) {
            manipulateLevelList.set(i, Math.min(referenceLevelList.get(i) + manipulateLevelList.get(i), manipulateLevelList.get(i) + referenceLevelList.get(i + 1)));
        }

    }
}