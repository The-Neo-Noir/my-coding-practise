package com.aneonoir.dsalgo.practise.recursion.self;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 *
 * tag: recursion
 */
public class ReverseANumber {

    public static void main(String[] args) {
        firstDigit();
        return;
    }

    private static String firstDigit() {
        Pattern pattern=Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher("1234s2222");
        String max="";
        while(matcher.find()){
            String group = matcher.group();
            if (max.length() < group.length()) {
                max=group;
            }
            System.out.println(max);
        }
        if("asdfa".indexOf(max)!=0){
            return "";
        }else{
            return max;
        }
    }
}
