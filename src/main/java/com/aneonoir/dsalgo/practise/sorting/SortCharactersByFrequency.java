package com.aneonoir.dsalgo.practise.sorting;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * link: https://leetcode.com/problems/sort-characters-by-frequency/
 *
 *
 * tag: sorting, comparable,
 *
 * todo: can you do better  ?
 * Runtime: 18 ms, faster than 60.10% of Java online submissions for Sort Characters By Frequency.
 *
 *
 *
 */
public class SortCharactersByFrequency {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map= new HashMap<>();
        for(Character c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        TreeMap<Score,Integer> sn= new TreeMap<>();
        for(Character sc : map.keySet()){
            sn.put(new Score(map.get(sc),sc+""),map.get(sc));
        }
        StringBuffer sb= new StringBuffer();
        for(Score core: sn.keySet()){
            for(int i=0;i<core.weight;i++){
                sb.append(core.letter);
            }
        }
        return sb.toString();

    }
    class Score implements Comparable<Score>{
        int weight;
        String letter;

        Score(int weight, String letter){
            this.weight=weight;
            this.letter= letter;
        }

        public int compareTo(Score that ){
            if(this.weight==that.weight){
                return this.letter.compareTo(that.letter);
            }else{
                return that.weight-this.weight;
            }
        }
        public boolean equals(Object obj){
            if(obj==null){
                return false;
            }else{
                if(obj instanceof Score){
                    Score s= (Score) obj;
                    if(s.weight==this.weight){
                        return s.letter.equals(this.letter);
                    }else{
                        return false;
                    }
                }else return false;
            }
        }
        public int hashCode(){
            return ( this.weight*31 ) +this.letter.hashCode();
        }
    }
}