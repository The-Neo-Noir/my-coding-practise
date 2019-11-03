package com.aneonoir.dsalgo.practise.tree;

/**
 *
 * link: https://practice.geeksforgeeks.org/problems/convert-ternary-expression-to-binary-tree/1
 * TODO: could not solve it,  there is still some bug
 */
public class TerneryToBinaryTree {
    static class Node
    {
        char data;
        Node left, right;
        Node(char key)
        {
            data = key;
            left = right = null;
        }
    }
    public static void main(String[] args) {
        convertExp("a?b?c:d:e");
    }

    public static Node convertExp(String str) {

        Node root = null;
        if (str.contains("?") && str.contains(":")) {
            Holder h = parse(str);
            root = new Node(h.root.charAt(0));
            Node right = new Node(h.right.charAt(0));
            root.right = right;
            root.left = buildTree(h.left);
        }
        return root;

    }
    private static Node buildTree(String str){
        Node root=null;
        if(str.contains("?") && str.contains(":")){
            Holder h=parse(str);
            root=new Node(h.root.charAt(0));
            Node right = new Node(h.right.charAt(0));
            root.right=right;
            root.left= buildTree(h.left);
            return root;
        }else{
            return new Node(str.charAt(0));
        }
    }

    private static Holder parse(String str){
        int sp=0;
        int ep=str.length()-1;
        StringBuffer rootData= new StringBuffer();
        StringBuffer rightData= new StringBuffer();


        while(str.charAt(sp)!='?'){
            rootData.append(str.charAt(sp));
            sp++;
        }
        sp++;
        while(str.charAt(ep)!=':'){
            rightData.append(str.charAt(ep));
            ep--;
        }
        return new Holder(rootData.toString(),rightData.reverse().toString(),str.substring(sp,ep));
    }

    static class Holder{
        String root;
        String right;
        String left;
        public Holder(String root, String right, String left){
            this.root=root;
            this.right=right;
            this.left=left;
        }
    }

}
