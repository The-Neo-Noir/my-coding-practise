package com.aneonoir.dsalgo.practise.tree.heap;

import java.util.HashMap;
import java.util.TreeMap;

public class Reorderstrig {
    public static void main(String[] args) {
        Reorderstrig reorderstrig = new Reorderstrig();
        reorderstrig.reorganizeString("aaabbbccc");
    }
    public String reorganizeString(String S) {
        HashMap<String,Integer> map = new HashMap<>();
        for(Character ch: S.toCharArray()){
            map.put(ch+"", map.getOrDefault(ch+"",0)+1);
        }
        TreeMap<Wrap,Integer> wrap = new TreeMap<>();
        for(String s: map.keySet()){
            wrap.put(new Wrap(map.get(s),s), map.get(s));
        }
        StringBuffer sb= new StringBuffer();
        int limit=wrap.firstKey().occ;
        System.out.println(wrap);

        for(int i=0;i<limit;i++){
            for(Wrap w: wrap.keySet()){
                if(w.occ>0){
                    sb.append(w.str);
                    w.occ=w.occ-1;
                }
            }
        }

        return sb.toString();
    }
}
class Wrap implements Comparable<Wrap>{

    Integer occ;
    String str;
    Wrap( Integer occ, String s){
        this.occ=occ;
        this.str=s;
    }
    public int compareTo(Wrap that){
        if( that.str.compareTo(this.str)==0){
            return 0;
        }else{
            return that.occ.compareTo(this.occ);
        }
    }
    public boolean equals(Object o){
        if(o instanceof Wrap &  o!=null){
            Wrap ob=(Wrap)o;
            return this.str.equals(ob.str);
        }else{
            return false;
        }
    }
    public int hashCode(){
        return str.hashCode();
    }
    public String toString(){
        return "{str:\""+ str+"} {occ:\""+ occ+"}";
    }
}