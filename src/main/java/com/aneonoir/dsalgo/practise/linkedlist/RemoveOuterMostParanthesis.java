package com.aneonoir.dsalgo.practise.linkedlist;

import java.util.Stack;

public class RemoveOuterMostParanthesis {
    static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) {
        RemoveOuterMostParanthesis removeOuterMostParanthesis = new RemoveOuterMostParanthesis();
        String s = removeOuterMostParanthesis.removeOuterParentheses("(()(())((((())))))");
        System.out.println(s);
    }

    public String removeOuterParentheses(String S) {
        Stack<Character> st = new Stack<>();
        StringBuffer sb = new StringBuffer();
        StringBuffer sbD = new StringBuffer();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(') {
                st.push('(');
                if (sbD.length() >= 2) {
                    sb.append(sbD);
                    sbD = new StringBuffer();
                }
            } else {
                st.pop();
                if (st.size() == 1) {
                    if (sbD.length() >= 2) {
                        sbD.insert(0, "(");
                        sbD.insert(sbD.length(), ")");
                    } else {
                        sb.append("()");
                    }

                } else if (st.size() > 1) {
                    if (sbD.length() == 0) {
                        sbD.append("()");
                    } else {
                        sbD.insert(0, "(");
                        sbD.insert(sbD.length(), ")");
                    }
                } else {
                    sb.append(sbD.toString());
                }
            }
        }
        return sb.toString();
    }

}
