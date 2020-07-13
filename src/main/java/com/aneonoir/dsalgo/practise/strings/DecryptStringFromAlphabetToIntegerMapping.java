package com.aneonoir.dsalgo.practise.strings;
/** link : https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/
 *
 * appraoch: bruteforce, use of indexOf method from string .
 *
 * Took a good amount of time to solve it , but looks like there is a very slow performance.
 * Can you improve it ?
 * Can you find out the runtime of this ?
 *
 * Runtime: 14 ms, faster than 8.95% of Java online submissions for Decrypt String from Alphabet to Integer Mapping.
 *
 */
public class DecryptStringFromAlphabetToIntegerMapping {
    public String freqAlphabets(String s) {
        int index = 0;
        int lastIndex = index;
        String result = "";
        while (index >= 0) {
            index = s.indexOf("#", lastIndex);
            if (index >= 0) {
                String prev = s.substring(lastIndex, index - 2);
                for (Character ch : prev.toCharArray()) {
                    result = result + (char) ('a' + Integer.parseInt(ch + "") - 1) + "";
                }
                result = result + (char) ((char) 'a' + Integer.parseInt(s.substring(index - 2, index)) - 1) + "";
                lastIndex = index + 1;
            }
        }
        for (Character ch : s.substring(lastIndex, s.length()).toCharArray()) {
            result = result + (char) ('a' + Integer.parseInt(ch + "") - 1) + "";
        }
        return result;
    }

}
