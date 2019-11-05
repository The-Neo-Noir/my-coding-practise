package com.aneonoir.dsalgo.practise.strings;

import java.util.Scanner;

/**
 * link: https://practice.geeksforgeeks.org/problems/uncommon-characters/0/?ref=self
 * <p>
 * Not as easy to come up with a solution , but my approach was to take two tempory arrays
 * each containing the filled location as 1 and xor to find the answer.
 */
public class UncommonChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            String st1 = sc.next();
            String st2 = sc.next();
            System.out.println(uncommon(st1, st2));
        }
    }

    private static String uncommon(String st1, String st2) {
        StringBuffer sb = new StringBuffer();
        int chh1[] = new int[26];
        int chh2[] = new int[26];
        for (int i = 0; i < st1.length(); i++) {
            chh1[st1.charAt(i) - 97] = 1;
        }
        for (int i = 0; i < st2.length(); i++) {
            chh2[st2.charAt(i) - 97] = 1;
        }
        for (int i = 0; i < 26; i++) {
            int com = chh1[i] ^ chh2[i];
            if (com == 1) {

                sb.append(((char) (i + 97)) + "");
            }
        }
        return sb.toString();
    }

}
