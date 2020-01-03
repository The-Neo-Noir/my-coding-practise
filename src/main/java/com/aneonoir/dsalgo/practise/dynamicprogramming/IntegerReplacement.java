package com.aneonoir.dsalgo.practise.dynamicprogramming;

import java.util.TreeSet;

/**
 * link:
 * attempt: Failed due to stackoverflow.
 * link: https://leetcode.com/submissions/detail/290837260/
 *
 * attemp2 : stack overflow was due to overflow of the int type, so I changed it to Long type , thus it solved
 *
 * attempt3: I should memorize the place.  solution from attempt2 solved it but very slow. memoization is required.
 *
 * TODO:
 *
 * tag: permutation, dynamic programming, recursion, interview.
 */
public class IntegerReplacement {
    public static void main(String[] args) {
        IntegerReplacement integerReplacement = new IntegerReplacement();
        int i = integerReplacement.integerReplacement(2147483647);
        System.out.println(i);

    }
    public int integerReplacement(int n) {
        TreeSet<Integer> list= new TreeSet<>();
        result(n,0,list);
        // System.out.println(list);
        return list.first();
    }
    private void  result(long n , long count,TreeSet<Integer> list){
        if(n==1){
            list.add((int)count);
        }else{
            if(n%2==0){
                result(n/2,count+1,list);
            }else{
                result(n-1,count+1,list);
                result(n+1,count+1,list);
            }
        }
    }
}
