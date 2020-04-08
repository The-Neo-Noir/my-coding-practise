package com.aneonoir.dsalgo.practise.bitwise;

/**
 * link: https://leetcode.com/problems/number-of-steps-to-reduce-a-number-in-binary-representation-to-one/submissions/
 *
 * TODO: should be much easier way to do it and faster as well
 *
 *
 * Runtime: 23 ms, faster than 17.37% of Java online submissions for Number of Steps to Reduce a Number in Binary Representation to One.
 *
 * tag: interview,medium,bitwise, string.s
 */
public class NumberofStepstoReduceANumberInBinaryRepresentationToOne {
    public int numSteps(String s) {
        if(s.length()==1 && s.equals("1")){
            return 0;
        }else{
            if(s.charAt(s.length()-1)=='0'){
                return 1+numSteps(s.substring(0,s.length()-1));
            }else{
                return 1+numSteps(addOne(s));
            }
        }
    }
    private String addOne(String input){
        StringBuilder sb= new StringBuilder("0");
        int carry=1;
        boolean flag=false;
        for(int i=input.length()-2;i>=0;i--){
            if(!flag){
                if(input.charAt(i)=='0'){
                    carry=0;
                    sb.append("1");
                    flag=true;
                }else{
                    sb.append("0");
                    carry=1;
                }
            }else{
                sb.append(input.charAt(i)+"");
            }
        }
        if(carry==1) sb.append("1");
        return sb.reverse().toString();
    }
}
