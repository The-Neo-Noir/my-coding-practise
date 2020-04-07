package com.aneonoir.dsalgo.practise.graph;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * link: https://practice.geeksforgeeks.org/problems/print-adjacency-list/1
 * <p>
 *
 * : I started my own implementation , but realized the input is already doing it. so
 * I just had to print it.
 * tag: easy, warm up , struggle.
 */
public class PrintAdjacencyList {

    static void printAdjacencyList(ArrayList<ArrayList<Integer>> list, int v) {
        Graph g = new Graph(v);
        for (int i = 0; i < list.size() - 1; i++) {
            StringBuffer sb = new StringBuffer();
            ArrayList<Integer> lis = list.get(i);
            if (lis.size() == 0) {
                sb.append(i);
            } else {
                sb.append(i + "-> ");
                for (int j = 0; j < lis.size(); j++) {
                    if (j != lis.size() - 1)
                        sb.append(lis.get(j)).append("-> ");
                    else
                        sb.append(lis.get(j));
                }
            }
            System.out.println(sb.toString());

        }
        //  g.print();
    }

}

class Graph {
    LinkedList<Integer> list[] = null;

    Graph(int vertexes) {
        list = new LinkedList[vertexes];
    }

    void add(int source, int target) {
        if (list[source] == null) {
            LinkedList<Integer> in = new LinkedList<>();
            in.add(target);
            list[source] = in;
            add(target, source);
        } else {
            LinkedList<Integer> in = list[source];
            if (!in.contains(target)) {
                in.add(target);
                add(target, source);
            }

        }
    }

    void print() {
        for (int j = 0; j < list.length; j++) {
            System.out.print(j + "-> ");
            LinkedList<Integer> in = list[j];
            if (in != null) {
                for (int i = 0; i < in.size(); i++) {
                    if (i == in.size() - 1)
                        System.out.println(in.get(i));
                    else
                        System.out.print(in.get(i) + "-> ");
                }
            }

        }
    }

}
