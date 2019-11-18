package com.aneonoir.dsalgo.practise.math;

import java.util.Scanner;

/**
 * link: self
 *
 */
public class GCD {
    public static void main (String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        System.out.println(2%5);
        while(t-->0){
            System.out.println( gcd(sc.nextInt(),sc.nextInt()));
        }
    }
    private static int gcd(int number,int divisor){
        if(number%divisor==0)
            return divisor;
        else
            return gcd(divisor,number%divisor);
    }
    private static int gcdIterative(int number , int divisor){
        int remainder=number%divisor;
        while(remainder!=0){
            number=divisor;
            divisor=number%divisor;
        }
        return 0;
    }
}
