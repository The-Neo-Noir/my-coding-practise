package com.aneonoir.dsalgo.practise.strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * link: https://app.codesignal.com/arcade/code-arcade/book-market/MX94DWTrwQw2gLrTi
 */
public class HTMLEndTag {
    @Test
    public void test() {
        String s = htmlEndTagByStartTag("<i>");
        assertEquals("</i>", s);
        assertEquals("</i>", htmlEndTagByStartTag("<i button=\"test\" "));

    }

    String htmlEndTagByStartTag(String startTag) {
        StringBuffer sb = new StringBuffer();
        sb.append("</");
        int endIndex=startTag.length();
        String substring ="";
        if(startTag.contains(" ")){
             endIndex = startTag.indexOf(" ");
             substring=startTag.substring(1, endIndex)+">";
        }else{
            substring = startTag.substring(1, endIndex);
        }
        sb.append(substring);
        return sb.toString();
    }

}
