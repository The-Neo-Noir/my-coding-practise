package com.aneonoir.dsalgo.practise.stack;


/**
 * link:  recursive without stack
 */
public class ReverseInParenthesis {

    public static void main(String[] args) {
        ReverseInParenthesis reverseInParenthesis = new ReverseInParenthesis();
        String s = reverseInParenthesis.reverseParentheses("a(bc)c");
        System.out.println(s);
    }

    public String reverseParentheses(String s) {

        if (s.length() > 0) {
            String prefix = s.substring(0, s.indexOf("("));
            String postFix = s.substring(s.indexOf(")", -1) + 1, s.length());

            String rec = s.substring(s.indexOf("("), s.indexOf(")", -1) + 1);
            String res = "";
            if (rec.contains("(") || rec.contains(")")) {
                int lastLeftWeight = 0;
                int lastRightWeight = 0;
                for (int i = 0; i < rec.length(); i++) {

                }
            } else {
                return rec;
            }

            System.out.println(rec);

            String current = prefix + res + postFix;
            return current;

        } else {
            return "";
        }
    }
}