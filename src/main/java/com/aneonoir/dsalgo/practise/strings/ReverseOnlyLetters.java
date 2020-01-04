package com.aneonoir.dsalgo.practise.strings;

/**
 * link: https://leetcode.com/problems/reverse-only-letters/submissions/
 *
 * approach: two pointer appraoch:
 *
 * NOte : silly mistake, low <= high, this will have ill effect , dry run and find out why,you must dry run it again, don't skip it
 *
 * todo:
 * 1. its kind of slow, can you make it faster, Runtime: 1 ms, faster than 47.23% of Java online submissions for Reverse Only Letters.
 * 2. can you do it  recursively.
 *
 * tag: interview, string, two pointer
 */
public class ReverseOnlyLetters {


    public String reverseOnlyLetters(String S) {
        if(S!=null){
            int low=0;
            int high=S.length()-1;
            char [] chars= S.toCharArray();
            while(low<high){
                if(!Character.isAlphabetic(chars[low])){
                    low++;
                }
                if(!Character.isAlphabetic(chars[high])){
                    high--;
                }
                if(Character.isAlphabetic(chars[low]) &&
                        Character.isAlphabetic(chars[high])){
                    char temp=chars[low];
                    chars[low]=chars[high];
                    chars[high]=temp;
                    low++;high--;
                }

            }
            return new String(chars);
        }else{
            return "";
        }
    }
}
