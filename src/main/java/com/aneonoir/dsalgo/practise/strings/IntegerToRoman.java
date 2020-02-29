package com.aneonoir.dsalgo.practise.strings;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * link: https://leetcode.com/problems/integer-to-roman/
 *
 * struggle: Remember to check number division.
 *
 *
 * TODO: why is this slow ? need to do it faster
 *
 * related: https://leetcode.com/problems/roman-to-integer/
 * https://leetcode.com/problems/integer-to-english-words/
 *
 * tag: math,string,
 */
public class IntegerToRoman {
    public String intToRoman(int num) {
        StringBuilder sb= new StringBuilder();
        LinkedHashMap<Integer,String> map = new LinkedHashMap<>();
        buildMap(map);
        int last=0;
        for(Integer in:map.keySet()){
            if(in==0){ //I did not see this one coming;
                break;
            }
            int temp=num/in;
            String str="";
            str=buildStr(temp,in,map);

            sb.append(str);
            num=num%in;
        }
        return sb.toString();
    }

    private String buildStr(int remain,int key, Map<Integer,String> map){
        int t=remain;
        StringBuilder sb= new StringBuilder();
        while(t-->0){
            sb.append(map.get(key));
        }
        return sb.toString();
    }
    private void buildMap(LinkedHashMap<Integer,String> map){
        map.put(1000,"M");
        map.put(900,"CM");
        map.put(500,"D");
        map.put(400,"CD");
        map.put(100,"C");
        map.put(90,"XC");
        map.put(50,"L");
        map.put(40,"XL");
        map.put(10,"X");
        map.put(9,"IX");
        map.put(5,"V");
        map.put(4,"IV");
        map.put(1,"I");
        map.put(0,"");

    }
}