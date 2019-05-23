package com.aneonoir.dsalgo.practise.math;

/**
 * link: https://app.codesignal.com/challenge/JFQCeSKZpP8pAeHSB
 *
 * TODO: Is there a short way to to it.
 *
 */
public class FirstMultiple {

    int firstMultiple(int[] divisors, int start) {
        int number=start;
        for(int i=start;;i++){
            int counter=0;
            for(int j=0;j<divisors.length;j++){
                if(i%divisors[j]!=0){
                    break;
                }else{
                    counter++;
                }
            }
            if(counter==divisors.length){
                number=i;
                break;
            }else{
                counter=0;
            }
        }
        return number;
    }

}
