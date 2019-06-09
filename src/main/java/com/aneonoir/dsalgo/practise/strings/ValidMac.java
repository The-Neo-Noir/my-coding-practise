package com.aneonoir.dsalgo.practise.strings;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * link :https://app.codesignal.com/arcade/code-arcade/book-market/HJ2thsvjL25iCvvdm
 * <p>
 * struggle : consider all possible test cases like 01-23-45-67-89-AB- ,
 */
public class ValidMac {

    @Test
    public void test() {
        assertTrue(isMAC48Address("01-23-45-67-89-AB"));
    }

    boolean isMAC48Address(String inputString) {

        String[] split = inputString.split("\\-");
        long count = inputString.chars().filter(value -> value == '-').count();
        if (split.length == 6 && count == 5) {
            for (int i = 0; i < split.length; i++) {
                if (!split[i].matches("[0-9]{2,2}|[A-F]{2,2}|([0-9]{1,1}[A-F]{1,1})|([A-F]{1,1}[0-9]{1,1})")) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

}
