package com.aneonoir.dsalgo.practise.implementation;

import java.util.Scanner;

public class JavaEndOFFile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        while (sc.hasNextLine()) {
            System.out.println(++counter + (" " + (sc.nextLine())));
        }
    }
}
