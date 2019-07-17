/*
package com.aneonoir.dsalgo.practise.tree;

import java.util.*;

public class SumOfLeafNodesInBST {

class Node
{
    int data;
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node root = null;
            for(int i = 0; i < n; i++)
            {
                int data = sc.nextInt();
                root = insert(root, data);
            }
            GfG gfg = new GfG();
            System.out.println(gfg.sumOfLeafNodes(root));
        }
    }


    public static Node insert(Node root, int x)
    {

        if(root == null)
        {
            return (new Node(x));
        }

        if(x < root.data)
        {
            root.left = insert(root.left, x);
        }
        else if(x >= root.data)
        {
            root.right = insert(root.right, x);
        }

        return root;
    }

}
class GfG
{
    public static int sumOfLeafNodes(Node root)
    {
        if(root == null)
            return 0;

        if(root.left == null && root.right == null)
            return root.data;

        return sumOfLeafNodes(root.left)+sumOfLeafNodes(root.right);
    }
}

}*/
