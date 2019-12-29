package com.aneonoir.dsalgo.practise.strings;

import java.util.HashSet;
import java.util.Scanner;

/**
 * link: https://practice.geeksforgeeks.org/problems/smallest-distant-window/0
 * <p>
 * TODO:
 */
public class SmallestDistictWindow {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            final HashSet<Character> set = new HashSet<>();
            s.chars().forEach((c) -> set.add((char) c));
            System.out.println(set.size());
        }
    }
}
