package com.aneonoir.dsalgo.practise.strings;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class KnowYourLibraryString {

    @Test
    public  void test() {
        assertTrue("stin".endsWith("in"));
    }

    public void test2(){
        "bluesd".startsWith("blue");
    }
    public void subString(){
        // out of bounds do occur
        "ab".substring(0,3);// outofbound
        "ab".substring(1,1);// out put ""; with same startindex and endindex
        "hi".substring(2,"hi".length()); // output "" , no outofbounds how ?
        "h".substring(0,2); //out of bounds

    }

    @Test
    public void indexOf(){

        assertEquals(-1,"ab".indexOf("bc"));
        String replace = "ab".replace("a", "b");
        assertEquals("bb",replace);
    }

}
