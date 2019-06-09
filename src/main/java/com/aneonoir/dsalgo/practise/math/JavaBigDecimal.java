package com.aneonoir.dsalgo.practise.math;

import java.math.BigDecimal;

/**
 * link: https://www.hackerrank.com/challenges/java-bigdecimal/problem
 */
class JavaBigDecimal implements Comparable<JavaBigDecimal> {
    int index;
    BigDecimal value;
    String inputKey;

    public JavaBigDecimal(int index, BigDecimal value, String inputKey) {
        this.index = index;
        this.value = value;
        this.inputKey = inputKey;
    }

    public int compareTo(JavaBigDecimal obj) {
        return this.value.compareTo(obj.value);
    }
   /* List<JavaBigDecimal> al = new ArrayList();
        for(int i=0;i<n;i++){
        al.add(new X(i,new BigDecimal(s[i]),s[i]));
        //al.put(new BigDecimal(s[i]),s[i]);
    }

        Collections.sort(al,Collections.reverseOrder());
        for(int i=0;i<n;i++){
        s[i]=al.get(i).inputKey;
    }*/


}
