package com.aneonoir.dsalgo.practise.tree;

import java.util.HashMap;

/**
 * link: https://practice.geeksforgeeks.org/problems/number-of-root-to-leaf-paths/1
 *
 * todo: can you do it without recursion ?
 *
 * tag: easy , interview, gfg
 */
public class NumberOfRootToLeafPaths {
    void countPaths(Node root)
    {
        HashMap<Integer,Integer> isn=new HashMap<>();
        printLengthCount(root,1,isn);
        for(Integer key: isn.keySet()){
            System.out.print(key+" "+isn.get(key)+" $");
        }

    }
    void printLengthCount(Node root,int length,HashMap<Integer,Integer> map){
        if(root!=null){
            if(root.left==null && root.right==null){
                map.put(length,map.getOrDefault(length,0)+1);
            }
            printLengthCount(root.left,length+1,map);
            printLengthCount(root.right,length+1,map);
        }
    }
}
