package com.aneonoir.dsalgo.practise.strings;

import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * link:
 * TODO
 * tag: stack,
 */
public class BasicCalculator {
    HashMap<Character, Integer> map = new HashMap<>();


    public static void main(String[] args) {
        BasicCalculator basicCalculator = new BasicCalculator();
        int calculate = basicCalculator.calculate("3+2*4*3");
        System.out.println(calculate);
    }
    public int calculate(String s) {
        map.put('/', 3);
        map.put('*', 2);
        map.put('+', 1);
        map.put('-', 0);

        PriorityQueue<Expression> p = new PriorityQueue<>();


        int operand1 = 0;
        int operand2 = 0;
        char current = ' ';//
        char operator = '+';
        boolean operand2Set = false, operand1Set = false;

        for (int i = 0; i < s.length(); i++) {
            current = s.charAt(i);
            if (Character.isDigit(current)) {
                if (operand1Set == true) {
                    operand2 = Integer.parseInt(current + "");
                    operand2Set = true;

                } else {
                    operand1 = Integer.parseInt(current + "");
                    operand1Set = true;
                }

            } else if (current == '+' || current == '-' || current == '*' || current == '/') {
                operator = current;
            } else {
            }
            if (operand2Set) {
                Expression exp = new Expression(operand1, operand2, operator);
                p.add(exp);
                operand1=operand2;
                operand2Set=false;
                operand1Set=true;
            }
        }

        int lastResult = 0;
        boolean lastValueset = false;
        Expression ex =null;
        while (!p.isEmpty()) {
            ex=p.remove();
            if(lastValueset){
                ex.operand2=lastResult;
            }
           lastResult= ex.evaluate();
            lastValueset=true;
        }
        return lastResult;
    }

    class Expression implements Comparable<Expression> {

        int operand1;
        int operand2;
        char operator;

        Expression(int operand1, int operand2, char operator) {
            this.operand1=operand1;
            this.operand2=operand2;
            this.operator=operator;
        }

        public int compareTo(Expression exp) {
            return  map.get(exp.operator)-map.get(this.operator);
        }

        int evaluate() {
            int result = 0;
            switch (operator) {
                case '/':
                    result = operand1 / operand2;
                    break;
                case '*':
                    result = operand1 * operand2;
                    break;
                case '+':
                    result = operand1 + operand2;
                    break;
                case '-':
                    result = operand1 - operand2;
                    break;
                default:
                    result = 0;
            }
            return result;
        }
    }
}