package com.aneonoir.dsalgo.practise.math;

/**
 * link: https://app.codesignal.com/arcade/intro/level-6/6cmcmszJQr6GQzRwW/solutions
 * <p>
 * tags: math,iteration
 */
public class EvenDigitsOnly {

    boolean evenDigitsOnly(int n) {
        boolean result = true;
        while (n > 0) {
            if ((n % 10) % 2 != 0) {
                result = false;
                break;
            } else {
                n = n / 10;
            }

        }
        return result;
    }
}
