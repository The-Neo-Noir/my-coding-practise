package com.aneonoir.dsalgo.practise.linkedlist;

/**
 *
 *tags: recursion,singlelist,
 *
 * approach, a recursive method call with a base condition as next==null. a counter counts the level of
 * the recursion and returns the count.
 *
 *
 * TODO:
 * 1 . Can you draw how the recursion worked in a stack
 * 2. What if the head node is null
 * 3.
 *
 */
public class FindElementSizeInAList {

    public static void main(String[] args) {
        Node node = new Node(0);
        Node node1 = new Node(1);

        Node node2 = new Node(2);
        Node node3 = new Node(3);

        node2.addNode(node3);
        node1.addNode(node2);
        node.addNode(node1);

        int i = calculateSize(node, 1);

        System.out.println(i);

        int i1 = calculateSizeNonRecursive(node);
        System.out.println(i1);

    }
//struggle:
    private static int calculateSize(Node node, int count) {
        if (node.getNextNode() == null) {
            return count;
        } else {
           return calculateSize(node.getNextNode(), count + 1);
        }
    }

    public static int calculateSizeNonRecursive(Node node){
        int count=1;
        while(node.getNextNode()!=null){
            node=node.getNextNode();
            count++;
        }
        return count;
    }

}
