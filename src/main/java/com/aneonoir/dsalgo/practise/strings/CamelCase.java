package com.aneonoir.dsalgo.practise.strings;

import java.util.Scanner;

/**
 * link: https://www.hackerrank.com/challenges/camelcase/
 */
public class CamelCase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        test(s);
    }


    public static void test(String input) {
        int output = 0;
        for (int count = 0; count < input.length(); count++) {
            if (isUpper(input.charAt(count))) {
                output++;
            }
        }
        if (input.length() > 0) {
            output += 1;
        }
        System.out.println(output);

    }

    public static boolean isUpper(Character c) {

        Character possibleUpper = Character.toUpperCase(c);
        if (possibleUpper.equals(c)) {
            return true;
        } else {
            return false;
        }
    }
}

