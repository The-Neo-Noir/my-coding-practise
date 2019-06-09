package com.aneonoir.dsalgo.practise.strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Given strings, find the string and replace with another string.
 */
public class FindAndReplace {


    @Test
    public void test() {

        assertEquals("This film is a very good film", findAndReplace("film", "movie", "This film is a very good film"));
    }

    public String findAndReplace(String find, String replace, String source) {
        if (source.contains(find)) {
            StringBuffer sb = new StringBuffer();
            int lastIndex = 0;
            int indexFound = 0;
            while (source.indexOf(find, lastIndex) != -1) {
                indexFound = source.indexOf(find, lastIndex);

                String firstPart = source.substring(lastIndex, indexFound); // todo
                String lastPart = source.substring(indexFound + find.length(), source.length());
                String temp = sb.append(firstPart).append(replace).toString();
                lastIndex = temp.length();
                sb.append(lastPart);
            }
            return sb.toString();

        } else {
            return source;
        }
    }
}
