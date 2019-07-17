package com.aneonoir.dsalgo.practise.math;

/**
 * link: https://app.codesignal.com/challenge/JwirnFz8qyM87a3yG
 * <p>
 * solution:
 * approach: todo: can you check how others solved it.
 */
public class FractionSubstration {


    int[] fractionSubtraction(int[] a, int[] b) {
        int first = a[0] * b[1] - b[0] * a[1];
        int second = a[1] * b[1];
        int gcf = son(first, second);
        if (first == second) {
            return new int[]{1};
        } else if (first > second) {
            if (first % second == 0) {
                return new int[]{first / second};
            } else {
                return new int[]{first / gcf, second / gcf};
            }
        } else {

            return new int[]{first / gcf, second / gcf};
        }
    }

    int son(int first, int second) {
        if (first == 0 || second == 0) {
            return 0;
        }
        if (first == second) {
            return first;
        }
        if (first > second) {
            return son(first - second, second);
        } else {
            return son(first, second - first);
        }
    }

}
