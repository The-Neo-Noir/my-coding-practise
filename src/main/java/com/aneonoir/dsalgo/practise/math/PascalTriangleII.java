package com.aneonoir.dsalgo.practise.math;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * link: https://leetcode.com/problems/pascals-triangle-ii/
 *
 * TODO: can you see how can you optimize,
 *
 * tag: math, interview, optimization .
 *
 *
 */
public class PascalTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list= new LinkedList<>();
        List<Integer> in0= new LinkedList<>();
        in0.add(1);
        list.add(in0);
        if(rowIndex==0){
            return list.get(0);
        }
        List<Integer> in1= new LinkedList<>();
        in1.add(1);
        in1.add(1);
        list.add(in1);
        if(rowIndex==1){
            return list.get(1);
        }
        for(int i=2;i<=rowIndex;i++){
            List<Integer> lastRow=list.get(i-1);
            List<Integer> current= new ArrayList(lastRow.size()+1);
            current.add(1);
            for(int j=1;j<lastRow.size();j++){
                current.add(lastRow.get(j-1)+lastRow.get(j));
            }
            current.add(1);
            list.add(current);
        }
        return list.get(rowIndex);
    }
}