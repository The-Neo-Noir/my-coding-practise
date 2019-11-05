package com.aneonoir.dsalgo.practise.strings;

/**
 * link: https://practice.geeksforgeeks.org/problems/sum-of-numbers-in-string/0
 * <p>
 * approach: Not as innocent as it looks. carefull, try again, a fantastic warm up question.
 * <p>
 * TODO: practise again .
 */
public class Sumofnumbersinstring {
    public static void main(String[] args) {

        System.out.println(sumOfnumbersInString("1abc23"));
        System.out.println(sumOfnumbersInString(" geeks4geeks"));
        System.out.println(sumOfnumbersInString(" 1abc2x30yz67"));
        System.out.println(sumOfnumbersInString(" 123abc"));
    }

    public static int sumOfnumbersInString(String sdf) {
        int sum = 0;

        for (int i = 0; i < sdf.length(); i++) {

            if (Character.isDigit(sdf.charAt(i))) {
                int j = i;
                while (j < sdf.length() && Character.isDigit(sdf.charAt(j))) { // see why its important to do the j<sdf.length() check first

                    j++;
                }
                String substring = sdf.substring(i, j);
                i = j;  // forgot to do it initially
                sum += Integer.parseInt(substring);
            }
        }
        return sum;
    }
}
