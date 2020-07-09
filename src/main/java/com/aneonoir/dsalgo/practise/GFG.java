package com.aneonoir.dsalgo.practise;

import java.util.*;
import java.lang.*;
import java.io.*;

/**
 *
 * This needs
 */
public class GFG
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr []= new int[n];
            int i=0;
            while(n-->0){
                arr[i++]=sc.nextInt();
            }
            int ar[]=  find(arr);
            for(int j=0;j<ar.length;j++){
                System.out.print(ar[j]+" ");
            }
            System.out.println();
        }
    }
    private static int[] find(int [] arr){
        HashMap<Integer,Container> map= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                Container c= map.get(arr[i]);
                c.count= c.count+1;
                c.end=i;
                map.put(arr[i], c);
            }else{
                map.put(arr[i], new Container(1,i,i));
            }
        }

        int max=0;
        Container maxC=null;
        for(Integer in: map.keySet()) {
            if(map.get(in).count > max) {
                max=map.get(in).count;
                maxC=map.get(in);
            }
        }
        boolean duplicateMax=false;
        List<Container> maxA= new ArrayList<>();
        for(Integer in : map.keySet()){
            if(map.get(in).count==max){
                duplicateMax=true;
                maxA.add(map.get(in));
            }
        }
        if(duplicateMax){
            int minB=maxA.get(0).end-maxA.get(0).start;
            Container maxX=null;
            for(Container cn: maxA){
                if(minB>=cn.end-cn.start){
                    minB=cn.end-cn.start;
                    maxX=cn;
                }
            }
            int res[]= new int[maxX.end-maxX.start+1];
            int i=0;
            for(int k=maxX.start;k<=maxX.end; k++){
                res[i++]=arr[k];
            }
            return res;
        }else{
            int res[]= new int[maxC.end-maxC.start+1];
            int i=0;
            for(int k=maxC.start;k<=maxC.end; k++){
                res[i++]=arr[k];
            }
            return res;
        }

    }
    static class Container{
        int count;
        int start;
        int end;
        Container(int count, int start, int end){
            this.count= count;
            this.start=start;
            this.end=end;
        }

    }
}