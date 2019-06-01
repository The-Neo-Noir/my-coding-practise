package com.aneonoir.dsalgo.practise.array;

import java.util.ArrayList;

/**
 * link: https://app.codesignal.com/arcade/code-arcade/sorting-outpost/D6qmdBL2NYz49XHwM
 * <p>
 * Struggle: none,
 * follow up : can you solve it without using additional space like list
 * TODO:
 */
public class SortByHeight {

    int[] sortByHeight(int[] a) {

        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] != -1) {
                al.add(a[i]);
            }
        }
        al.sort((o1, o2) -> o1.compareTo(o2));
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != -1) {
                a[i] = al.get(counter);
                counter++;
            }
        }
        return a;
    }

}
