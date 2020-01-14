package com.aneonoir.dsalgo.practise.tree.tries.self;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
    private Map<Character, TrieNode> children;
    private boolean isEnd;


    public TrieNode() {
        children = new HashMap<>();
        isEnd = false;
    }

    public boolean getChildren(Character character) {
        return children.containsKey(character);
    }


    public Map<Character, TrieNode> getChildren() {
        return children;
    }


    public boolean isEnd() {
        return isEnd;
    }

    public void setEnd(boolean end) {
        isEnd = end;
    }
}
