package com.aneonoir.dsalgo.practise.tree;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {

        int sd[] = new int[]{3, 52, 7, 3, 23, 33};
        int asInt = Arrays.stream(sd).sorted().limit(3).max().getAsInt();
        System.out.println(asInt);
    }
}

