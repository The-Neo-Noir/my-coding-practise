package com.aneonoir.dsalgo.practise.array;

import java.util.Scanner;

/**
 * approach: used counting sort, but the TLE;
 *
 *
 * todo: can you do it using two pointer approach.
 *
 * tag: interview, counting sort, array, easy.
 */
public class SegregateOnesAndZeros {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n= sc.nextInt();
            int arr[] = new int[n];
            int c[] =new int[2];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i]==0){
                    c[0]=c[0]+1;
                }else{
                    c[1]=c[1]+1;
                }
            }
            sort(arr,c);
            System.out.println();
        }
    }
    private static void sort(int arr[],int c[]){
        int index=0;
        for(int i=0;i<2;i++){
            int counter=0;
            int tar=c[i];
            while(counter<tar){
                System.out.print(i+" ");
                counter++;
            }
        }
    }
}
