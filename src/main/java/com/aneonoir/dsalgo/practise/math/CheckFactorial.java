package com.aneonoir.dsalgo.practise.math;

import java.util.stream.IntStream;

/**
 * link: https://app.codesignal.com/challenge/sn4MqAwzXnDiGG9Nb
 *
 * solution: a brute force method.
 *
 * todo: Can you do it in functional style
 */
public class CheckFactorial {

    public boolean checkFactorial(int n) {
        int reduce = IntStream.rangeClosed(1, 500000)
                .reduce(1, (left, right) -> left * right++);
        System.out.println(reduce);

        boolean result=false;
        int k=1;
        int inc=1;
        if(n==1){
            result= true;
        }
        while(k<=5*Math.pow(10,5) && k<=n){
            k=k*(inc+1);
            if(k==n){
                result=true;
                break;
            }
            inc++;
        }
        return result;
    }

/** little better optimized , removed the if check
    boolean checkFactorial(int n) {
        boolean result=false;
        int k=1,inc=1;
        while(k<=5*Math.pow(10,5) && k<=n){
            if(k==n){
                result=true;
                break;
            }
            k=k*(inc++);
        }
        return result;
    }
 */

}
