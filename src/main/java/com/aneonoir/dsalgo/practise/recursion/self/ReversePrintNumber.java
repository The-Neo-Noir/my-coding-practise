package com.aneonoir.dsalgo.practise.recursion.self;

import org.junit.Test;

/**
 *
 * 3. print a number in reverse
 * See follow up question ReverseANumber.java
 */
public class ReversePrintNumber {
    @Test
    public void test() {
        reverseRecursive(234);

    }

    private void reverseRecursive(int i) {
        if(i==0){
            return;
        }else{
            System.out.println(i % 10);
            reverseRecursive(i / 10);
        }
    }

    private void reverse(int i) {
        while(i>0){
            System.out.println(i % 10);
            i/=10;
        }
    }

}
