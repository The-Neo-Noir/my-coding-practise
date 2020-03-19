package com.aneonoir.dsalgo.practise.strings;

/**
 * link: https://www.codewars.com/kata/5d98b6b38b0f6c001a461198/train/java
 * stuggle: in decode, forgot to do =='0' at 42 , silly mistake,
 *
 *
 * tag: struggle, string, parsing, math, integer
 */
public class Binaries {
    public static void main(String[] args) {
        String decode = decode("10001111");
        System.out.println(decode);
    }
    public static String code(String strng) {
        //1 0 1 1 1 2 1 3
        StringBuffer sb = new StringBuffer();
        for (Character ch : strng.toCharArray()) {
            if (ch == '1' || ch == '0') {
                sb.append("1" + ch);
            } else {
                String length = Integer.toBinaryString(Integer.parseInt(ch + ""));
                for (int i = 0; i < length.length() - 1; i++) sb.append("0");
                sb.append("1");
                sb.append(length);
            }
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    public static String decode(String str) {
        int i = 0;
        StringBuffer sb = new StringBuffer();
        boolean flag = false;
        int count = 0;
        //10001111
        //     ^
        while (i < str.length()) {
            if (!flag && str.charAt(i) == '1') {
                sb.append(str.charAt(++i) + ""); // bounds
                i++;
            } else {
                flag = true;
                if (str.charAt(i) == '0') {
                    count++;
                    i++;
                } else {

                    sb.append(Integer.parseInt(str.substring(i + 1, i + 1 + count + 1), 2));
                    i = i + 1 + count + 1;
                    flag = false;
                    count = 0;
                }
            }
        }
        return sb.toString();
    }
}
