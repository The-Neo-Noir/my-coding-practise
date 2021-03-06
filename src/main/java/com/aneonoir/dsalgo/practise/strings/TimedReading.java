package com.aneonoir.dsalgo.practise.strings;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * link: https://app.codesignal.com/arcade/code-arcade/well-of-integration/mJr7vgtN4X4ecL7ZA
 * <p>
 * Struggle: A good bit of struggle dealing with regex.
 */
public class TimedReading {

    @Test
    public void min() {
        timedReading(4, "The Fox asked the stork, 'How is the soup?'");
    }


    int timedReading(int maxLength, String text) {
        String regex = "[a-zA-Z]+";
        Pattern compile = Pattern.compile(regex);
        Matcher matcher = compile.matcher(text);

        int count = 0;
        while (matcher.find()) {
            String group = matcher.group();
            if (matcher.end() - matcher.start() <= maxLength) {
                count++;
            }
        }
        return count;
    }


}
