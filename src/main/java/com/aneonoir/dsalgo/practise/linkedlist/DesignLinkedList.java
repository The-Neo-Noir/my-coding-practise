package com.aneonoir.dsalgo.practise.linkedlist;

public class DesignLinkedList {
    private Node head;
    private Node tail;
    private int size = 0;

    /**
     * Initialize your data structure here.
     */
    public DesignLinkedList() {

    }

    public static void main(String[] args) {

        DesignLinkedList ds = new DesignLinkedList();
        ds.addAtHead(0);
        ds.addAtIndex(1, 4);
        ds.addAtTail(8);
        ds.addAtHead(5);
        ds.addAtIndex(4, 3);
        ds.addAtTail(0);
        ds.addAtTail(5);
        ds.addAtIndex(6, 3);
        ds.deleteAtIndex(7);
        ds.deleteAtIndex(5);
        ds.addAtTail(4);


    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        } else {
            //TODO: traverse till the index and return the value
            int count = 0;
            Node temp = head;
            while (count < index) {

                temp = temp.next;
                count++;
            }
            return temp.val;
        }
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            this.head = newNode;
            this.tail = head;
        } else {
            newNode.next = head;
            if (head == tail) {
                tail = head;
            }
            head = newNode;
        }
        size++;
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            this.head = newNode;
            this.tail = head;
        } else {
            this.tail.next = newNode;
            this.tail = this.tail.next;
        }
        size++;
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        //size, head, tail
        if (index >= 0 && index <= size) {
            if (index == 0) {
                this.addAtHead(val);
            } else if (index == size) {
                this.addAtTail(val);
            } else {
                int count = 0;
                Node temp = head;
                Node prev = temp;
                while (temp != null && count < index) {
                    prev = temp;
                    temp = temp.next;
                    count++;
                }
                Node news = new Node(val);
                news.next = prev.next;
                prev.next = news;
                size++;
            }
        }
    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        if (index >= 0 && index < size && size > 0) {
            //no element : done
            // one element : head==null, and tail==null;
            if (index == 0) {
                head = head.next;
                if (size == 1) {
                    tail = null;
                }
            } else if (index == size - 1) {
                Node temp = head;
                Node prev = temp;
                while (temp.next != null) {
                    prev = temp;
                    temp = temp.next;
                }
                this.tail = prev;
                this.tail.next = null;
                temp = null;
                prev = null;
            } else {
                int counter = 0;
                Node temp = head;
                Node prev = temp;
                while (counter < index) {
                    prev = temp;
                    temp = temp.next;
                    counter++;
                }
                prev.next = temp.next;
            }
            size--;
        }

    }

    class Node {
        private int val;
        private Node next;

        Node(int val) {
            this.val = val;
        }

        public int getVal() {
            return this.val;
        }
    }
}
