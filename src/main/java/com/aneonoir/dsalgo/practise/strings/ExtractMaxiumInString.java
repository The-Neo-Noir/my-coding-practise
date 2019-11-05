package com.aneonoir.dsalgo.practise.strings;

import java.util.Scanner;

/**
 * link:  https://practice.geeksforgeeks.org/problems/extract-maximum/0/?ref=self
 * <p>
 * approach : similar pattern question, {@link Sumofnumbersinstring}
 */
public class ExtractMaxiumInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        for (int j = 0; j < i; j++) {
            String next = sc.next();
            int max = findMax(next);
            System.out.println(max);
            int isd[] = new int[2];
            int i1 = isd[0] ^ isd[1];
            if (i1 == 1) {
                char i2 = (char) Character.toLowerCase(97);
            }
        }

    }


    //100klh564abc365
    private static int findMax(String next) {
        int currentMax = 0;
        for (int i = 0; i < next.length(); i++) {
            if (Character.isDigit(next.charAt(i))) {
                int j = i;
                while (j < next.length() && Character.isDigit(next.charAt(j))) {

                    j++;
                }
                String substring = next.substring(i, j);
                currentMax = Integer.max(currentMax, Integer.parseInt(substring));
                i = j;
            }
        }
        return currentMax;
    }
}
