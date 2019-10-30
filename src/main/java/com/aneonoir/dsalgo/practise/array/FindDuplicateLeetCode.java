package com.aneonoir.dsalgo.practise.array;

import java.util.ArrayList;
import java.util.List;

//TODO: 
public class FindDuplicateLeetCode {

    public static void main(String[] args) {
        int lastFromIndex = 0;
        List<String> st = new ArrayList<>();

        String s = "dis.leet.com";
        while (true) {
            int i = s.indexOf(".", lastFromIndex);
            lastFromIndex = i + 1;
            st.add(s.substring(i + 1));
            if (i == -1) {
                break;
            }
        }

        System.out.println(st);
    }
}
