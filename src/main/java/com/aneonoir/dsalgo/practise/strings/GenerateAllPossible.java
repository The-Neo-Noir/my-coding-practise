package com.aneonoir.dsalgo.practise.strings;

import java.util.LinkedList;
import java.util.List;

/**
 * link: https://leetcode.com/problems/decode-ways/
 *  here the decode ways finds, how many , but in this question, we want to generate
 */
public class GenerateAllPossible {


    public static void main(String asdf[]){
        String input = "226";
        List<String> list = new LinkedList<>();

        captureALl("",input,list);
    }

    private static void captureALl(String s, String input, List<String> list) {

        captureALl("", input, list);

    }
}

//22: 2,2
//    22
//224:
//2 2 4
//2 24
//22 4


