package com.aneonoir.dsalgo.practise.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * link: https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/
 *
 *  My test cases:
 * "())"
 * ""
 * "((("
 * "()"
 * "()))(("
 * "()()()"
 * "(())(()())()"
 * "(()())()((())))"
 * "))()(()(())"
 * "((())(((((())()())"
 *
 * Seems to have passed all, can you find alternate solution ?  It seems slow.
 * String.replaceAll("()","") is invalid, proof why
 * tag: string,stack,
 *
 * TODO: can you do it recursively ?
 *
 * TODO: kind of slow. can you do it better ?
 *
 */
public class MinimumAddToMakeParanthesisValid {

    // second attempt ,
    public int minAddToMakeValid2(String s){
        String s1 = s.replaceAll("()", "");
        return s1.length();
    }
    public int minAddToMakeValid(String S) {
        Deque<Character> st = new ArrayDeque<>();
        for (Character ch : S.toCharArray()) {
            if (ch == '(') {
                st.push('(');
            } else {
                if (!st.isEmpty()) {
                    if (st.peek() == '(') st.pop();
                    else st.push(')');
                } else {
                    st.push(')');
                }
            }
        }
        return st.size();
    }

}
