package com.aneonoir.dsalgo.practise.bitwise;

/**
 * link: https://app.codesignal.com/challenge/mo83ad9LeKftcDmbw
 *
 * approach: you can go bruteforce like in extraNumber or use bitwise extraNumberWithBitWise
 */
public class ExtraNumber {
    int extraNumber(int a, int b, int c){
        if(a==b)
            return c;
        else if(b==c){
            return b;
        }else
            return a;
    }
    int extraNumberWithBitWise(int a, int b, int c) {return a^b^c;}
}
