package com.aneonoir.dsalgo.practise.strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/***
 * link: https://leetcode.com/problems/decoded-string-at-index/
 *
 * Solution approach:
 *  1.it looks innconet , but it is not , when you have a large number as in test case3.
 * Next solution apporach.
 *  We don't need to calculate all the way, but that still did not work, see 5th test case.
 *
 *  What is NExt ?
 *
 *  TODO: 
 *
 */
public class StringMan {

    private static String num(String sb, int number) {
        StringBuffer temp = new StringBuffer(sb);
        for (int i = 0; i < number; i++) {
            temp.append(sb);
        }
        return temp.toString();
    }

    @Test
    public void tets() {
        assertEquals("o", decodeAtIndex("leet2code3", 10));
        assertEquals("h", decodeAtIndex("ha22", 5));
        assertEquals("a", decodeAtIndex("a2345678999999999999999", 1));
        assertEquals("c", decodeAtIndex("a2b3c4d5e6f7g8h9", 10));
        assertEquals("c", decodeAtIndex("y959q969u3hb22odq595", 222280369));

    }

    public String decodeAtIndex(String S, int K) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < S.length(); i++) {
            if (Character.isAlphabetic(S.charAt(i))) {
                sb.append(S.charAt(i) + "");
            } else {
                int number = Integer.parseInt(S.charAt(i) + "");
                sb = new StringBuffer(num(sb.toString(), number - 1));
            }


            if (sb.length() + 1 > K) {
                break;
            }
        }
        System.out.println(sb);

        return sb.toString().charAt(K - 1) + "";
    }
}