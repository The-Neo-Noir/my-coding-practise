package com.aneonoir.dsalgo.practise.hash;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * link: https://leetcode.com/problems/uncommon-words-from-two-sentences/submissions/
 * <p>
 * <p>
 * Solve it using a hashmap, with approach , if the item appears more than once then reject ie exctly one then accept.
 * <p>
 * Slow , how can you make it fast  ? The answer is
 * **str.split("\s") is 80% slower than str.split(" ");**
 * <p>
 * note: instead of writing
 * ```
 * String [] s= new String[list.size()];
 * list.toArray(s);
 * return s;
 * ```
 * <p>
 * write like
 * return ans.toArray(new String[ans.size()]);
 * <p>
 * Do you know you can use
 * map.put(word, count.getOrDefault(word, 0) + 1);
 * instead of
 * <p>
 * for(int i=0;i<target.length;i++ ){
 * if(map.containsKey(target[i])){
 * map.put(target[i],map.get(target[i])+1);
 * }else{
 * map.put(target[i],1);
 * }
 * }
 * <p>
 * <p>
 * NOte: don't do like   String source[]=A.split("\\s+"); and then iterating
 * use  for (String word: A.split(" "))
 * Now let use this and improve the code. but the performance is still low.
 * Runtime: 5 ms, faster than 21.75% of Java online submissions for Uncommon Words from Two Sentences.
 * <p>
 * Try again with further
 */
public class UncommonWordsFromTwoSentences {


    public String[] uncommonFromSentences(String A, String B) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String word : (A + " " + B).split(" ")) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        List<String> list = new LinkedList<>();
        map.forEach((s, integer) -> {
                    if (integer == 0) {
                        list.add(s);
                    }
                }
        );

        return list.toArray(new String[list.size()]);
    }
}
