package com.aneonoir.dsalgo.practise.tree;

/**
 * link: https://practice.geeksforgeeks.org/problems/convert-level-order-traversal-to-bst/1
 * <p>
 * approach : I took the approach of how a brinary tree can be representated in memory usibg array. But Got into
 * trouble a lot.
 * <p>
 * (i - 1) / 2 DON'T FUCKING WRITE i-1/2 ever  in your life again.
 * <p>
 * <p>
 * TODO: practise this a lot.
 */

public class LevelOrderToBST {

    public static void main(String[] args) {

        constructBST(new int[]{7, 4, 12, 3, 6, 8, 1, 5, 10});

    }

    public static Node constructBST(int[] arr) {
        Node[] items = new Node[arr.length];
        items[0] = new Node(arr[0]);
        // if(arr.length>=2){
        Node left = new Node(arr[1]);
        items[0].left = left;
        items[1] = left;
        //  }
        //  if(arr.length>=3){

        Node right = new Node(arr[2]);
        items[0].right = right;
        items[2] = left;
        //  }
        //   7 4 12 3 6 8 1 5 10
        for (int i = 3; i < arr.length; i++) {
            if (i % 2 != 0) {
                Node node = new Node(arr[i]);
                items[(i - 1) / 2].left = node;
                items[i] = node;
            } else {
                Node node = new Node(arr[i]);
                items[(i - 2) / 2].right = node;
                items[i] = node;
            }
        }
        return items[0];
        //Write your code here and return the root of the constructed BST
    }
}

