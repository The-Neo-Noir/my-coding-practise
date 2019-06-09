package com.aneonoir.dsalgo.practise.linkedlist;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArraylist {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        int numberOfArrayLists = sc.nextInt();
        ArrayList[] al = new ArrayList[numberOfArrayLists];

        for (int count = 0; count < numberOfArrayLists; count++) {
            sc.nextLine();
            int numberOfElements = sc.nextInt();
            al[count] = new ArrayList(numberOfElements);
            for (int eleCount = 0; eleCount < numberOfElements; eleCount++) {
                int temp = sc.nextInt();
                al[count].add(temp);
            }
        }
        // now find queries
        sc.nextLine();
        int numberOfQueries = sc.nextInt();
        for (int counter = 0; counter < numberOfQueries; counter++) {
            sc.nextLine();
            int ithArrayList = sc.nextInt();
            int ithElementInArrayList = sc.nextInt();

            if (ithArrayList > numberOfArrayLists || ithElementInArrayList > al[ithArrayList - 1].size()) {
                System.out.println("ERROR!");
            } else {
                //find the arrayslit
                System.out.println(al[ithArrayList - 1].get(ithElementInArrayList - 1));
            }
        }


    }

}
