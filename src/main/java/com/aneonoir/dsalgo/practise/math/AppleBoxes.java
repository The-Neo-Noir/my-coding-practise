package com.aneonoir.dsalgo.practise.math;

/**
 * link: https://app.codesignal.com/arcade/code-arcade/loop-tunnel/scG8AFsPuqQGx8Qjf
 */
public class AppleBoxes {
    int appleBoxes(int k) {
        int redApples=0;
        int yellowApples=0;
        for(int i=1;i<=k;i++){
            if(i%2==0){
                redApples=redApples+(i*i);
            }else{
                yellowApples=yellowApples+(i*i);
            }
        }
        return redApples-yellowApples;
    }
}
