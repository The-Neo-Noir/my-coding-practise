package com.aneonoir.dsalgo.practise.tree;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * link: https://practice.geeksforgeeks.org/problems/print-binary-tree-levels-in-sorted-order/0
 * <p>
 * solved but it fails TLE .
 * <p>
 * TODO: need to do it again.
 * <p>
 * tag: tree,level order traversal.
 */
public class PrintBinaryTreeLevelsInSortedOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int N = sc.nextInt();
            int input[] = new int[N];
            for (int i = 0; i < N; i++) {
                input[i] = sc.nextInt();
            }
            levelOrderSorted(input);
        }
    }

    private static void levelOrderSorted(int input[]) {
        int index = 0;
        int levelCount = 0;
        while (index < input.length) {
            int local = 1 << levelCount;
            TreeSet<Integer> levels = new TreeSet<>();
            while (index < input.length && local-- > 0) {
                levels.add(input[index]);
                index++;
            }
            levels.stream().forEach((x) -> System.out.print(x + " "));
            levelCount++;
            System.out.println();
        }
    }
}
