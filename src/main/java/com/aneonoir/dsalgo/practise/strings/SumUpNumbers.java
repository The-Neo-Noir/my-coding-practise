package com.aneonoir.dsalgo.practise.strings;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;

public class SumUpNumbers {
    @Test
    public void test() {
        assertEquals(17, sumUpNumbers("12 thumps up for 2 guygs,3"));

    }

    int sumUpNumbers(String inputString) {
        int sum = 0;
        Pattern p = Pattern.compile("\\s*\\d+\\s*");
        Matcher matcher = p.matcher(inputString);
        while (matcher.find()) {
            String group = matcher.group().trim();
            sum += Integer.parseInt(group);
        }
        return sum;
    }

}
