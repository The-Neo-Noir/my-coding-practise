package com.aneonoir.dsalgo.practise.stack;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

/**
 * link: https://www.hackerrank.com/challenges/equal-stacks/problem
 *
 * TODO: any there any better way solving it?
 *
 * tag: stack, interview, must-do
 */
public class Solution {

    /*
     * Complete the equalStacks function below.
     */
    static int equalStacks(int[] h1, int[] h2, int[] h3) {
        Stack<Wrap> st1= new Stack<>();
        Stack<Wrap> st2= new Stack<>();
        Stack<Wrap> st3= new Stack<>();

        polulate(st1,h1);
        polulate(st2,h2);
        polulate(st3,h3);
        int val=0;
        while(!st1.isEmpty() && !st2.isEmpty() && !st2.isEmpty() ){
            Wrap a= st1.peek();
            Wrap b=st2.peek();
            Wrap c=st3.peek();
            if(a.sum==b.sum && b.sum==c.sum){
                val=a.sum;
                break;
            }else{
                Stack<Wrap> biggest= findBiggest(st1,st2,st3);
                biggest.pop();
            }
            if(st1.isEmpty() ||  st2.isEmpty() || st3.isEmpty()){ val=0; break; }
        }
        return val;
    }
    static Stack<Wrap> findBiggest(Stack<Wrap> st1,Stack<Wrap> st2,Stack<Wrap> st3){
        Stack<Wrap> []  s= new Stack[3];
        s[0]=st1;
        s[1]=st2;
        s[2]=st3;
        Stack<Wrap> max= s[0];
        for(int i=1;i<3;i++){
            if(max.peek().sum<s[i].peek().sum){
                max=s[i];
            }
        }
        return max;
    }
    static void polulate(Stack<Wrap> st, int [] h){
        for(int i=h.length-1;i>=0;i--){
            if(st.isEmpty()){
                st.push(new Wrap(h[i],h[i]));
            }else{
                st.push( new Wrap(h[i],st.peek().sum+h[i]));
            }
        }
    }
    static class Wrap{
        int num;
        int sum;
        Wrap(int num, int sum){
            this.num=num;
            this.sum=sum;
        }
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] n1N2N3 = scanner.nextLine().split(" ");

        int n1 = Integer.parseInt(n1N2N3[0].trim());

        int n2 = Integer.parseInt(n1N2N3[1].trim());

        int n3 = Integer.parseInt(n1N2N3[2].trim());

        int[] h1 = new int[n1];

        String[] h1Items = scanner.nextLine().split(" ");

        for (int h1Itr = 0; h1Itr < n1; h1Itr++) {
            int h1Item = Integer.parseInt(h1Items[h1Itr].trim());
            h1[h1Itr] = h1Item;
        }

        int[] h2 = new int[n2];

        String[] h2Items = scanner.nextLine().split(" ");

        for (int h2Itr = 0; h2Itr < n2; h2Itr++) {
            int h2Item = Integer.parseInt(h2Items[h2Itr].trim());
            h2[h2Itr] = h2Item;
        }

        int[] h3 = new int[n3];

        String[] h3Items = scanner.nextLine().split(" ");

        for (int h3Itr = 0; h3Itr < n3; h3Itr++) {
            int h3Item = Integer.parseInt(h3Items[h3Itr].trim());
            h3[h3Itr] = h3Item;
        }

        int result = equalStacks(h1, h2, h3);


    }
}
