package com.aneonoir.dsalgo.practise.recursion;

public class Recursive {

    public static void main(String[] args) {
        String recursive = recursive("((def))");
        System.out.println(recursive);
    }
    static String recursive(String as){
        if(as.indexOf('(')==0 && as.lastIndexOf(')')==as.length()-1){
            return new StringBuffer(as.substring(1,as.length()-1)).reverse().toString();
        }else{

            String preText=as.substring(0,as.indexOf('('));
            String postText=as.substring(as.lastIndexOf(')')+1,as.length());
            return preText+recursive(as.substring(as.indexOf('('),as.lastIndexOf(')')+1))+postText;
        }
    }
// (foo(bar(sar)))
//
//    foo(bar(baz))blim
//    bar(baz)
//    foo(barzab)blim
//    foorbazrabblim
}
