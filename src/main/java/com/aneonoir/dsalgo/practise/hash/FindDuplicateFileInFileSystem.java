package com.aneonoir.dsalgo.practise.hash;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * link: https://leetcode.com/problems/find-duplicate-file-in-system/
 *
 * approach: pretty bruteforce , use hashmap of the string.
 *
 * tag: hashmap,medium,interivew,struggle
 *
 * TODO: do the follow up questions, performance can be improved.
 */
public class FindDuplicateFileInFileSystem {
    public List<List<String>> findDuplicate(String[] paths) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : paths) {
            String[] files = str.split("\\s+");
            String root = files[0];
            for (int i = 1; i < files.length; i++) {
                File f = new File(files[i]);
                if (map.containsKey(f.data)) {
                    map.get(f.data).add(root + "/" + f.fileName);
                } else {
                    List<String> lst = new LinkedList<>();
                    lst.add(root + "/" + f.fileName);
                    map.put(f.data, lst);
                }
            }
        }
        List<List<String>> rsult = new LinkedList<>();
        for (String keys : map.keySet()) {
            if (map.get(keys).size() > 1) {
                rsult.add(map.get(keys));
            }

        }
        return rsult;
    }


    class File {
        String data;
        String fileName;

        File(String content) {
            fileName = content.substring(0, content.indexOf("("));
            data = content.substring(content.indexOf("("), content.indexOf(")"));
        }

    }
}