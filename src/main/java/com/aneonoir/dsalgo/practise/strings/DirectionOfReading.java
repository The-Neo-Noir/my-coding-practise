package com.aneonoir.dsalgo.practise.strings;

import org.junit.Test;

import java.util.Arrays;

/**
 * link: https://app.codesignal.com/challenge/3GuhySk5idaknKGyY
 */
public class DirectionOfReading {

    @Test
    public void test() {
        directionOfReading(new int[]{1, 3, 5, 9});
    }

    int[] directionOfReading(int[] numbers) {

        //find the maximum element
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        int maxStrLength=("0"+max).length();
        int [] result= new int[maxStrLength];

        String[] tempResult = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            String s="";
            for(int j=0;j<maxStrLength-(numbers[i]+"").length();j++){
                s+="0";
            }
            tempResult[i] = s + numbers[i];
        }
        for (int i = 0; i < maxStrLength; i++) {
            String str="";
            for (int j = 0; j < tempResult[i].length(); j++) {
                str+=tempResult[j].charAt(i);
            }
            result[i] = Integer.parseInt(str);
        }

        return result;
    }

}
