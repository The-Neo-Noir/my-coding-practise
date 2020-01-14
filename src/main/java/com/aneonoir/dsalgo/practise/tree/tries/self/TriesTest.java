package com.aneonoir.dsalgo.practise.tree.tries.self;

import org.junit.Test;

public class TriesTest {

    @Test
    public void testInsert() {
        Tries t = new Tries();
        t.insert("abhiram");
        t.insert("avi");
        t.search("a");

    }
}
