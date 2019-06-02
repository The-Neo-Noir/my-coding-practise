package com.aneonoir.dsalgo.practise.strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * link:
 *
 */
public class LineEncoding {

    @Test
    public void test() {
        assertEquals("2a3b2c", lineEncoding("aabbbcc"));
        assertEquals("2a3bc", lineEncoding("aabbbc"));
    }
    String lineEncoding(String s) {
        //"aabbbcc";
        StringBuffer sb= new StringBuffer();
        int i=0;
        while (i < s.length()) {
            char current = s.charAt(i);
            int count=0;
            int pointer=i;
            while( pointer<s.length()){
                if(current==s.charAt(pointer)){
                    count++;
                }else{
                    break;
                }
                pointer++;
            }
            i=pointer;
            if(count==1){
                sb.append(""+current);
            }else{
                sb.append(count+""+current);
            }

        }
        return sb.toString();
    }

}
