package com.aneonoir.dsalgo.practise.strings;

import org.junit.Test;

/**
 * link: https://app.codesignal.com/arcade/code-arcade/book-market/2nSEQ8CGoddTJtnbo
 *
 *
 */
public class ProperNoun {

    @Test
    public void test() {
        String paris = properNounCorrection("Paris");
        System.out.println(paris);

    }
    public String properNounCorrection(String noun) {
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<noun.length();i++){
            if(i==0){
                if(!(noun.charAt(i) >=65 || noun.charAt(i)<=90)){ //if small
                    sb.append(""+(char)(noun.charAt(i)-32));
                }else{
                    sb.append(noun.charAt(i));
                }
            }else{
                if((noun.charAt(i) >=65 || noun.charAt(i)<=90)){ //if capital
                    sb.append("");
                }else{
                    sb.append(noun.charAt(i));
                }
            }
        }
        return sb.toString();
    }

}
