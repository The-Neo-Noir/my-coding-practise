package com.aneonoir.dsalgo.practise.strings;

/**
 *
 * link: https://leetcode.com/problems/valid-palindrome/submissions/
 *
 *
 * learning: Dude stop what ever you are doing , and start making sure you are good at && ||  etc. very important ,this qkuestion got me the best .
 *
 * tag: two pointer, interview, edge case trickery,
 * */
public class ValidPallindrome {

    public static void main(String[] args) {
        ValidPallindrome validPallindrome = new ValidPallindrome();
      //  validPallindrome.isPalindrome("0P");
       // boolean palindrome = validPallindrome.isPalindrome("A man, a plan,: :a canal: Panama");
        boolean palindrome = validPallindrome.isPalindrome("race a car ");

    }
    public boolean isPalindrome(String s) {
        int low = 0;
        int high = s.length() - 1;
        boolean result = true;
        while (low < high) {

            if (!Character.isAlphabetic(s.charAt(low)) &&   !Character.isDigit(s.charAt(low))) {
                low++;
            }
            if (!Character.isAlphabetic(s.charAt(high)) &&  !Character.isDigit(s.charAt(high))) {
                high--;
            }
            char losCh= s.charAt(low);
            char highCh = s.charAt(high);
            if ((Character.isAlphabetic(losCh) || Character.isDigit(losCh)) &&
                    (Character.isDigit(highCh) || Character.isAlphabetic(highCh))) {

                if (!(losCh + "").equalsIgnoreCase(highCh + "")) {
                    result = false;
                    break;
                }
                low++;
                high--;
            }
        }
        return result;
    }
}