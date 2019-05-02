package com.aneonoir.dsalgo.practise.bitwise;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * source:
 *
 * tag: math,bitwise
 *
 * task:
 * TODO: can you do it without a string reverse method ?
 */

public class bitwise {



    @Test
    public void test() {
        assertEquals("101", decimalToBinary(5));
        assertEquals("100", decimalToBinary(4));
        assertEquals("10",  decimalToBinary(2));
        assertEquals("1",   decimalToBinary(1));

    }

    private String decimalToBinary(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        while(i >0){
            int i1 = i % 2;
            stringBuilder.append(i1 + "");
            i=i/2;

        }
        return stringBuilder.reverse().toString();
    }
}
