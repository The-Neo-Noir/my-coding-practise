package com.aneonoir.dsalgo.practise.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * link: https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/submissions/
 *
 * slow: why ?
 * Runtime: 387 ms, faster than 9.42% of Java online submissions for Remove All Adjacent Duplicates In String.
 *
 * TODO: can you do it using string?
 * TODO: can you do it using recursion ?
 *
 * tag: interivew, easy , stack,string
 */
public class RemoveAllAdjacentDuplicatesInString {

    public static void main(String[] args) {
        System.out.println(new RemoveAllAdjacentDuplicatesInString().removeDuplicates("abbccca"));

    }

    public String removeDuplicates(String S) {
        Deque<Character> st = new ArrayDeque<>();
        for (Character c : S.toCharArray()) {
            if (st.isEmpty()) {
                st.push(c);
            } else {
                if (st.peek() == c) {
                    st.pop();
                } else {
                    st.push(c);
                }
            }
        }
        String str = "";
        while (!st.isEmpty()) {
            str = st.pop() + str;
        }
        return str;
    }
}
