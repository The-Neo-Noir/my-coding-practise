package com.aneonoir.dsalgo.practise.bitwise;

import java.util.HashMap;
import java.util.Map;

/**
 * link: https://leetcode.com/problems/convert-a-number-to-hexadecimal/submissions/
 * <p>
 * Runtime: 7 ms, faster than 11.48% of Java online submissions for Convert a Number to Hexadecimal.
 * <p>
 * problematic : got few places stuck.
 * <p>
 * TODO: slow performance, must be a better way to deal with this. one.
 * tag: interview,bitwise, two's complements,
 */
public class ConvertNumberToHexaDecimal {
    public static void main(String[] args) {
        toHex(26);
    }

    public static String toHex(int num) {
        String hexNumers[] = new String[]{"a", "b", "c", "d", "e", "f"};
        Map<String, String> hexMap = new HashMap<>();

        hexMap.put("0000", "0");
        hexMap.put("0001", "1");
        hexMap.put("0010", "2");
        hexMap.put("0011", "3");
        hexMap.put("0100", "4");
        hexMap.put("0101", "5");
        hexMap.put("0110", "6");
        hexMap.put("0111", "7");
        hexMap.put("1000", "8");
        hexMap.put("1001", "9");
        hexMap.put("1010", "a");
        hexMap.put("1011", "b");
        hexMap.put("1100", "c");
        hexMap.put("1101", "d");
        hexMap.put("1110", "e");
        hexMap.put("1111", "f");

        String result = "";

        String binString = Integer.toBinaryString(num);
        int length = binString.length();
        for (int i = 0; i < 32 - length; i++) {
            binString = "0" + binString;
        }
        System.out.println(" S " + binString);
        int up = (binString.length() / 4) - 1;
        while (up >= 0) {
            String key = binString.substring((up * 4), (up * 4) + 4);
            System.out.println(key);
            result = hexMap.get(key) + "" + result;
            up--;
        }
        int count = 0;
        for (int i = 0; i < 8; i++) {
            if (result.charAt(i) != '0') {
                count = i;
                break;
            }

        }
        return result.substring(count);
    }
}
