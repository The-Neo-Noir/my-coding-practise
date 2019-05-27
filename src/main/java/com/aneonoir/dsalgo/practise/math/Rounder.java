package com.aneonoir.dsalgo.practise.math;

/**
 * link: https://app.codesignal.com/arcade/code-arcade/loop-tunnel/H5PP5MXvYvWXxTytH
 *
 *TODO: Refactor
 *
 */
public class Rounder {

    int rounders(int n) {
        int counter=1;
        int length=(n+"").length();
        while(counter<length){
            int remainder=n% (int) Math.pow(10,counter);
            remainder=remainder/((int)Math.pow(10,counter)/10);
            if(remainder>=5){
                n=((n/(int)Math.pow(10,counter))*(int)Math.pow(10,counter))+(int)Math.pow(10,counter);
            }else{
                n=((n/(int)Math.pow(10,counter))*(int)Math.pow(10,counter));
            }
            counter++;
        }

        return n;
    }


}
