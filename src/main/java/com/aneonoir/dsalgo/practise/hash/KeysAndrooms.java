package com.aneonoir.dsalgo.practise.hash;

import java.util.*;

/**
 * link: https://leetcode.com/problems/keys-and-rooms/
 *
 * TODO: Can you do it dfs way , recursively ?
 *
 * tag: bfs,queue,hashmap,hashset,medium, interview
 */
public class KeysAndrooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        HashMap<Integer,Boolean> visits= new HashMap<>();
        for(int i=0;i<rooms.size();i++){
            if(i==0) visits.put(i,true); else visits.put(i,false);
        }
        Queue<Integer> que=new LinkedList<>();
        que.add(0);
        visits(visits,rooms,que);
        boolean result=true;
        for(Integer in: visits.keySet()){
            if( visits.get(in)==false){
                result=false;
                break;
            }

        }
        return result;
    }
    private void visits(HashMap<Integer,Boolean> visits, List<List<Integer>> rooms , Queue<Integer> que ) {
        HashSet<Integer> visitedRooms = new HashSet<>();
        visitedRooms.add(0);
        while (!que.isEmpty()) {
            Integer room = que.remove();
            List<Integer> keys = rooms.get(room);
            for (Integer key : keys) {
                if (!visitedRooms.contains(key)) {
                    que.add(key);
                    visitedRooms.add(key);
                }
                visits.put(key, true);
            }

        }
    }
}
