package com.aneonoir.dsalgo.practise.array;

/**
 * link: https://leetcode.com/problems/minimum-time-visiting-all-points/submissions/
 * <p>
 * time taken : 4:05 - 4:34
 * <p>
 * tags: array, math, cartesian system,
 * <p>
 * REVIEW AGAIN ; for faster performance.
 * <p>
 * Runtime: 2 ms, faster than 17.01% of Java online submissions for Minimum Time Visiting All Points.
 * This is kind of slow, I am sure I could do better/
 */
public class MinimumTimeVisitingAllPoints {
    public int minTimeToVisitAllPoints(int[][] points) {
        int val = 0;
        for (int i = 0; i < points.length - 1; i++) {
            int x1 = points[i][0];
            int y1 = points[i][1];

            int x2 = points[i + 1][0];
            int y2 = points[i + 1][1];

            int maxx = Math.max(x1, x2);
            int minx = Math.min(x1, x2);
            int resx = maxx - minx;

            int maxy = Math.max(y1, y2);
            int miny = Math.min(y1, y2);
            int resy = maxy - miny;

            val += Math.max(resx, resy);
        }
        return val;
    }
}