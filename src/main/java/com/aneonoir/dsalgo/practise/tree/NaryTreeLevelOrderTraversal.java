package com.aneonoir.dsalgo.practise.tree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * link: https://leetcode.com/problems/n-ary-tree-level-order-traversal/
 *
 * approach I did a level order traversal using recursion .
 *
 * struggle:   if(listL.size()>0) list.add(listL); , and forgot to put a base case.
 *
 * TODO : can you do it iteratively ?
 *
 * tag: tree, traversal , level order traversal , n-ary tree. interview
 *
 */
public class NaryTreeLevelOrderTraversal {

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list = new LinkedList<>();
        if(root!=null){
            List<Node> local = new LinkedList<>();
            local.add( root);
            list.add(Arrays.asList(root.val));
            levelOrder(local,list );
        }
        return list;
    }
    public void  levelOrder(List<Node> nodes,List<List<Integer>> list) {
        if(nodes.size()>0){
            List<Node> listLocal= new LinkedList<>();
            List<Integer> listL= new LinkedList<>();
            for(Node node: nodes){
                for(Node n: node.children){
                    listLocal.add(n);
                    listL.add(n.val);
                }
            }
            if(listL.size()>0) list.add(listL);
            levelOrder(listLocal,list);
        }
    }
}
