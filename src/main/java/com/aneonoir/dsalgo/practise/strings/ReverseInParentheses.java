package com.aneonoir.dsalgo.practise.strings;

/**
 * link: https://app.codesignal.com/arcade/intro/level-3/9DgaPsE2a7M6M2Hu6
 * <p>
 * tag: string,iterative,recursion,stack
 * Solution: First attempt , foo(bar)baz(blim) failed
 * <p>
 * Task 1: iterative approach
 * Task 2: recursion
 * Task 3: using stack.
 */
public class ReverseInParentheses {

    public static void main(String[] args) {
        String input = "foo(bar)baz(blim)";
        String s = reverseInPareenthesis(input);
        // com.aneonoir.dsalgo.practise.strings.String s1 = reverseInParenthesesRecursive(input);
        // System.out.println(s1);

    }

    private static String reverseInParenthesesRecursive(String as) {

        if (as.indexOf('(') == 0 && as.lastIndexOf(')') == as.length() - 1) {
            return new StringBuffer(as.substring(1, as.length() - 1)).reverse().toString();
        } else {

            String preText = as.substring(0, as.indexOf('('));
            String postText = as.substring(as.lastIndexOf(')') + 1);
            return preText + reverseInParenthesesRecursive(as.substring(as.indexOf('('), as.lastIndexOf(')') + 1)) + postText;
        }
    }


    private static String reverseInPareenthesis(String input) {
        StringBuffer sb = new StringBuffer(input);
        while (sb.lastIndexOf("(") != -1) {
            int innerMostOpen = sb.lastIndexOf("(");
            int innerMostClose = sb.indexOf(")");
            sb.replace(innerMostOpen, innerMostClose + 1, new StringBuffer(sb.substring(innerMostOpen + 1, innerMostClose)).reverse().toString());

        }
        return sb.toString();
    }
}
