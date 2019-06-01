package com.aneonoir.dsalgo.practise.hash;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertTrue;

/**
 * link: https://leetcode.com/problems/ransom-note/submissions/
 *
 * TODO: still slow;
 */
public class RansomNote {

    @Test
    public void test() {
        assertTrue(canConstruct("aa", "aab"));
    }
        public boolean canConstruct(String ransomNote, String magazine) {
            HashMap<Character,Integer> magazineMap= new HashMap<>();
            for(int i=0;i<magazine.length();i++){
                if(magazineMap.containsKey(magazine.charAt(i))){
                    magazineMap.put(magazine.charAt(i),magazineMap.get(magazine.charAt(i))+1);
                }else{
                    magazineMap.put(magazine.charAt(i),1);
                }
            }
            HashMap<Character, Integer> ransomNoteMap = new HashMap<>();
            for(int i=0;i<ransomNote.length();i++){
                if(ransomNoteMap.containsKey(ransomNote.charAt(i))){
                    ransomNoteMap.put(ransomNote.charAt(i),ransomNoteMap.get(ransomNote.charAt(i))+1);
                }else{
                    ransomNoteMap.put(ransomNote.charAt(i),1);
                }
            }
            boolean result=true;
            for(int i=0;i<ransomNote.length();i++){
                if(magazineMap.containsKey(ransomNote.charAt(i)) ){
                    if(magazineMap.get(ransomNote.charAt(i))<ransomNoteMap.get(ransomNote.charAt(i))){
                        result=false;
                        break;
                    }

                }else{
                    result=false;
                    break;
                }
            }
            return result;
        }
}
