package com.aneonoir.dsalgo.practise.strings;

/**
 * link: https://app.codesignal.com/arcade/code-arcade/lab-of-transformations/8nAgfjhDvKCpxwGWF
 * <p>
 * TODO: any better way to solve it ?
 */
public class ReflectString {

    String reflectString(String inputString) {
        StringBuffer sb = new StringBuffer();
        String indexes = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < inputString.length(); i++) {
            sb.append("" + indexes.charAt(25 - indexes.indexOf(inputString.charAt(i))));
        }
        return sb.toString();
    }
}
