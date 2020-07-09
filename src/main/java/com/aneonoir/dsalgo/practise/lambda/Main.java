package com.aneonoir.dsalgo.practise.lambda;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> map = new HashMap<>();
        int t=sc.nextInt();
        while(t-->0){
            int x=  sc.nextInt();
            map.put(x,map.getOrDefault(x,0)+1);
        }
        TreeMap<Pair,Integer> maps = new TreeMap<>();
        for(Integer in: map.keySet()){
            maps.put(new Pair(in, map.get(in)), in);
        }
        for(Pair pa: maps.keySet()){
            System.out.print(pa.num);
        }
    }
}
class Pair implements Comparable<Pair>{
    int num;
    int freq;
    Pair(int num, int freq){
        this.num=num;
        this.freq=freq;
    }
    public int compareTo(Pair pair){
        if(this.freq==pair.freq){
            return this.num-pair.num;
        }else{
            return this.freq-pair.freq;
        }
    }
}