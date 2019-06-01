package com.aneonoir.dsalgo.practise.strings;

/**
 * https://app.codesignal.com/arcade/intro/level-12/sCpwzJCyBy2tDSxKW/solutions
 */
public class MessageFromBinaryCode {
    String messageFromBinaryCode(String code) {
        StringBuffer sb= new StringBuffer();
        for(int i=0;i<code.length() ; i+=8){
            sb.append((char)Integer.parseInt(code.substring(i,i+8),2));
        }
        return sb.toString();
    }

}
