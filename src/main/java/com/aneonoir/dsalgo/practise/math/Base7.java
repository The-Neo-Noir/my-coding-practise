package com.aneonoir.dsalgo.practise.math;

/**
 *
 * link: https://leetcode.com/problems/base-7/submissions/
 *
 *
 *
 * Ask clarifying question, could there be a negative number ?
 * -neative , postive, range, 0 etc.
 *
 * Failed test case for 0 , dude , you gotta be serious
 *
 *
 *
 * tag: math, base conversion, tricky
 * TODO: recursive  ? see how others are doing it.
 *
 *
 */
public class Base7 {
    public String convertToBase7(int num) {
        String sb= new String();
        boolean isNegative=false;
        if(num<0){
            isNegative=true;
            num =-1*num;
        }
        while(num>0){
            sb=(num%7)+""+sb;
            num/=7;
        }
        return isNegative ? "-"+sb: sb.equals("") ?  "0":sb;
    }
}