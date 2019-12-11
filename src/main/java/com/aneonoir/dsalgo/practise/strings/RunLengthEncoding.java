package com.aneonoir.dsalgo.practise.strings;

/**
 * link: https://practice.geeksforgeeks.org/problems/run-length-encoding/1
 * <p>
 * approach: pretty bruteforce solution ,
 * <p>
 * did you try analysing the complexity ?
 * TODO: can you use a hash machanisim to solve it.
 * <p>
 * tag: string, encoding,
 */
public class RunLengthEncoding {
    String encode(String str) {
        StringBuffer sb = new StringBuffer();
        int indexS = 0;
        while (indexS < str.length()) {
            char ch = str.charAt(indexS);
            int index = indexS;
            int count = 0;
            while (index < str.length() && ch == str.charAt(index)) {
                count++;
                index++;
            }
            sb.append(ch + "" + count);
            indexS = index;
        }
        return sb.toString();
    }
}
