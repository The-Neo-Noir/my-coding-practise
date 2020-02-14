package com.aneonoir.dsalgo.practise.bitwise;

/**
 * link: https://leetcode.com/problems/complement-of-base-10-integer/
 *
 * approach 1: approach: 1: convert N to base 2
 * 											inverse the bits
 * 											convert inservesed bit to base 10 is the answer/
 * approach 2: This approach:
 *
 * test cases;
 * Test cases:
 * 0
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 7
 * 8
 * 9
 * 10
 * 15
 * 16
 * 32
 * 10000000
 * 100000000
 * 99999999
 *
 * tag: bitwise, math ,
 *
 * TODO: see others solution how they do
 *
 */
public class ComplementOfBase10Integer {
        public int bitwiseComplement(int N) {
            int counter=0;
            int temp=N;
            while(N>=2){
                counter++;
                N/=2;
            }
            return (((int)Math.pow(2,counter+1))-1)-temp;
        }
}
