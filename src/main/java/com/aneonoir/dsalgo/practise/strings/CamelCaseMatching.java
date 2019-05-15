package com.aneonoir.dsalgo.practise.strings;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.RegularExpression;
import jdk.nashorn.internal.runtime.regexp.joni.Regex;
import org.junit.Test;
import sun.tools.tree.CharExpression;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * link: https://leetcode.com/problems/camelcase-matching/
 *
 * TODO:
 */
public class CamelCaseMatching {

    @Test
    public void test() {
        String input = "Fo";
        DecodeString(input);
    }

    @Test
    public void testPattern(){
        Character a='A';
        assertTrue(isUpperCase(a));
        assertFalse(isUpperCase('b'));

    }

    private void DecodeString(String input) {

        for (int  i= 0; i <input.length() ; i++) {
            StringBuffer sb = new StringBuffer();
            sb.append(input.charAt(i));
            int runningIndex=i+1;
            while(i+1<input.length()-1){
                if(isUpperCase(input.charAt(i+1)))
                    break;
                else{
                    runningIndex++;
                }
            }
            sb.append(input.substring(i + 1, runningIndex));
        }


    }

    private boolean isUpperCase(Character character) {
        String pattern="[A-Z]";
        return (character + "").matches(pattern);
    }
}
