package com.aneonoir.dsalgo.practise.array;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * link: https://app.codesignal.com/challenge/SCgGQZE8ogJDTKmDp
 *
 */
public class RemoveDup {
    int[] deDup(int[] a) {

        Set<Integer> s= new LinkedHashSet<>();
        for(int i=0;i<a.length;i++){
            s.add(a[i]);
        }
        int [ ] result= new int[s.size()];
        Iterator<Integer> itr=s.iterator();
        int counter=0;
        while(itr.hasNext()){
            result[counter++]=itr.next().intValue();
        }
        return result;
    }

}
