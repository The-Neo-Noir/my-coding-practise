package com.aneonoir.dsalgo.practise.warmup;

import java.util.LinkedList;
import java.util.List;

/**
 * link: https://leetcode.com/problems/fizz-buzz/solution/
 * <p>
 * Approach : the given apporach is fine, but when you face more conditionals, like 3->"fizz", 5->"buzz" 7->"Some", you
 * will endup with a lot of conditional.s
 * <p>
 * A better approach will be to use {$link https://leetcode.com/problems/fizz-buzz/solution/}
 * <p>
 * tag: warmup,interview
 */
public class FizzBuzzInATwist {

    public List<String> fizzBuzz(int i) {
        List<String> list = new LinkedList<>();
        for (int n = 1; n <= i; n++) {
            if (n % 3 == 0 && n % 5 == 0) {
                list.add("FizzBuzz");
            } else if (n % 3 == 0) {
                list.add("Fizz");
            } else if (n % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(n + "");
            }
        }
        return list;
    }
}
