package com.aneonoir.dsalgo.practise.oopd;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * An object orientation question , to explore and make a video on this.
 *
 * https://app.codesignal.com/challenge/deMCqfKThepek7YMH
 *
 *
 */
public class GoodQuestion {

}

class Node{
    String timeStamp;
    String subtitle;
    String line;
    int lineNumber;
    Node(String line,int lineNumber){
        this.line=line;
        buildTimeStamp(line);
        this.lineNumber=lineNumber;
    }
    private void buildTimeStamp( String line){
        SimpleDateFormat sd = new SimpleDateFormat("MM:SS.xx");
        try {
            Date parse = sd.parse(line);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

//
//    public String[] toString(){
//        String arry[]= new String[4];
//        arry[0]=""+lineNumber;
//        arry[1]=//timestamp;
//                arry[2]= subtitle;
//        arry[3]="";
//    }

}

