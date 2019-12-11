package com.aneonoir.dsalgo.practise.array;

/**
 * link: https://leetcode.com/problems/di-string-match/
 * <p>
 * Initially I could not find a way to solve it. I thought the way I solved it as a hunch, but
 * never fully dry run my idea before code. Next time always dry run your idea.
 *
 * TODO: a question may be a follow up is at https://practice.geeksforgeeks.org/problems/number-following-a-pattern/0
 *
 * A must do .
 * tag: string, array, interview,
 */
public class DIStringMatch {


    public int[] diStringMatch(String S) {
        int initMax = S.length();
        int initMin = 0;
        int[] result = new int[initMax + 1];
        for (int i = 0; i < S.length(); i++) {

            if (S.charAt(i) == 'I') {
                result[i] = initMin;
                initMin++;
            } else {
                result[i] = initMax;
                initMax--;
            }
        }
        result[S.length()] = initMax;
        return result;
    }

}
