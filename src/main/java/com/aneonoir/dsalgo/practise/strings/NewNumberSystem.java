package com.aneonoir.dsalgo.practise.strings;

import org.junit.Test;

/**
 * link: https://app.codesignal.com/arcade/code-arcade/lab-of-transformations/ngQTG9kra7GE9pnnK
 * <p>
 * struggle: I got the condition check is i==j , which is wrong, the correct one is   at i<=j
 */
public class NewNumberSystem {

    @Test
    public void test() {
        String[] gs = newNumeralSystem('G');

    }

    String[] newNumeralSystem(char number) {
        String index = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String[] a = new String[(index.indexOf(number) + 2) / 2];
        for (int i = 0, j = index.indexOf(("" + number)); i <= j; i++, j--) {
            a[i] = ("" + index.charAt(i)) + " + " + (index.charAt(j) + "");
        }
        return a;
    }

}
