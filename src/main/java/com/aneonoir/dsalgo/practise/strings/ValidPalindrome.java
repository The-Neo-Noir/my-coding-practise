package com.aneonoir.dsalgo.practise.strings;

/**
 * link: https://leetcode.com/problems/valid-palindrome/
 *
 * TODO:
 * approach: two pointer technique:
 */
public class ValidPalindrome {

    public boolean isPalindrome(String s) {

        String s1 = "A man, a plan, a canal: Panama";
        int ltr=0;
        int rtl=s.length()-1;

        while(ltr<rtl){
            if(!Character.isAlphabetic(ltr)){
                ltr++;
            }
            if(!Character.isAlphabetic(rtl)){
                rtl--;
            }

        }

        return false;
    }
}
