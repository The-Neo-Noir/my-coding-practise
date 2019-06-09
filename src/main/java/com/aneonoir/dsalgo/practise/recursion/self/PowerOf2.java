package com.aneonoir.dsalgo.practise.recursion.self;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Introducing tail recursion
 * <p>
 * discuss about what is tail recursion, and how can we eliminate temporary values.
 * show the diagram , and ask follow up question.
 * > Create a power of given number to the exponent given
 * > for number:10,exp:2, output: 100;
 * > see NumberRaisedToExponent.java
 */
public class PowerOf2 {

    @Test
    public void when_inputIs1_output2() {
        assertEquals(2, powerOfTwo(1));
        assertEquals(2, powerOfTwoRecursive(1));
    }

    @Test
    public void when_2_4() {
        assertEquals(4, powerOfTwo(2));
        assertEquals(4, powerOfTwoRecursive(2));
    }

    @Test
    public void when_0_1() {
        assertEquals(1, powerOfTwo(0));
        assertEquals(1, powerOfTwoRecursive(0));
    }

    public int powerOfTwo(int a) {
        int power = 1;
        if (a == 0) {
            return power;
        } else {
            for (int i = a; i > 0; i--) {
                power = 2 * power;
            }
            return power;
        }
    }

    // Two variables are involved. power and a
    // power carries the value , and a carries how many times to call
    // note power needs to be set to 1; I can make
    // incase of tail recursion we don't need that temporary storage.
    // note how many times the control is executed when value is 2 .


    public int powerOfTwoRecursive(int a) {
        if (a == 0) {
            return 1;
        } else {
            return 2 * powerOfTwoRecursive(a - 1);
        }
    }

}
