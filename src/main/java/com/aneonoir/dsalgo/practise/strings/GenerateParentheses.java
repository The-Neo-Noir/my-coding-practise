package com.aneonoir.dsalgo.practise.strings;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * link: https://leetcode.com/problems/generate-parentheses/
 *
 * apporach: bruteforce.
 *
 * tag: medium , String, backtracking, recursion.
 *I could get this done, with the idea in my head for a long time. But eventually cracked it in around 45 mintues.
 *
 * I believe this is a brueteforce method of doing it the runtime is abymissal.
 * There has to be a better way of doing it. And that I will leave another round to learn.
 *
 * TODO: There has to be a better way of doing this. That I need to learn .
 */
public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        if(n==0) return null;
        if(n==1) return new ArrayList<String>(){{add("()");}};
        LinkedHashSet<String> inputString=new LinkedHashSet<>();
        inputString.add("()");
        List<String> list= new ArrayList<>();
        generate(inputString,n,list);
        return list;
    }
    private void generate(LinkedHashSet<String> inputStrings, int n ,List<String> list){
        LinkedHashSet<String> set= new LinkedHashSet<>();
        if(n>1){
            for(String input: inputStrings){
                set.add("()"+input);
                for(int i=1;i<input.length();i++){
                    set.add(input.substring(0,i)+"()"+ input.substring(i));
                }
                set.add(input+"()");
            }
            generate(set,n-1,list);
        }else{
            list.addAll(inputStrings);
        }
    }
}
