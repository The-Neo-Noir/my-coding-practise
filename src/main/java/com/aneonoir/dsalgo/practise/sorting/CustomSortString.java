package com.aneonoir.dsalgo.practise.sorting;

import java.util.LinkedHashMap;

/**
 * link: https://leetcode.com/problems/custom-sort-string/
 *
 * Turns out its a counting sort,
 *
 * Test cases:
 * "cba"
 * "abcdcba"
 * "cba"
 * "abcd"
 * ""
 * "ab"
 * "abcd"
 * "efgh"
 * "abc"
 * "abcabcaaabd"
 * "abc"
 * "abc"
 * "azq"
 * "zqfa"
 * "azp"
 * "zpa"
 *
 * Runtime: 3 ms, faster than 32.77% of Java online submissions for Custom Sort String.
 * I guess I could have improved it. IS there a better way ?
 *
 * tag: interview,sorting,custom sort, couting sort.
 *
 * related:
 *
 */
public class CustomSortString {
    public String customSortString(String S, String T) {
        StringBuffer sb= new StringBuffer();
        LinkedHashMap<Character,Integer> st= new LinkedHashMap<>();
        for(Character ch: S.toCharArray()){
            st.put(ch,0);
        }
        StringBuffer sbrest= new StringBuffer();
        for(Character ch: T.toCharArray()){
            if(st.containsKey(ch)){
                st.put(ch,st.get(ch)+1);
            }else{
                sbrest.append(ch+"");
            }
        }
        for(Character ch: st.keySet()){
            int count=st.get(ch);
            int i=0;
            while(i++<count){
                sb.append(ch+"");
            }
        }
        return sb.toString()+sbrest.toString();

    }
}
