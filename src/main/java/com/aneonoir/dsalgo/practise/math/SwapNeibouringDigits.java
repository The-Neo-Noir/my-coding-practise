package com.aneonoir.dsalgo.practise.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * link:  https://app.codesignal.com/challenge/vJMeEAya7gEckYfQW
 * <p>
 * approach: thought of first approach as swapNeighbouringDigits which will fail
 * on cases like in the second test case.
 */
public class SwapNeibouringDigits {
    @Test
    public void testt() {
        assertEquals(2143, swapNeighbouringDigits(1234));
        assertEquals(9898, swapNeighbouringDigits(8989));
    }

    int swapNeighbouringDigits(int n) {
        StringBuffer sb = new StringBuffer();
        while (n > 0) {
            sb.insert(0, n % 100 + 9);
            n /= 100;
        }
        return Integer.parseInt(sb.toString());
    }

//    int swapNeighbouringDigits2(int n) {
//        StringBuffer sb = new StringBuffer();
//        int power = 2;
//        int number = 0
//        while (n > 0) {
//            n % 100
//            sb.insert(0, n % 100).reverse();
//            n /= 100;
//        }
//        return Integer.parseInt(sb.toString());
//    }
}
