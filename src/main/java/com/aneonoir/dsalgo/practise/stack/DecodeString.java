package com.aneonoir.dsalgo.practise.stack;

import java.util.Stack;

/**
 * link: https://leetcode.com/problems/decode-string/
 * <p>
 * Decode String
 * <p>
 * tag: stack,recursion,
 * <p>
 * TODO: can you do it without recursion ?
 */
public class DecodeString {

    public static void main(String[] args) {
        String s = decodeString("3[abc]2[x]");

        String sdf = decodeString("3[a2[c]]");
        System.out.println(sdf);

    }

    public static String decodeString(String s) {
        Stack<Character> stOperation = new Stack<>();
        Stack<String> stOperand = new Stack<>();

        for (Character c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                stOperation.push(c);
            } else if (c == '[') {
                stOperation.push(c);
            } else if (Character.isAlphabetic(c)) {
                if (stOperand.isEmpty()) {
                    stOperand.push(c + "");
                } else {
                    if (stOperand.peek().equals("*")) {
                        stOperand.push(c + "");
                    } else {
                        stOperand.push(stOperand.pop() + "" + c);
                    }
                }
            } else if (c == ']') {
                String sd = stOperand.pop();
                stOperation.pop();
                int operation = Integer.parseInt(stOperation.pop() + "");

                stOperand.push(oprate(sd, operation));
                stOperand.push("*");
            }
        }
        StringBuffer sb = new StringBuffer();
        Stack<String> result = new Stack<>();
        while (!stOperand.isEmpty()) {
            if (!stOperand.peek().equals("*")) {
                result.push(stOperand.pop());
            }else{
                stOperand.pop();
            }
        }
        while (!result.isEmpty()) {
            sb.append(result.pop());
        }
        return sb.toString();
    }

    private static String oprate(String sd, int operation) {
        StringBuffer sb = new StringBuffer();
        while (operation-- > 0) {
            sb.append(sd);
        }
        return sb.toString();
    }
}
