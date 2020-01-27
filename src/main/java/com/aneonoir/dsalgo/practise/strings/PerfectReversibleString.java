package com.aneonoir.dsalgo.practise.strings;

import java.util.HashMap;
import java.util.Scanner;

/**
 * link: https://practice.geeksforgeeks.org/problems/perfect-reversible-string/0
 *
 * approach : I have seen similar question, for even number of characters in a string check if all occurance is even , for odd number of characters
 * in string check if all but one is odd number.
 *
 *
 * tag: easy, interview,
 *
 *
 */
public class PerfectReversibleString {
        public static void main (String[] args)
        {
            Scanner sc= new Scanner(System.in);
            int t= sc.nextInt();
            while(t-->0){
                int count=sc.nextInt();
                String s= sc.next();
                HashMap<Character, Integer> map = new HashMap<>();
                for(Character ch: s.toCharArray()){
                    map.put(ch,map.getOrDefault(ch,0)+1);
                }
                if(count%2==0){
                    // all characters must be  even
                    int counter=0;
                    for(Character ch: map.keySet()){
                        if(map.get(ch)%2==0){
                            counter++;
                        }
                    }
                    if(counter==map.size()) {
                        System.out.println("1");
                    }else{
                        System.out.println("0");
                    }
                }else{
                    int counter=0;
                    for(Character ch: map.keySet()){
                        if(map.get(ch)%2==0){
                            counter++;
                        }
                    }
                    if(counter==map.size()-1) {
                        System.out.println("1");
                    }else{
                        System.out.println("0");
                    }
                }
            }
        }
    }
}