package com.aneonoir.dsalgo.practise.recursion.self;

import org.junit.Test;

import static com.sun.javafx.fxml.expression.Expression.multiply;
import static org.junit.Assert.assertEquals;

/**
 * Here don't use any multiplication operator
 *
 * Hint: multiplecation is repepative addition.
 *
 */
public class MultiplyTwoNumbers {

    @Test
    public void test() {
        assertEquals(6, multiplyNumber(2, 3));
    }

    private int multiplyNumber(int i, int i1) {
        if(i1==0){
            return 0;
        }else{
            return i+ multiplyNumber(i, i1 - 1);
        }
    }
}

