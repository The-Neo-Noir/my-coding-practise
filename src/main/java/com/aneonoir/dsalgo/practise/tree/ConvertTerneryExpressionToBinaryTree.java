package com.aneonoir.dsalgo.practise.tree;

import java.util.Optional;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * linK: https://practice.geeksforgeeks.org/problems/convert-ternary-expression-to-binary-tree/1
 * <p>
 * very nice questions, my strategy worked for simple cases like a?b:c or a?b?c:d:e but failed miserably at  w?l?r?b?b:m:q?b:h:c?d?a:r:z?o:w:k?k?y?h:i:d?d:q:s?c?d:x:r?j:m
 * <p>
 * tag: a must question to try for interview, tree, ternaryexpression to binary tree
 * <p>
 * I failed; As it turns out I did not know much of ternary operator, and how its evaluated, for
 * example did you know that ternary operators are evaulated from right to left ?
 */
public class ConvertTerneryExpressionToBinaryTree {


    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\W");
        String[] split = pattern.split("abhiram, is , Awesomes!");
        Optional<String> max = Stream.of(split).max((o1, o2) -> o1.length() - o2.length());
        System.out.println(max.get().length());

        Node node = convertExp("a?b:c", 0);
        Node node2 = convertExp("a?b?c:d:e", 0);
        Node node23 = convertExp("w?l?r?b?b:m:q?b:h:c?d?a:r:z?o:w:k?k?y?h:i:d?d:q:s?c?d:x:r?j:m", 0);

    }

    public static Node convertExp(String str, int i) {
        Node root = null;
        // a?b:c
        if (str.contains("?") || str.contains(":")) {
            int firstIndex = str.indexOf("?");
            String nodeData = str.substring(0, firstIndex);
            Node n = new Node(nodeData.toCharArray()[0]);

            int lastIndex = str.lastIndexOf(":");
            String rightNodeData = str.substring(lastIndex + 1);

            String toPass = str.substring(firstIndex + 1, lastIndex);
            Node left = convertExp(toPass, i + 1);

            Node right = new Node(rightNodeData.toCharArray()[0]);

            n.left = left;
            n.right = right;
            if (i == 0) {
                root = n;
            }
            return n;
        } else {
            return new Node(str.toCharArray()[0]);
        }
    }

    static class Node {
        char data;
        Node left, right;

        Node(char key) {
            data = key;
            left = right = null;
        }
    }
}
