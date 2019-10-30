package com.aneonoir.dsalgo.practise.dynamicprogramming;

import java.util.HashSet;

public class NthTrinonanciNumber {

    static HashSet<Integer> set = new HashSet<>();

    public static void main(String[] args) {
        int tribonacci = tribonacci(36);
        System.out.println(tribonacci);

    }

    public static int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }

        int result = tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
        if (set.contains(result)) {
            return result;
        } else {
            set.add(result);
            return result;
        }
        // Arrays.c
    }

    public static int tribonacciNonRecursive(int n) {
        int[] lookup = new int[38];
        lookup[1] = 1;
        lookup[2] = 1;
        for (int i = 3; i <= n; i++) {
            lookup[i] = lookup[i - 1] + lookup[i - 2] + lookup[i - 3];
        }
        return lookup[n];
    }

    class Pair {
        int m, n;

        public Pair(int m, int n) {
            this.m = m;
            this.n = n;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (m != pair.m) return false;
            return n == pair.n;
        }

        @Override
        public int hashCode() {
            int result = m;
            result = 31 * result + n;
            return result;
        }
    }

}
