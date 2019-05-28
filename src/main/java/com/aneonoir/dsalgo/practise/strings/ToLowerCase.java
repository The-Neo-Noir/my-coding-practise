package com.aneonoir.dsalgo.practise.strings;

/**
 * link: https://leetcode.com/problems/to-lower-case/submissions/
 *
 *
 */
public class ToLowerCase {
        public String toLowerCase(String str) {
            StringBuffer sb= new StringBuffer();
            for(int i=0;i<str.length();i++){
                if(Character.isUpperCase(str.charAt(i))){
                    sb.append(Character.toLowerCase(str.charAt(i)));
                }else{
                    sb.append(""+str.charAt(i));
                }
            }
            return sb.toString();
        }
}
