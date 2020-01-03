package com.aneonoir.dsalgo.practise.tree;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.stream.Collectors;

public class SerializeAndDeserialize {

    public static void main(String[] args) {
        TreeNode t = new TreeNode(5);
        t.left = new TreeNode(3);
        t.right = new TreeNode(6);
      /*  t.left.left = new TreeNode(2);
        t.left.right = new TreeNode(4);
        t.right.left = null;
        t.right.right = null;
        t.left.left.left = new TreeNode(1);
*/

      //  String serialize = serialize(t);


         String input = "41,37,44,24,39,42,48,1,35,38,40,null,43,46,49,0,2,30,36,null,null,null,null,null,null,45,47,null,null,null,null,null,4,29,32,null,null,null,null,null,null,3,9,26,null,31,34,null,null,7,11,25,27,null,null,33,null,6,8,10,16,null,null,null,28,null,null,5,null,null,null,null,null,15,19,null,null,null,null,12,null,18,20,null,13,17,null,null,22,null,14,null,null,21,23";

           TreeNode deserialize = deserialize(input);

      //  System.out.println(serialize);
    }

    // Encodes a tree to a single string.
    public static String serialize(TreeNode root) {
        if(root==null) return "";
        LinkedList<String> list = new LinkedList<>();
        Queue<TreeNode> objects = new LinkedList<>();

        if (root != null) {
            objects.add(root);
        } else {
            list.add(null);
        }
        while (!objects.isEmpty()) {
            TreeNode poll = objects.remove();

            if (poll == null) {
                list.add("null");
            } else {
                list.add(poll.val + "");
                objects.add(poll.left);
                objects.add(poll.right);
            }
        }
        ListIterator<String> stringListIterator = list.listIterator(list.size());
        while (stringListIterator.hasPrevious()) {
            if (stringListIterator.previous().equals("null")) {
                stringListIterator.remove();
            } else {
                break;
            }
        }
        String s = list.stream().collect(Collectors.joining(","));
        System.out.println(s);
        return s;
    }


    // Decodes your encoded data to tree.
    public static TreeNode deserialize(String data) {
        String[] nodes = data.split(",");
        TreeNode treeNodes[] = new TreeNode[nodes.length];
        for (int i = 0; i < nodes.length; i++) {
            if (nodes[i].equals("null")) {
                treeNodes[i] = null;
            } else {
                treeNodes[i] = new TreeNode(Integer.valueOf(nodes[i]));
            }
        }
        for (int i = 0; treeNodes.length > i * 2 + 1; i++) {
            if (treeNodes[i] != null) {
                if((i*2+1)<treeNodes.length){
                    treeNodes[i].left = treeNodes[i * 2 + 1];
                }else{
                    treeNodes[i].left=null;
                }
                if(i * 2 + 2 <treeNodes.length){

                treeNodes[i].right = treeNodes[i * 2 + 2];
                }else{
                    treeNodes[i].right = null;
                }
            }
        }

        return treeNodes[0];
    }

}
