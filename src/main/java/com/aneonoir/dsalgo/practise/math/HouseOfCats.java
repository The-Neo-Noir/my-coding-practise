package com.aneonoir.dsalgo.practise.math;

import java.util.ArrayList;

/**
 * link: https://app.codesignal.com/arcade/code-arcade/well-of-integration/RaWLwT2eb96hp4N5Z/comments
 *
 * Struggle:  is this greedy ?
 *
 */
public class HouseOfCats {

    int[] houseOfCats(int legs) {
        int peopleNumber = 0;

        ArrayList<Integer> al = new ArrayList<>();
        while (peopleNumber * 2 <= legs) {
            if (((legs - (2 * peopleNumber)) % 4) == 0) {
                al.add(peopleNumber);
            }
            peopleNumber++;
        }
        int arry[] = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            arry[i] = al.get(i);
        }
        return arry;
    }


}
