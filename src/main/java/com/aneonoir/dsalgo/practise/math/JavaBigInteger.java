package com.aneonoir.dsalgo.practise.math;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * link: https://www.hackerrank.com/challenges/java-biginteger/problem
 */
public class JavaBigInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number1 = sc.nextLine();
        String number2 = sc.nextLine();

        BigInteger bignumber1 = new BigInteger(number1);
        BigInteger bignumber2 = new BigInteger(number2);
        System.out.println(bignumber1.add(bignumber2));
        System.out.println(bignumber1.multiply(bignumber2));
    }
}
