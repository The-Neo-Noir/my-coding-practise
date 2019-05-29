package com.aneonoir.dsalgo.practise.recursion.self;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 */
public class NumberRaisedToExponent {

    @Test
    public void when_10_1_10(){
        assertEquals(10, numberRaisedToExponents(10,1));
    }

    @Test
    public void when_2_4() {
        assertEquals(4, numberRaisedToExponents(2,2));
    }

    @Test
    public void when_0_1() {

        assertEquals(1, numberRaisedToExponents(100,0));
    }

    /**
     * If your solution looks like this , then lets discuss, ,see the number parameter
     * does not take part in the recursion's decision, can we save it , YES
     * @see NumberRaisedToExponent.numberRaisedToExponentsCured()
     * @param number
     * @param exponent
     * @return
     */
    public int numberRaisedToExponents(int number,int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return number * numberRaisedToExponents(number, exponent - 1);
        }
    }

    /**
     *  Has compilation error but get it.
     *  fix it and test all the cases provided.
     * @param exponent
     * @return
     */
    public int numberRaisedToExponentsCured(int exponent) {
      /* Uncomment this, and fix the code
       if (exponent == 0) {
            return 1;
        } else {
            return this.number * numberRaisedToExponents(this.number, exponent - 1);
        }*/
      return 0;
    }

}