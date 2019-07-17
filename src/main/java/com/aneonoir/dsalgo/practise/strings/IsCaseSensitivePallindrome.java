package com.aneonoir.dsalgo.practise.strings;

/**
 * link: https://app.codesignal.com/arcade/code-arcade/book-market/G9wj2j6zaWwFWsise
 * <p>
 * struggle: sb.equals(sb.reverse()) is not going to give you what you intended to use.
 * com.aneonoir.dsalgo.practise.strings.String.equals(StringBuffer) is not same
 */
public class IsCaseSensitivePallindrome {

    boolean isCaseInsensitivePalindrome(String inputString) {
        StringBuffer sb = new StringBuffer(inputString.toLowerCase());
        sb.reverse();
        return sb.toString().equals(inputString.toLowerCase());
    }


}
