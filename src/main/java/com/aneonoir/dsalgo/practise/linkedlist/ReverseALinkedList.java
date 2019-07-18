package com.aneonoir.dsalgo.practise.linkedlist;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

/**
 * link: https://www.hackerrank.com/challenges/reverse-a-linked-list/problem
 */
public class ReverseALinkedList {


    public class Solution {

        private static final Scanner scanner = new Scanner(System.in);

        public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
            while (node != null) {
                bufferedWriter.write(String.valueOf(node.data));

                node = node.next;

                if (node != null) {
                    bufferedWriter.write(sep);
                }
            }
        }

        /*
         * For your reference:
         *
         * SinglyLinkedListNode {
         *     int data;
         *     SinglyLinkedListNode next;
         * }
         *
         */
        static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
            Stack<SinglyLinkedListNode> st = new Stack<>();
            while (head != null) {
                st.push(head);
                head = head.next;
            }

            SinglyLinkedListNode result2 = new SinglyLinkedListNode(st.pop().data);
            SinglyLinkedListNode result = result2;
            while (st.size() > 0) {
                result2.next = new SinglyLinkedListNode(st.pop().data);
                result2 = result2.next;
            }
            return result;

        }

        // Complete the reverse function below.

        static class SinglyLinkedListNode {
            public int data;
            public SinglyLinkedListNode next;

            public SinglyLinkedListNode(int nodeData) {
                this.data = nodeData;
                this.next = null;
            }
        }

        static class SinglyLinkedList {
            public SinglyLinkedListNode head;
            public SinglyLinkedListNode tail;

            public SinglyLinkedList() {
                this.head = null;
                this.tail = null;
            }

            public void insertNode(int nodeData) {
                SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

                if (this.head == null) {
                    this.head = node;
                } else {
                    this.tail.next = node;
                }

                this.tail = node;
            }
        }
    }
