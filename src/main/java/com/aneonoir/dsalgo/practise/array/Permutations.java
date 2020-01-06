package com.aneonoir.dsalgo.practise.array;

/**
 * link: https://leetcode.com/problems/permutations/
 */


/**
 *
 * TODO:
 *  Q: generate permutations, of string, both iterative, and recursive.
 *  Q: generate permutations of chars[] both iterative and recursive.
 *  Q: generate permutations of int[] both iterative and recursive.
 *  Q: Generate permutations of sting u sing bitwise, iterative and recursive.
 *  Q:
 */
public class Permutations {

    public static void main(String[] args) {

        printpermutationRecursive("", "116617277");
//        printpermutationRecursiveIntArray(new int[], 0,new int []{
//            1, 2, 3});

    }

    private static void printpermutationRecursive(String pre, String post) {
        if (post.equals("")) {
            System.out.println(pre);

        } else {
            for (int i = 0; i < post.length(); i++) {
                String preLocal = pre + post.charAt(i) + "";
                String postLocal = post.substring(0, i) + post.substring(i + 1, post.length());

                printpermutationRecursive(preLocal, postLocal);
            }
        }
    }

//    private static void printpermutationRecursiveIntArray(int pre[],int preIndex,int[] post) {
//        if (post.length==0) {
//            System.out.println(pre);
//
//        } else {
//            for (int i = 0; i < post.length; i++) {
//                 int  preLocal[]= [preIndex]= post[i];
//                String postLocal = post.substring(0, i) + post.substring(i + 1, post.length());
//
//                printpermutationRecursive(pre, postLocal);
//            }
//        }
//
//    }
//    private static void printpermutationIterative(String pre, String post) {
//
//    }

}
