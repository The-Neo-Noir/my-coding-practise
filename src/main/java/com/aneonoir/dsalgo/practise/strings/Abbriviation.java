package com.aneonoir.dsalgo.practise.strings;

/**
 * link: https://www.codewars.com/kata/5375f921003bf62192000746/solutions/java/me/best_practice
 * <p>
 * todo: struggle,
 * <p>
 * tag: struggle, string parsing, do it gain.
 */
public class Abbriviation {

    public String abbreviate(String string) {

        // split some how
        //for each string
        // if> 3 encode
        //build and return
        System.out.println(string);
        StringBuffer sb = new StringBuffer();
        int start = 0;
        boolean started = false;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isAlphabetic(string.charAt(i))) {
                if (!started) {
                    start = i;
                    started = true;
                }

            } else if (started == false) {
                sb.append(string.charAt(i) + "");
            } else {
                sb.append(encode(string.substring(start, i))).append(string.charAt(i) + "");
                started = false;
            }
        }
        if (started) sb.append(encode(string.substring(start, string.length())));
        return sb.toString();
    }

    private static String encode(String str) {
        // System.out.println("Called " + str);
        if (str.length() > 3) {
            return str.charAt(0) + "" + (str.length() - 2) + "" + str.charAt(str.length() - 1);
        } else {
            return str;
        }
    }

}
