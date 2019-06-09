package com.aneonoir.dsalgo.practise.stack;

import java.util.Scanner;
import java.util.Stack;

public class PrintBracketNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String asf[] = new String[a];
        for (int i = 0; i < a; i++) {
            asf[i] = sc.next();
            print(asf[i]);
        }

    }

    public static void print(String input) {
        Stack st = new Stack();
        int counter = 1;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(' || input.charAt(i) == ')') {
                if (input.charAt(i) == '(') {
                    System.out.print(counter + " ");
                    st.push(counter);
                    counter++;
                }
                if (input.charAt(i) == ')') {
                    System.out.print(st.pop() + " ");
                }
            }
        }
    }
}
