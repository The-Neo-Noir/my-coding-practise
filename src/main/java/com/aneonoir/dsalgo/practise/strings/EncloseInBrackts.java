package com.aneonoir.dsalgo.practise.strings;

/**
 * link: https://app.codesignal.com/arcade/code-arcade/book-market/K2ieDm98sPDzzMepz/solutions
 *
 * todo: can you it using char array ?
 */
public class EncloseInBrackts {

    String encloseInBrackets(String inputString) {
        StringBuffer sb= new StringBuffer("(");
        return sb.append(inputString).append(")").toString();
    }

}