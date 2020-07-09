package com.aneonoir.dsalgo.practise;

import java.util.Arrays;
import java.util.Scanner;

public class Sd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int next = sc.nextInt();
        int counter=0;
        Wrap[] wraps = new Wrap[next];

        while(next-- >0){
            wraps[counter] = new Wrap(counter+1, sc.nextInt());
            counter++;
        }
        Arrays.sort(wraps);
        for (Wrap wrap : wraps) {
            System.out.print(wrap.index+" ");
        }
    }

   static  class Wrap implements Comparable<Wrap> {

        int index;
        int number;

        Wrap(int index, int number){
            this.index=index;
            this.number = number;

        }
        @Override
        public int compareTo(Wrap o) {
           return this.number-o.number;
        }
    }
}
