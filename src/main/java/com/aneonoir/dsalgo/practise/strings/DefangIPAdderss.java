package com.aneonoir.dsalgo.practise.strings;

/**
 * link: https://leetcode.com/problems/defanging-an-ip-address/submissions/
 * <p>
 * approach: solved using split.
 * Struggle: the last sting won't need [.], which I fixed,could not identify in the first time.
 * tag: regex, string
 */
public class DefangIPAdderss {
    public String defangIPaddr(String address) {
        StringBuffer sb = new StringBuffer();
        String[] indviuals = address.split("\\.");
        for (int i = 0; i < indviuals.length; i++) {
            //    System.out.println(indviuals[i]);
            sb.append(indviuals[i]);
            if (i != indviuals.length - 1)
                sb.append("[.]");
        }
        // System.out.println(sb.toString());
        return sb.toString();
    }
}