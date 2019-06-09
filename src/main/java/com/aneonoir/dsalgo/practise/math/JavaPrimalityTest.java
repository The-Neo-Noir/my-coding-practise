package com.aneonoir.dsalgo.practise.math;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * link: https://www.hackerrank.com/challenges/java-primality-test/problem
 */
public class JavaPrimalityTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        in.close();
        if (n.isProbablePrime(100)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");

        }
        // Write your code here.
    }
}

