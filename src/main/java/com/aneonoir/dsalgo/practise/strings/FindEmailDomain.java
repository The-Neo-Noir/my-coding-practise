package com.aneonoir.dsalgo.practise.strings;

/**
 * https://app.codesignal.com/arcade/code-arcade/book-market/TXFLopNcCNbJLQivP/solutions
 *
 *struggle: charAt and indexOf are different
 */
public class FindEmailDomain {

    String findEmailDomain(String address) {
        return address.substring(address.lastIndexOf('@')+1,address.length());
    }

}
