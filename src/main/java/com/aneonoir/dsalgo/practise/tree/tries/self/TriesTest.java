package com.aneonoir.dsalgo.practise.tree.tries.self;

import org.junit.Test;

import java.util.*;

public class TriesTest {

    @Test
    public void testInsert() {
        Tries t = new Tries();
        t.insert("abhiram");
        t.insert("avi");
        t.search("a");
        LinkedHashMap<Character,Integer> mappattern = new LinkedHashMap<>();
        Collection<Integer> values = mappattern.values();

    }

}
