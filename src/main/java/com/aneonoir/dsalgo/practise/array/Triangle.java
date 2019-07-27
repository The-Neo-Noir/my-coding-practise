package com.aneonoir.dsalgo.practise.array;

import java.util.Collections;
import java.util.List;

public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int sum = 0;
        for (List<Integer> list : triangle) {
//            0->0
//            1->01;
//            2->01;0
//            2->12;1
//            3->01 0;
//            3->012 1;
//            3->123 2


            Collections.sort(list);
            sum += list.get(0);
        }
        return sum;
    }
}