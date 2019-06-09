package com.aneonoir.dsalgo.practise.stack;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 */
public class MaximumElement {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        ArrayDeque st = new ArrayDeque();
        int N = sc.nextInt();
        int currentMax = 0;
        for (int i = 0; i <= N; i++) {
            String comand = sc.nextLine();
            String commandString[] = comand.split("\\s");
            switch (commandString[0]) {
                case "1":
                    st.push(commandString[1]);

                    break;
                case "2":
                    st.pop();
                    currentMax = 0;
                    break;
                case "3":
                    Iterator<String> itr = st.iterator();
                    while (itr.hasNext()) {
                        int val = Integer.valueOf(itr.next());
                        if (val >= currentMax) {
                            currentMax = val;
                        }
                    }
                    System.out.println(currentMax);
                    break;
                default:
            }
        }
    }
}