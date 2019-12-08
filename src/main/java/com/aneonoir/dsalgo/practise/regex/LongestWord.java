package com.aneonoir.dsalgo.practise.regex;

import java.util.Optional;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * link: https://app.codesignal.com/challenge/DH6wLFLBWMfeRE8r7
 * <p>
 * NOte: \\W is for word , \\w is for non word.
 * tag: regex,functional
 */
public class LongestWord {


    String longestWord(String text) {
        Pattern pattern = Pattern.compile("\\W");
        String[] split = pattern.split(text);
        Optional<String> max = Stream.of(split).max((o1, o2) -> o1.length() - o2.length());
        return max.get();
    }
}
