package com.aneonoir.dsalgo.practise.tree;

/**
 * link: https://practice.geeksforgeeks.org/problems/construct-binary-tree-from-parent-array/1
 * <p>
 * approach: wrong assumption, assuming the first ever data in the array is going to the,
 * Finally solved it.
 *
 * tag: construct tree, tree, interview,
 */
public class ConstructTreeFromArray {

    public static void main(String[] args) {
        //   createTree(new int[]{-1, 0, 0, 1, 1, 3, 5}, 7);
        createTree(new int[]{1, 13, 31, 7, 17, 33, 27, 1, 5, 15, 19, 3, 33, 17, 19, 21, 23, 25, 31, 11, 29, 13, 27, 7, 25, -1, 23, 15, 3, 11, 21, 5, 9, 9}, 34);
    }

    public static Node createTree(int arr[], int n) {
        int root = 0;
        Node nodes[] = new Node[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int parent = arr[i];
            if (parent == -1) {
                root = i;
            }
            nodes[i] = new Node(i);
        }

        for (int i = 0; i < arr.length; i++) {
            int parent = arr[i];
            if (parent != -1) {
                if (nodes[parent].left == null) {
                    nodes[parent].left = nodes[i];
                } else {
                    nodes[parent].right = nodes[i];
                }
            }

        }
        return nodes[root];
    }

}
