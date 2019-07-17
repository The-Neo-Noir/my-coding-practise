package com.aneonoir.dsalgo.practise.tree;

import java.util.Scanner;

/**
 * link: https://practice.geeksforgeeks.org/explore?category%5B%5D=Binary%20Search%20Tree&page=1&sortBy=accuracy
 * <p>
 * approach 1: solved by recursion,
 * <p>
 * Struggle :  used temporary variable , which caused problem , so I removed to the solution
 * <p>
 * int minValue(Node node) {
 * if (node == null) {
 * return -1;
 * } else {
 * int min=-1;
 * if (node.left != null) {
 * minValue(node.left);
 * } else {
 * min node.data;
 * }
 * return min;
 * }
 * }
 * <p>
 * // this one worked.
 * int minValue(Node node) {
 * *         if (node == null) {
 * *             return -1;
 * *         } else {
 * *
 * *             if (node.left != null) {
 * *                return  minValue(node.left);
 * *             } else {
 * *                 return node.data;
 * *             }
 * *
 * *         }
 * *     }
 */
class Node1 {
    int data;
    Node1 left, right;

    Node1(int d) {
        data = d;
        left = right = null;
    }
}

class BinarySearchTree {


    static Node1 insert(Node1 node, int data) {
        if (node == null) {
            return (new Node1(data));
        } else {

            /* 2. Otherwise, recur down the tree */
            if (data <= node.data) {
                node.left = insert(node.left, data);
            } else {
                node.right = insert(node.right, data);
            }

            /* return the (unchanged) node pointer */
            return node;
        }

    }

    //int minValue(Node node);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            Node1 root = null;

            while (n-- > 0) {
                int data = sc.nextInt();
                root = insert(root, data);
            }

            BST gfg = new BST();

            System.out.println(gfg.minValue(root));
        }
    }
}

/*This is a function problem.You only need to complete the function given below*/
/* A binary search tree node class
class Node
{
	int data;
	Node left,right;

	Node(int d)
	{
		data = d;
		left = right = null;
	}
}
*/
// your task is to complete the below function
class BST {
    int minValue(Node1 node) {
        if (node == null) {
            return -1;
        } else {
            if (node.left != null) {
                return minValue(node.left);
            } else {
                return node.data;
            }

        }
    }
}
