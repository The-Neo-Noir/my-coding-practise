package com.aneonoir.dsalgo.practise.strings;

import java.util.Stack;

/**
 * link: https://leetcode.com/problems/remove-outermost-parentheses/
 *
 *
 * struggle; I thought I could solve it using stack, but could not then I tried with both a string and a stack metthod.
 *
 * i could able to fix it.
 *
 *
 * tag: interview,string,stack, must-do-interview
 */
public class RemoveOutermostParentheses {
    public String removeOuterParentheses(String S) {
        int startIndex = 0;
        StringBuffer sb = new StringBuffer();
        boolean started = false;
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(') {
                st.push('(');
                if (!started) {
                    startIndex = i;
                    started = true;
                }
            } else {
                if (!st.isEmpty()) st.pop();
                if (st.isEmpty()) {
                    sb.append(S.substring(startIndex + 1, i));
                    started = false;
                }
            }
        }
        return sb.toString();
    }
}
