package com.aneonoir.dsalgo.practise.tree.heap;

/**
 * link: https://practice.geeksforgeeks.org/problems/kth-element-in-matrix/1
 *
 * todo: can there be any difference in implementation ? then why would it ask with info that the matrix is sorted /
 *
 *
 * tag: heap , sorting, easy, interview
 *
 *
 */
public class KthElementInMatrix {

    public static void kthSmallest(int[][] a, int n, int k) {
        java.util.PriorityQueue<Integer> pq = new java.util.PriorityQueue<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                pq.add(a[i][j]);
            }
        }
        for (int i = 0; i < k - 1; i++) pq.poll();
        System.out.println(pq.poll());
    }
}
