package com.aneonoir.dsalgo.practise.math;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 *
 * link: https://app.codesignal.com/arcade/intro/level-12/ywMyCTspqGXPWRZx5
 *
 * Struggle : comparing with chracter with 0 not '0'  and input.charAt(1)+"" instead of input.charAt(1) will never return your
 * logic correct
 */
public class ValidTime {

    @Test
    public void test() {
        assertTrue(validTime("24:00"));
        assertTrue(validTime("09:56"));
    }
    boolean validTime(String time) {

        String temp[]=time.split("\\:");

        return cleanUp(temp[0])>=0 &&
                cleanUp(temp[0])<=24 &&
                cleanUp(temp[1])>=0 &&
                cleanUp(temp[1])<=59;

    }
    int cleanUp(String input){
        if(input.charAt(0)=='0'){
            return Integer.valueOf(input.charAt(1)+"").intValue();
        }
        return Integer.valueOf(input).intValue();

    }

}
