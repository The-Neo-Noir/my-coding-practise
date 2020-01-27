package com.aneonoir.dsalgo.practise.math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * link: https://practice.geeksforgeeks.org/problems/largest-even-number/0
 * <p>
 * approach: sort in descending, if unit place number is odd then find the closest even and splipt and join .
 *
 *
 * tag: sort, counting sort, math,interview.
 *
 * I used library sort, a counting sort would be a good idea.
 */
public class LargestEvenNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String n = sc.next();
            List<Character> list = new ArrayList<>();
            for (Character ch : n.toCharArray()) {
                list.add(ch);
            }
            Collections.sort(list, (a, b) -> b - a);
            StringBuffer s = new StringBuffer();
            for (Character sh : list) {
                s.append(sh);
            }
            String result = s.toString();
            int indexOfL = result.length() - 1;
            if (Integer.parseInt(result.charAt(result.length() - 1) + "") % 2 != 0) {
                for (int i = result.length() - 2; i >= 0; i--) {
                    if (Integer.parseInt(result.charAt(i) + "") % 2 == 0) {
                        indexOfL = i;
                        break;
                    }
                }
                result = result.substring(0, indexOfL) +
                        result.substring(indexOfL + 1, result.length()) +
                        (result.charAt(indexOfL) + "");
            }

            System.out.println(result);
        }
    }
}
