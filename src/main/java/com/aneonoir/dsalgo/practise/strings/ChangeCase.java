package com.aneonoir.dsalgo.practise.strings;

import org.junit.Test;

import java.util.stream.Collectors;

/**
 * link: https://app.codesignal.com/challenge/NCuzDQJSWeAicpQKX?solutionId=Ea2fYku5Nvsa2Dupa
 *
 * solution: A functional way of achieving it, as below
 */
public class ChangeCase {


    @Test
    public void test() {
        String a="AZaz".chars().map(operand -> {
            if (operand >= 65 && operand <= 90) {
                operand += 32;
            } else {
                operand -= 32;
            }
            return operand;
        }).mapToObj(value -> (char)value + "").collect(Collectors.joining());
        System.out.println(a);
    }
}
