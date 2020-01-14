package com.aneonoir.dsalgo.practise.tree.tries.self;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Tries {
    private TrieNode root = null;

    public Tries() {
        this.root = new TrieNode();

    }

    public void insert(String word) {
        TrieNode traversing = root;
        for (int i = 0; i < word.length(); i++) {
            char key = word.charAt(i);
            Map<Character, TrieNode> childrenMap = traversing.getChildren();
            if (childrenMap.containsKey(key)) {
                traversing = childrenMap.get(key);
            } else {
                TrieNode trieNode = new TrieNode();
                childrenMap.put(key, trieNode);
                traversing = trieNode;
            }
        }
        traversing.setEnd(true);
    }

    public List<String> search(String a) {
        TrieNode tra= root;
        List<String> list = new LinkedList<>();
        for (Character ch : a.toCharArray()) {
//            "mon","monday","mongoose";
//            "mon"
        }

        return null;
    }
}
