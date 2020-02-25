package com.aneonoir.dsalgo.practise.math;

/**
 * link: https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/
 *
 * IT could be faster ; learn how Runtime: 65 ms, faster than 14.19% of Java online submissions for Prime Number of Set Bits in Binary Representation.
 *
 * tag: easy, math , prime number, interview,
 *
 */
public class PrimeNumbersOfOnesBinary {
    public int countPrimeSetBits(int L, int R) {
        int count=0;
        for(int i=L;i<=R;i++){
            if(isPrime(countBits(i))){
                count++;
            }

        }
        return count;
    }
    private int countBits(int i){
        String bits= Integer.toBinaryString(i);
        int count=0;
        for(Character ch: bits.toCharArray()){
            if(ch=='1') count++;
        }
        return count;
    }
    private boolean isPrime(int number){
        boolean result= true;
        if(number==1) return false;
        for(int i=2;i<=Math.sqrt(number);i++){
            if(number%i==0){
                result=false;
                break;
            }
        }
        return result;
    }
}
