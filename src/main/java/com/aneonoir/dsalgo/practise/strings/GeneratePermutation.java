package com.aneonoir.dsalgo.practise.strings;

//:
// TODO:
public class GeneratePermutation {

    public static void main(String[] args) {
        String input = "abc";
        generatePerm(input);
    }

    private static String generatePerm(String input) {
        String s = "";
        for (int i = 0; i < input.length(); i++) {
            s = input.charAt(i) + "" + generatePerm(getRest(input, i));
            System.out.println(s);
        }

        return s;
    }

    private static String getRest(String input, int index) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (index != i) {
                sb.append("" + input.charAt(i));
            }
        }
        return sb.toString();
    }
}
/*
"abc";
"a"+"bc"
"a"+"cb"*/

/*
"bc",
b+"c";
c*/
