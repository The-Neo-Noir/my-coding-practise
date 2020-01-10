package com.aneonoir.dsalgo.practise.stack;

import java.util.Stack;

/**
 * link: https://leetcode.com/problems/score-of-parentheses/submissions/
 *
 *
 * I used a single stack to get the result, I believe I could have used a double stack to solve it.
 *
 * Used heavily on the ide debugging feature, the iterative method is complecated.
 *
 * TODO: practise agian, do it recursively.
 *
 * tag: interview, stack, recursion, medium.
 */
public class ScoreOfParenthesis {
    public static void main(String[] args) {
        ScoreOfParenthesis scoreOfParenthesis = new ScoreOfParenthesis();
        int i = scoreOfParenthesis.scoreOfParentheses("()(()()())()");
        System.out.println(i);
    }
    public int scoreOfParentheses(String S) {
        Stack<String> st = new Stack<>();
        int result=0;
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='('){
                st.push(S.charAt(i)+"");
            }else{
                String s=st.pop();
                if(s.equals("(")){
                    String toPush="1";
                    if(!st.isEmpty()){
                        if(!st.peek().equals("(")) {
                            toPush=Integer.parseInt(st.pop())+1+"";
                        }
                    }
                    st.push(toPush);
                }else{
                    Integer val=Integer.parseInt(s)*2;
                    if(!st.isEmpty()){
                        st.pop();
                    }
                    if(!st.isEmpty() && !st.peek().equals("(")){
                        String d= st.pop();
                        result = val+Integer.parseInt(d);
                        st.push(result+"");
                    }else{
                        st.push(val+"");
                    }
                }
            }
        }
        return Integer.parseInt(st.peek());
    }
}
