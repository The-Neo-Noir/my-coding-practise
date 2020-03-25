package com.aneonoir.dsalgo.practise.recursion;

import java.util.Scanner;

/**
 * link: https://practice.geeksforgeeks.org/problems/number-of-paths/0
 *
 *  a topdown approach , recursion.
 *
 *  // TODO is it dynamic programming ?  , did you use memoization  ? can you see if there is an overlapping subproblem ?
 *
 *  // write down the bottom up approach
 *  tag: dynamic proramming ,
 */
public class NumberOfPaths {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int row= sc.nextInt();
            int col= sc.nextInt();
            int mat[][]= new int[row][col];
            System.out.println(call(mat,0,0));
        }
    }
    private static int call(int mat[][],int row, int col ){
        if(row<mat.length && col==mat[row].length-1){
            return 1;
        }
        if(row==mat.length-1 && col<mat[row].length-1){
            return 1;
        }
        if(row==mat.length-1 && col==mat[row].length-1){
            return 0;
        }
        return mat[row][col]=call(mat,row+1,col)+call(mat,row,col+1);
    }
}