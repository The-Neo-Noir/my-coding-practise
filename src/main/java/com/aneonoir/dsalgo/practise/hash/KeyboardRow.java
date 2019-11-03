package com.aneonoir.dsalgo.practise.hash;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * link: https://leetcode.com/problems/keyboard-row/
 * apporach: pretty bruteforce using hashset
 *
 */
public class KeyboardRow {
    public String[] findWords(String[] words) {
        HashSet<String> firstRow= new HashSet<>();
        HashSet<String> secondRow= new HashSet<>();
        HashSet<String> thirdRow= new HashSet<>();

        firstRow.add("a");
        String firstRowStr="qwertyuiop";
        String secondRowStr="asdfghjkl";

        String thirdRowStr="zxcvbnm";

        for(int i=0;i<firstRowStr.length();i++){
            firstRow.add(firstRowStr.charAt(i)+"");
        }
        for(int i=0;i<secondRowStr.length();i++){
            secondRow.add(secondRowStr.charAt(i)+"");
        }
        for(int i=0;i<thirdRowStr.length();i++){
            thirdRow.add(thirdRowStr.charAt(i)+"");
        }

        List<String> st = new LinkedList<>();
        for(int i=0;i<words.length;i++){
            String word=words[i];
            String firstCharacter=word.charAt(0)+"";
            HashSet<String> lookup=null;
            if(firstRow.contains(firstCharacter.toLowerCase())){
                lookup=firstRow;
            }
            if(secondRow.contains(firstCharacter.toLowerCase())){
                lookup=secondRow;
            }
            if(thirdRow.contains(firstCharacter.toLowerCase())){
                lookup=thirdRow;
            }

            boolean isFound=true;
            for(int j=1;j<word.length();j++){
                isFound&=lookup.contains((word.charAt(j)+"").toLowerCase());
            }
            if(isFound){
                st.add(word);
            }

        }
        return st.toArray(new String[st.size()]);
    }
}