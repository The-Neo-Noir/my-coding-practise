package com.aneonoir.dsalgo.practise.tree.heap;

import java.util.HashMap;

public class RearrangeString {

    public static void main(String[] args) {
        RearrangeString rearrangeString = new RearrangeString();
        String aaab = rearrangeString.reorganizeString("aabbccddeeaa");
        System.out.println(aaab);

    }
    public String reorganizeString(String S) {
        HashMap<String, Integer> map = new HashMap<>();
        for (Character ch : S.toCharArray()) {
            map.put(ch + "", map.getOrDefault(ch + "", 0) + 1);
        }
        java.util.PriorityQueue<Wrap> pq = new java.util.PriorityQueue<>();
        int size = 0;
        for (String str : map.keySet()) {
            pq.add(new Wrap(map.get(str), str));
            size += map.get(str);
        }


        Wrap arr[] = new Wrap[pq.size()];
        int i = 0;
        while (!pq.isEmpty()) {
            arr[i++] = pq.poll();
        }
        StringBuffer sb = new StringBuffer();
        //a:2
        //b:2
        for (int k = 0; true; k++) {
            String r = arr[k % arr.length].str;
            if(sb.length()==size){
                break;
            }
            if (map.get(r) > 0) {
                if (sb.length() > 0 && r.equals(sb.toString().charAt(sb.toString().length() - 1)+"")) {
                    return "";
                }
                sb.append(r);
                map.put(r, map.get(r) - 1);
            }
        }

        return sb.toString();
    }
    class Wrap implements Comparable<Wrap> {
        Integer weight;
        String str;

        Wrap(Integer weight, String str) {
            this.weight = weight;
            this.str = str;
        }

        public int compareTo(Wrap that) {
            return that.weight.compareTo(this.weight);
        }
    }


}

