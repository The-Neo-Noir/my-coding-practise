package com.aneonoir.dsalgo.practise.strings;

/**
 * link: https://leetcode.com/problems/add-binary/submissions/
 * <p>
 * approach : attemp1 : found the least size among the two , I iterate that many times with the carry to the big,
 * started from where I left.
 * apptempt 2: this solution is much cleaner to reason with and comparativly faster.
 * <p>
 * tag: math, binary, character , interview, struggle,
 * <p>
 * <p>
 * SLow :
 * TODO: can you improve it
 * <p>
 * Runtime: 3 ms, faster than 15.46% of Java online submissions for Add Binary.
 * Memory Usage: 36.2 MB, less than 100.00% of Java online submissions for Add Binary.
 */
public class AddBinary {

    public static void main(String[] args) {
        AddBinary addBinar = new AddBinary();
        //  String s = addBinar.addBinary("110", "11");
        // String s2 = addBinar.addBinary("1010", "1011");
        //String s2 = addBinar.addBinary("11", "1");
        String s2 = addBinar.addBinary("101111", "10");

        //  System.out.println(s);
        System.out.println(s2);
    }

    public String addBinary(String a, String b) {
        String resultStr = "";
        String small = a;
        String big = b;
        if (a.length() > b.length()) {
            big = a;
            small = b;
        }
        int maxLength = big.length() - 1;
        int smallLength = small.length() - 1;

        int carry = 0;
        for (int i = maxLength; i >= 0; i--) {
            int bigV = Integer.parseInt(big.charAt(i) + "");
            int smV = 0;
            if (smallLength >= 0) {
                smV = Integer.parseInt(small.charAt(smallLength) + "");
            }
            int result = bigV + smV + carry;
            if (result > 1) {
                carry = 1;
            } else {
                carry = 0;
            }
            resultStr = (result % 2) + "" + resultStr;
            smallLength--;

        }
        if (carry == 1) {
            resultStr = "1" + resultStr;
        }
        return resultStr;
    }
}

