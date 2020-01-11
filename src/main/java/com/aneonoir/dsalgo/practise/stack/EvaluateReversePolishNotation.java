package com.aneonoir.dsalgo.practise.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * link: https://leetcode.com/problems/evaluate-reverse-polish-notation/submissions/
 *
 * todo: why is this slow ? can you improve it, even after deque its not fast .
 * First Attempt:
 * Runtime: 9 ms, faster than 10.95% of Java online submissions for Evaluate Reverse Polish Notation.
 * ITS slow:
 * trying with Deque :
 * Runtime: 8 ms, faster than 13.14% of Java online submissions for Evaluate Reverse Polish Notation.
 * update: very less improvements.
 *
 * TODO: can you do it recursively ?
 *
 * tag: interview,medium,stack, expression  evaluation ,
 */
public class EvaluateReversePolishNotation {

    public int evalRPN(String[] tokens) {
        Deque<String> operand = new ArrayDeque<>();
        for (String str : tokens) {
            if (str.length() == 1) {
                if ("+-*/".contains(str.charAt(0) + "")) {
                    if (operand.size() > 0) {
                        String second = operand.pop();
                        String first = operand.pop();
                        String result = operate(first, second, str.charAt(0));
                        operand.push(result);
                    }
                } else {
                    operand.push(str);
                }
            } else {
                operand.push(str);
            }
        }
        return Integer.parseInt(operand.pop());
    }

    public String operate(String first, String second, Character ch) {
        int f = Integer.parseInt(first);
        int s = Integer.parseInt(second);
        String result = "";
        switch (ch) {
            case '+':
                result = (f + s) + "";
                break;
            case '-':
                result = (f - s) + "";
                break;
            case '*':
                result = (f * s) + "";
                break;
            case '/':
                result = (f / s) + "";
                break;
            default:
                System.out.println("Don't match ");
        }
        return result;
    }
}
