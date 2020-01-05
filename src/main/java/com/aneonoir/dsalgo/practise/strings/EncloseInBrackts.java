package com.aneonoir.dsalgo.practise.strings;

/**
 * link: https://app.codesignal.com/arcade/code-arcade/book-market/K2ieDm98sPDzzMepz/solutions
 * <p>
 * todo: can you it using char array ?
 * tag: string,
 * level: naive,
 */
public class EncloseInBrackts {

    String encloseInBrackets(String inputString) {
        StringBuffer sb = new StringBuffer("(");
        return sb.append(inputString).append(")").toString();
    }

}
