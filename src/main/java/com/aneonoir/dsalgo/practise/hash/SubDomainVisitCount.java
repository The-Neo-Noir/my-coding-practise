package com.aneonoir.dsalgo.practise.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * link: https://leetcode.com/problems/subdomain-visit-count/
 * <p>
 * approach : a bruteforce one using hashMap , can you do better , TODO:
 */
public class SubDomainVisitCount {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < cpdomains.length; i++) {
            String[] parts = cpdomains[i].split("\\s+");
            List<String> result = decodeDomains(parts[1]);
            for (int j = 0; j < result.size(); j++) {
                System.out.println("number");
                if (hashMap.containsKey(result.get(j))) {
                    System.out.println("sf");
                    hashMap.put(result.get(j), hashMap.get(result.get(j)) + Integer.valueOf(parts[0]));
                } else {
                    hashMap.put(result.get(j), Integer.valueOf(parts[0]));
                }
            }
        }
        List<String> result = new ArrayList<>();
        for (String key : hashMap.keySet()) {
            result.add(hashMap.get(key) + " " + key);
        }
        return result;
    }

    public List<String> decodeDomains(String domainName) {
        List<String> result = new ArrayList<>();

        int lastFromIndex = 0;
        while (true) {
            int i = domainName.indexOf(".", lastFromIndex);
            lastFromIndex = i + 1;
            result.add(domainName.substring(i + 1));
            if (i == -1) {
                break;
            }
        }
        return result;
    }


}
