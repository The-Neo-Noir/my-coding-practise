package com.aneonoir.dsalgo.practise.tree.heap;

import java.util.PriorityQueue;

public class LastStoneWeight {
    public static void main(String[] args) {
        LastStoneWeight lastStoneWeight = new LastStoneWeight();
        int i = lastStoneWeight.lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1});
        //int ij = lastStoneWeight.lastStoneWeight(new int[]{3, 7, 4, 1, 7});
        System.out.println(i);
    }
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> o2.compareTo(o1));
        for(Integer in : stones){
            pq.add(in);
        }
        while(pq.size()>1){
            Integer poll = pq.poll();
            if (poll == pq.peek()) {
                pq.remove();
            }else{
                pq.add(poll-pq.peek());
                pq.remove();
            }
        }
        Integer in= pq.poll();
        if(in==null) return 0;
        else return in;
    }
}
