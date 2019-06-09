package com.aneonoir.dsalgo.practise.strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Panagrams {
    public static void main(String[] args) {
        Map<Character, Integer> charMap = new LinkedHashMap<Character, Integer>();
        Scanner sc = new Scanner(System.in);
        String pangram = sc.nextLine();
        // fill the charMap with characters with value 0
        char a = 'a';
        int count = 0;
        for (; count < 26; count++) {
            charMap.put(String.valueOf(((char) (a + count))).charAt(0), 0);
        }
        count = 0;
        int check = 0;
        for (int stringIndex = 0; stringIndex < pangram.length(); stringIndex++) {
            char currentChar = String.valueOf(pangram.charAt(stringIndex)).toLowerCase().charAt(0);
            if (currentChar == ' ' || charMap.get(currentChar) >= 1) {
                continue;
            } else {
                Integer i = charMap.get(currentChar);
                charMap.put(currentChar, i + 1);
                check++;

            }
        }
        if (check >= 26) {
            System.out.println("pangram");
        } else {
            System.out.println("not pangram");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
