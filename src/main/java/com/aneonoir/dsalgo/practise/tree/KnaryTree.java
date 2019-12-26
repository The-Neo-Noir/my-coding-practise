package com.aneonoir.dsalgo.practise.tree;

import java.util.Scanner;

/**
 * link: https://practice.geeksforgeeks.org/problems/k-ary-tree/0
 * <p>
 * Math.pow() // will be Infinity for a big enough number like Math.pow(31,570)
 * <p>
 * Note: number of leaf nodes in a full binary tree is Math.pow(k,m) where k is k-nary tree , and m being the height , 0 based.
 * <p>
 * tag: tree, height, leaf nodes.
 */
public class KnaryTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int k = sc.nextInt();
            int m = sc.nextInt();
            long km = 1;
            while (m-- > 0) {
                km = ((km * k) % 10000000007L);
            }
            System.out.println(km);
        }
    }
}
