package com.aneonoir.dsalgo.practise.strings;

/**
 * link: https://www.hackerrank.com/challenges/time-conversion/problem
 */
public class TimeConversion {
    String timeConversion(String s) {
        StringBuffer sb = new StringBuffer();
        String sp[] = s.split("\\:");
        if (s.contains("AM")) {
            sb.append(sp[0]);
        } else {
            sb.append(Integer.parseInt(sp[0]) + 12);
        }
        sb.append(":" + sp[1] + ":" + s.substring(6, 8));
        return sb.toString();
    }
}
