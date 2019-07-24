package com.aneonoir.dsalgo.practise.java.lamda;

import java.util.stream.Stream;

/**
 * linK: https://app.codesignal.com/challenge/myNEg9Cd45k8wmyBJ
 */
public class LongestString {
    public static void main(String[] args) {
        longestString(new String[]{"a", "DVB"});
    }

    private static String longestString(String[] strings) {
        return Stream.of(strings).max((o1, o2) -> Integer.compare(o1.length(), o2.length())).get();
    }
}
