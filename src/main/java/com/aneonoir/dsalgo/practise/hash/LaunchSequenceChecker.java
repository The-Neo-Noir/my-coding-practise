package com.aneonoir.dsalgo.practise.hash;

import java.util.HashMap;

/**
 * link: https://app.codesignal.com/company-challenges/spacex/EcQD8xYZotKM77FKM
 * <p>
 * approach : a pretty straight forward approach using hashmap.
 * <p>
 * tag: hashmap,
 */
public class LaunchSequenceChecker {
    boolean launchSequenceChecker(String[] systemNames, int[] stepNumbers) {
        int i = 0;
        HashMap<String, Integer> map = new HashMap<>();
        boolean result = true;
        for (String names : systemNames) {
            if (map.containsKey(names)) {
                if (map.get(names) < stepNumbers[i]) {
                    map.put(names, stepNumbers[i]);
                } else {
                    result = false;
                    break;
                }
            } else {
                map.put(names, stepNumbers[i]);
            }
            i++;
        }
        return result;
    }
}
