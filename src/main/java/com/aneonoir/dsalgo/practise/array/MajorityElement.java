package com.aneonoir.dsalgo.practise.array;

import java.util.HashMap;
import java.util.Scanner;

/**
 * link: https://practice.geeksforgeeks.org/problems/majority-element/0/
 * <p>
 * // approach : I did it in appraoch 1: , but improved it ?
 * <p>
 * todo: see if there is any better way, I used an additional space. Boyer Moore's voting algorithm
 * <p>
 * <p>
 * tag: interview, hash, array
 */
public class MajorityElement {

    //** approach 2, but still did  not help
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            HashMap<Integer, Integer> map = new HashMap<>();
            int check = n / 2;
            int result = -1;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (map.containsKey(x)) {
                    int val = map.get(x) + 1;
                    if (val > check) {
                        result = x;
                        break;
                    }
                    map.put(x, val);
                } else {
                    map.put(x, 1);
                }
            }
            System.out.println(result);
        }
    }
    /** approach 1
     public static void main (String[] args)
     {
     Scanner sc= new Scanner(System.in);
     int t= sc.nextInt();
     while(t-->0){
     int n= sc.nextInt();
     HashMap<Integer,Integer> map = new HashMap<>();
     for(int i=0;i<n;i++){
     int x=sc.nextInt();
     map.put(x,map.getOrDefault(x,0)+1);
     }
     int check= n/2;
     boolean printed=false;
     for(Integer in : map.keySet()){
     if(map.get(in)>check){
     printed=true;
     System.out.println(in);
     }
     }
     if(!printed)
     System.out.println(-1);
     }
     }
     **/
}