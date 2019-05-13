package com.aneonoir.dsalgo.practise.strings;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * link: https://app.codesignal.com/arcade/intro/level-5/veW5xJednTy4qcjso
 * <p>
 * <p>
 * Struggle: split must be always \\ prefixed, I did it without \\, causing problem
 * // quads[i]!="" mistake, string equality
 * // there could be text contains letter or space or any other non digit
 * // why could not you think of regex, TODO: LEarn regex
 * // right now I have wrapped in a NumberFormatExcepion but its a bad idea
 */
public class IPaddress {

    @Test
    public void test() {
        assertTrue(isIPv4Address("a.254.255.0"));
    }

    boolean isIPv4Address(String inputString) {

        String quads[] = inputString.split("\\.");
        boolean result = false;
        if (quads.length < 4) {
            result = false;
        }
        int count = 0;
        try {
            for (int i = 0; i < quads.length; i++) {

                if (!quads[i].equals("") && (Integer.valueOf(quads[i]) >= 0 && Integer.valueOf(quads[i]) <= 255)) {
                    count++;
                } else {
                    break;
                }

            }
        } catch (NumberFormatException e) {

        }
        result = count == 4;
        return result;
    }

}
