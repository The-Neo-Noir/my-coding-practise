//package com.aneonoir.dsalgo.practise.linkedlist;
//
///**
// * https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list/problem
// */
//public class InsertNodeGIven {
//    import java.io .*
//            import java.math .*
//            import java.security .*
//            import java.text .*
//            import java.util .*
//            import java.util.concurrent .*
//            import java.util.regex .*
//
//    public class Solution {
//
//        private static final Scanner scanner = new Scanner(System.in);
//
//        public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
//            while (node != null) {
//                bufferedWriter.write(String.valueOf(node.data));
//
//                node = node.next;
//
//                if (node != null) {
//                    bufferedWriter.write(sep);
//                }
//            }
//        }
//
//        /*
//         * For your reference:
//         *
//         * SinglyLinkedListNode {
//         *     int data;
//         *     SinglyLinkedListNode next;
//         * }
//         *
//         */
//        static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
//
//            int currentPos = 0;
//
//            SinglyLinkedListNode prev = head;
//
//            while (head != null) {
//                if (currentPos == position - 1) {
//                    SinglyLinkedListNode node = new SinglyLinkedListNode(data);
//
//                    node.next = head.next;
//                    head.next = node;
//                    break;
//                }
//                head = head.next;
//                currentPos++;
//            }
//            return prev;
//
//        }
//
//        // Complete the insertNodeAtPosition function below.
//
//        public static void main(String[] args) throws IOException {
//            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//            SinglyLinkedList llist = new SinglyLinkedList();
//
//            int llistCount = scanner.nextInt();
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//            for (int i = 0; i < llistCount; i++) {
//                int llistItem = scanner.nextInt();
//                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//                llist.insertNode(llistItem);
//            }
//
//            int data = scanner.nextInt();
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//            int position = scanner.nextInt();
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//            SinglyLinkedListNode llist_head = insertNodeAtPosition(llist.head, data, position);
//
//            printSinglyLinkedList(llist_head, " ", bufferedWriter);
//            bufferedWriter.newLine();
//
//            bufferedWriter.close();
//
//            scanner.close();
//        }
//
//        static class SinglyLinkedListNode {
//            public int data;
//            public SinglyLinkedListNode next;
//
//            public SinglyLinkedListNode(int nodeData) {
//                this.data = nodeData;
//                this.next = null;
//            }
//        }
//
//        static class SinglyLinkedList {
//            public SinglyLinkedListNode head;
//            public SinglyLinkedListNode tail;
//
//            public SinglyLinkedList() {
//                this.head = null;
//                this.tail = null;
//            }
//
//            public void insertNode(int nodeData) {
//                SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);
//
//                if (this.head == null) {
//                    this.head = node;
//                } else {
//                    this.tail.next = node;
//                }
//
//                this.tail = node;
//            }
//        }
//    }
//
//}
