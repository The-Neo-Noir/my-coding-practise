package com.aneonoir.dsalgo.practise.recursion.self;

/**
 * TODO: do it again.
 */
public class PowerOfXToY {
    public static void main(String[] args) {
        System.out.println(power(3, 0));
    }

    private static int power(int number, int power) {
        if (power == 1) {
            return number;
        } else {
            return number * power(number, power - 1);
        }
    }
}
