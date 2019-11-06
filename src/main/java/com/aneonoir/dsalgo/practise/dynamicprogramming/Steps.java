package com.aneonoir.dsalgo.practise.dynamicprogramming;

/**
 * link: https://practice.geeksforgeeks.org/problems/count-ways-to-nth-stairorder-does-not-matter1322/1
 * solved it using iterative approach , can you solve it using recusion with memoization ?
 * <p>
 * struggle : CATCH CATCH CATCH, ITS NOT THE SAME QUESTION ORDER DOESN'T MATTER. LOOK AT  i[j] =  i[j - 2]+1; BELOW.
 * THEY ARE NOT THE SAME QUESTION YOU KNOW allert
 * TODO: recusiove
 */
public class Steps {

    public static void main(String[] args) {
        System.out.println(countWays(1));
        System.out.println(countWays(2));
        System.out.println(countWays(3));
        System.out.println(countWays(4));
        System.out.println(countWays(5));

    }

    static Long countWays(int m) {
        long i[] = new long[m + 1];

        if (m == 1) {
            return (long) 1;
        }
        i[0] = 1;  // struggle, don't keep it before the if block above.
        i[1] = 1;

        long val = 0;
        for (int j = 2; j <= m; j++) {
            i[j] = i[j - 2] + 1;
        }
        return i[m];

    }


}
