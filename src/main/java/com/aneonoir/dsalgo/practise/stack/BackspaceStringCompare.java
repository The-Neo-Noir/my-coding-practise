package com.aneonoir.dsalgo.practise.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * link: https://leetcode.com/problems/backspace-string-compare/submissions/
 *
 * approach : I used a stack to solve, it.
 *
 * learning: Learning: You don't need to build the String from the stack, stack.toString(), will return in ['a','b''] like so.  should help
 *
 * String.valueOf(st); in this case can help
 *
 * TODO: can you do it using recursion ? Can you do it using two pointer approach ?
 *
 *  why its slow using stack , Runtime: 3 ms, faster than 12.02% of Java online submissions for Backspace String Compare.
 *
 *  Changed form Stack to   Deque<Character> st = new ArrayDeque<>(input.length());
 *
 *  and the performance improved alteast 4 times.
 *
 *
 *
 */
public class BackspaceStringCompare {

    public static void main(String[] args) {

        BackspaceStringCompare backspaceStringCompare = new BackspaceStringCompare();
        backspaceStringCompare.backspaceCompare("din", "dinn#");
    }

    public boolean backspaceCompare(String S, String T) {
        String resultS = process(S);
        String resultT = process(T);
        return resultS.equals(resultT);
    }

    private String process(String input) {
        Deque<Character> st = new ArrayDeque<>(input.length());
        for (Character ch : input.toCharArray()) {
            if (Character.isAlphabetic(ch)) {
                st.push(ch);
            } else {
                if (!st.isEmpty()) {
                    st.pop();
                }
            }
        }
        return String.valueOf(st);
    }
}
