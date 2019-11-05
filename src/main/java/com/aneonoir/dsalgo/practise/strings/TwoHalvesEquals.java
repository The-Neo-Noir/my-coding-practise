package com.aneonoir.dsalgo.practise.strings;

import java.util.Scanner;

public class TwoHalvesEquals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        while (cases > 0) {
            System.out.println(call(sc.next()));
            cases--;
        }

    }

    private static String call(String asdf) {
        if (asdf.length() % 2 == 0) {
            if (asdf.substring(0, asdf.length() / 2).equals(asdf.substring((asdf.length() / 2)))) {
                return "YES";
            } else
                return "NO";
        } else {
            return "NO";
        }
    }

}
