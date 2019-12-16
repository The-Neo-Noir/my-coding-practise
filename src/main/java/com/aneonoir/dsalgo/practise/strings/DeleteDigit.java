package com.aneonoir.dsalgo.practise.strings;

/**
 * link: https://app.codesignal.com/arcade/intro/level-11/vpfeqDwGZSzYNm2uX
 * <p>
 * appraoch: used the string way to do it , is there a better way to do it /
 * <p>
 * TODO:
 * tag: interview, string,math,
 */
public class DeleteDigit {
    int deleteDigit(int n) {
        String s = new String(n + "");

        Integer max = 0;
        for (int i = 0; i < s.length(); i++) {
            StringBuffer sb = new StringBuffer();
            int inc = 0;
            for (Character ch : s.toCharArray()) {
                if (i != inc) {
                    sb.append(ch + "");
                }
                inc++;
            }
            System.out.println(sb.toString());
            if (max < Integer.parseInt(sb.toString())) {
                max = Integer.parseInt(sb.toString());
            }
        }
        return max;

    }

}
