package com.aneonoir.dsalgo.practise.strings;

import org.junit.Test;

/**
 * link: https://app.codesignal.com/arcade/code-arcade/book-market/2nSEQ8CGoddTJtnbo
 * struggle: a little bit converting asci to char
 */
public class ProperNoun {

    @Test
    public void test() {
        String paris = properNounCorrection("Paris");
        System.out.println(paris);

    }

    String properNounCorrection(String noun) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < noun.length(); i++) {
            if (i == 0) {
                if (!(noun.charAt(i) + "").matches("[A-Z]")) {
                    sb.append("" + (char) (noun.charAt(i) - 32));
                } else {
                    sb.append(noun.charAt(i));
                }
            } else {
                if ((noun.charAt(i) + "").matches("[A-Z]")) { //if capital
                    sb.append("" + (char) (noun.charAt(i) + 32));
                } else {
                    sb.append(noun.charAt(i));
                }
            }
        }
        return sb.toString();
    }


}
