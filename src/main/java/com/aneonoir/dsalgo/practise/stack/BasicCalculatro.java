package com.aneonoir.dsalgo.practise.stack;

import java.util.Stack;

/**
 *
 *  link: https://leetcode.com/problems/basic-calculator/submissions/
 *
 * todo:  try recursively ?
 *
 *
 * struggle : a lot of struggle .  a must practise
 * tag: hard, stack, string parsing, interivew,
 */
public class BasicCalculatro {
    public int calculate(String s) {
        String [] data= s.split("\\s+");
        StringBuffer sb= new StringBuffer();
        for(String str:data){
            sb.append(str);
        }
        String parsable=sb.toString();
        System.out.println(parsable);
        Stack<String> operator = new Stack<>();
        Stack<Integer> operand = new Stack<>();

        boolean isFinished=false;
        int i=0;
        while(i<parsable.length()){
            char ch= parsable.charAt(i);
            if(ch=='('){
                operator.push(ch+"");
            }else if(ch==')'){
                String chr=operator.pop();
                if(!operator.isEmpty()){
                    if(operator.peek().equals("+")){
                        operand.push(add(operand.pop(),operand.pop()));
                        operator.pop();
                    }else if( operator.peek().equals("-")){
                        int a=operand.pop();
                        int b= operand.pop();
                        operand.push(sub(b,a));
                        operator.pop();
                    }
                }

            }else if(ch=='+' || ch=='-'){
                operator.push(ch+"");
            }else{
                // 4+232;
                int num=0;
                while(i<parsable.length() && Character.isDigit(parsable.charAt(i))){
                    num=num*10+Integer.parseInt(parsable.charAt(i)+"");
                    i++;
                }
                i=i-1;
                if(operator.isEmpty()){
                    operand.push(num);
                }else{
                    operate(operator,operand,num);
                }
            }
            i++;
        }
        return operand.pop();
    }

    private void operate(Stack<String> operator, Stack<Integer> operand,Integer ch){
        if(operator.peek().equals("+")){
            operand.push(add(operand.pop(),ch));
            operator.pop();
        }else if( operator.peek().equals("-")){
            operand.push(sub(operand.pop(),ch));
            operator.pop();
        }else{
            operand.push(ch);
        }
    }
    private int add(int op,int op2){
        return op+op2;
    }
    private int sub(int op,int op2){
        return op-op2;
    }
}