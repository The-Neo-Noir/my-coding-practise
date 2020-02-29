package com.aneonoir.dsalgo.practise.greedy;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

/**
 * link: https://leetcode.com/problems/group-the-people-given-the-group-size-they-belong-to/
 *
 *
 * struggle: could not be able to group the right way .
 *
 *
 * tag: greedy, interivew, medium, struggle.
 *
 * TODO: can you do it faster ?
 */
public class GroupThePeopleGivenTheGroupSizeTheyBelongTo {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        TreeMap<Integer, List<Integer>> map = new TreeMap<>();
        for (int i = 0; i < groupSizes.length; i++) {
            if (map.containsKey(groupSizes[i])) {
                map.get(groupSizes[i]).add(i);
            } else {
                List<Integer> in = new LinkedList<>();
                in.add(i);
                map.put(groupSizes[i], in);
            }
        }
        List<List<Integer>> result = new LinkedList<>();
        for (Integer in : map.keySet()) {
            List<Integer> lists = map.get(in);

            //6 elements
            // 1 items/groups. 5%3=2
            int counter = 0;
            int times = (lists.size() / in) + (lists.size() % in == 0 ? 0 : 1);
            for (int j = 0; j < times; j++) {
                List<Integer> resulstAdd = new LinkedList<>();
                for (int i = 0; i < in && counter < lists.size(); i++) {
                    resulstAdd.add(lists.get(counter));
                    counter++;
                }
                result.add(resulstAdd);
            }
        }
        return result;
    }
}