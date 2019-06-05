package com.aneonoir.dsalgo.practise.array;

/**
 * link: https://leetcode.com/problems/daily-temperatures/
 * <p>
 * approach: a brute force one. Better way
 */
public class DailyTemp {
    public int[] dailyTemperatures(int[] T) {
        int result[] = new int[T.length];
        for (int day = 0; day < T.length; day++) {
            int temp = T[day];
            int diffIndex = day;
            for (int nextday = day + 1; nextday < T.length; nextday++) {
                if (T[nextday] > temp) {
                    diffIndex = nextday;
                    break;
                }
            }
            result[day] = diffIndex - day;
        }
        return result;
    }
}
