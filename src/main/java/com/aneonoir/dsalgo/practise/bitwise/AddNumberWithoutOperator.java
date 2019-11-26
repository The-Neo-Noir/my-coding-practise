package com.aneonoir.dsalgo.practise.bitwise;

/**
 * link:    https://leetcode.com/problems/sum-of-two-integers/submissions/
 * <p>
 * approach: Possibly a bitwise.
 * right shift
 * if both one then carry 1 , solve it using that method , but its still not fast.
 * storing the result in the long helped solve it. But slow.
 * <p>
 * Runtime: 1 ms, faster than 7.40% of Java online submissions for Sum of Two Integers.
 * Memory Usage: 33 MB, less than 6.67% of Java online submissions for Sum of Two Integers.
 * Next challenges:
 * <p>
 * TODO:
 * tags: interview, bitwise.
 * <p>
 * AN AMAZING READ : https://leetcode.com/problems/sum-of-two-integers/discuss/84278/A-summary%3A-how-to-use-bit-manipulation-to-solve-problems-easily-and-efficiently
 * <p>
 * http://graphics.stanford.edu/~seander/bithacks.html
 */
public class AddNumberWithoutOperator {
    public int getSum(int a, int b) {
        int i = 32;
        int carry = 0;
        long sum = 0;
        int pow = 0;
        String sumw = "";
        while (i-- > 0) {
            int aB = a & 1;
            int bB = b & 1;
            int cal = aB + bB + carry;
            int result = cal % 2;
            carry = cal / 2;
            if (carry == 0) {
                carry = 0;
            }
            sumw = result + "" + sumw;
            sum += ((long) Math.pow(2, pow) * result);
            a = a >> 1;
            b = b >> 1;
            pow++;

        }
        System.out.println(sumw);
        System.out.println(sum);
        return (int) sum;

    }
}
