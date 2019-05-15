package com.aneonoir.dsalgo.practise.math;

/**
 * link: https://app.codesignal.com/arcade/code-arcade/loop-tunnel/LbuWRHnMoJH9SAo4o
 *
 *
 */
public class MagicWell {


    int magicalWell(int a, int b, int n) {
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=(a*b);
            a++;
            b++;
        }
        return sum;
    }
}
