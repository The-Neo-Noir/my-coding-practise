package com.aneonoir.dsalgo.practise.tree.tries;

import java.util.HashMap;
import java.util.Map;

/**
 * link: https://leetcode.com/problems/implement-trie-prefix-tree/submissions/
 * <p>
 * todo: practise again, I believe I need to review it for performance.
 * <p>
 * Runtime: 46 ms, faster than 18.42% of Java online submissions for Implement Trie (Prefix Tree).
 * <p>
 * tag: trie,string, word seach,contact list.
 */
public class ImplementTrie {
    class TrieNode {
        Map<Character, TrieNode> nodes = new HashMap<>();
        boolean isEnd;
    }

    private TrieNode root;

    /**
     * Initialize your data structure here.
     */
    public ImplementTrie() {
        root = new TrieNode();
    }

    /**
     * Inserts a word into the trie.
     */
    public void insert(String word) {
        TrieNode n = root;
        for (Character ch : word.toCharArray()) {
            if (n.nodes.containsKey(ch)) {
                n = n.nodes.get(ch);
            } else {
                TrieNode node = new TrieNode();
                n.nodes.put(ch, node);
                n = node;
            }
        }
        n.isEnd = true;
    }

    public boolean search(String word) {
        TrieNode node = root;
        int index = 0;
        while (index <= word.length() - 1) {
            if (node.nodes.containsKey(word.charAt(index))) {
                node = node.nodes.get(word.charAt(index));
            } else {
                break;
            }
            index++;
        }
        if (node.isEnd == true && index == word.length()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     */
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        int index = 0;
        while (index <= prefix.length() - 1) {
            if (node.nodes.containsKey(prefix.charAt(index))) {
                node = node.nodes.get(prefix.charAt(index));
            } else {
                break;
            }
            index++;
        }
        if (index == prefix.length()) {
            return true;
        } else {
            return false;
        }
    }
}