package com.aneonoir.dsalgo.practise.java;

import java.util.Arrays;
import java.util.Comparator;

/**
 * link: https://practice.geeksforgeeks.org/problems/pair-in-java/1
 * <p>
 * tag; comparator, comapratble, arrays sorting
 */
public class PairinJava {
    public static void main(String[] args) {

    }

    // Compare function
    static void sortPairs(Pair arr[], int N) {

        Arrays.sort(arr, new Com());
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i].x + " " + arr[i].y + " ");
        }

    }

    static class Pair {
        int x;
        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static class Com implements Comparator<Pair> {
        public int compare(Pair p1, Pair p2) {
            return Integer.valueOf(p1.x).compareTo(p2.x);
        }
    }
}
