package com.aneonoir.dsalgo.practise.strings;

/**
 * link: https://leetcode.com/problems/count-and-say/
 *
 * approach:
 *
 * tag : recursion, string, math, easy , interview,
 *
 * struggle: must do again .
 *
 */
public class CountAndSay {
    public String countAndSay(int n) {
        if (n == 1)
            return "1";
        else {
            String res = countAndSay(n - 1);
            StringBuffer sb = new StringBuffer();
            int currentIndex = 0;
            while (currentIndex < res.length()) {
                int count = 0;
                char currChar = res.charAt(currentIndex);
                boolean broke = false;
                for (int i = currentIndex; i < res.length(); i++) {
                    if (res.charAt(currentIndex) == res.charAt(i)) {
                        count++;
                    } else {
                        currentIndex = i;
                        broke = true;
                        break;
                    }
                }
                if (!broke) {
                    currentIndex = currentIndex + count;
                }
                sb.append(count + "" + currChar);
            }
            return sb.toString();

        }

    }
}
