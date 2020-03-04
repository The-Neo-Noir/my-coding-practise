package com.aneonoir.dsalgo.practise.tree.heap;

import java.util.Scanner;

/**
 * link: https://practice.geeksforgeeks.org/problems/min-sum-formed-by-digits/0
 * <p>
 * approach: I used heap , priorityqueue, to sort them , once sorted, I can just form the two numbers
 * from left to right
 * <p>
 * tag: interview, math, heap , sorting.
 */
public class MinSumFormedByDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int size = sc.nextInt();
            int elements[] = new int[size];
            java.util.PriorityQueue<Integer> in = new java.util.PriorityQueue<>();
            for (int i = 0; i < size; i++) {
                elements[i] = sc.nextInt();
                in.add(elements[i]);
            }
            int num1 = 0;
            int num2 = 0;
            int count = 0;
            while (in.size() > 0) {
                if (count % 2 == 0) {
                    num1 = num1 * 10 + in.poll();
                } else {
                    num2 = num2 * 10 + in.poll();
                }
                count++;
            }
            System.out.println(num1 + num2);
        }
    }
}
