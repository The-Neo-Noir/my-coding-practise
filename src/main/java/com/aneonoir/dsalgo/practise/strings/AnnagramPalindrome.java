package com.aneonoir.dsalgo.practise.strings;

import java.util.HashMap;
import java.util.Scanner;

public class AnnagramPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a-- > 0) {
            System.out.println(call(sc.next()));
        }
    }

    private static String call(String asd) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < asd.length(); i++) {
            if (map.containsKey(asd.charAt(i))) {
                map.put(asd.charAt(i), map.get(asd.charAt(i)) + 1);
            } else {
                map.put(asd.charAt(i), 1);
            }
        }
        String answer = "No";
        if (asd.length() % 2 == 0) {
            boolean bo = true;
            for (Character c : map.keySet()) {
                if (map.get(c) % 2 != 0) {
                    bo = false;
                }
            }
            return bo == true ? "Yes" : answer;
        } else {
            int oddCount = 0, evenCount = 0;
            for (Character c : map.keySet()) {
                if (map.get(c) % 2 != 0) {
                    oddCount++;
                } else {
                    evenCount++;
                }
            }
            return oddCount > 1 ? answer : "Yes";
        }
    }
}