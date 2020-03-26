package com.aneonoir.dsalgo.practise.dynamicprogramming;

/**
 *
 */
public class ClimbStairsWithStairCases {
    public static void main(String[] args) {
        String s = printStairs(3);
        System.out.println(s);
    }

    private static String printStairs(int i) {
        if (i == 0) return "";
        if (i == 1) return "1 ";
        else {
            String left = printStairs(i - 1);
            String right = printStairs(i - 2);

            String collectL = "";
            String[] splitL = left.split("\n");
            for (int j = 0; j < left.split("\n").length; j++) {
                collectL += splitL[j] + "1 \n";
            }
            String[] splitR = right.split("\n");
            String collectR = "";
            for (int j = 0; j < right.split("\n").length; j++) {
                collectR += splitR[j] + "2 \n";
            }
            return collectL + collectR;
        }
    }
}
