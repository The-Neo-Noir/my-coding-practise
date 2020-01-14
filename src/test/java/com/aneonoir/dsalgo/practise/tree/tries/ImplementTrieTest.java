package com.aneonoir.dsalgo.practise.tree.tries;

import org.junit.Test;

import static org.junit.Assert.*;

public class ImplementTrieTest {

    @Test
    public void insert() {

        ImplementTrie implementTrie = new ImplementTrie();
        implementTrie.insert("app");
        implementTrie.insert("apple");
        boolean a = implementTrie.search("a");
        assertEquals(false, a);

        boolean ap = implementTrie.search("ap");
        assertEquals(false, ap);

        boolean sa = implementTrie.search("app");
        assertEquals(true, sa);

        boolean sa2 = implementTrie.search("apple");
        assertEquals(true, sa2);

    }
}