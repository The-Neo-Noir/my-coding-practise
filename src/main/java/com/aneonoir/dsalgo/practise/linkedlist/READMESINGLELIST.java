package com.aneonoir.dsalgo.practise.linkedlist;

/**
 * implement a singly linked list class
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * warm up questions: Warm up questions are generally datastructure questions to get
 * your basic understanding tested.
 * <p>
 * > Implement a singly linked list
 * > add,
 * add(index,object)
 * remove,
 * remove(index)
 * size
 * isEmpty
 * <p>
 * <p>
 * 1. Find middle element in the linkedlist :
 * https://practice.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/1
 * Approach 1 : Do walk to the end ,knowing the number of elements and another going half
 * {@link FindMiddleElementInAList}
 * <p>
 * Approach 2:
 * {@link FIndMiddleElementTwoPointerTechnique}
 * Two pointer technique , slow and fast pointer. Depending on the which element the even or odd when the list size if even,
 * you would like to adjust the fastpointer as
 * fast.next!=null && fast.next.next!=null or fast!=null && fast.next!=null
 * <p>
 * 2. Find the number of occurances in a list
 * approach 1: walk the list and match and count the number Iteratively
 * {@link CountOccurancesOfItemInSinglyLinkedLIst}
 * <p>
 * approach 2: walk the list recursively and match and count the number iteratively.
 * {@link  CountOccurancesOfItemInSinglyLinkedLIstRecursive}
 * <p>
 * <p>
 * 3.Function to check if a singly linked list is palindrome
 * // geeksforgeeks.org/function-to-check-if-a-singly-linked-list-is-palindrome/
 * <p>
 * Approach 1: Using Stack
 * {@link PalindormeListCheckUsingStack}
 * Approach 2: Recursion TODO
 * {@link PalindormeListCheckUsingRecursion}
 * Approach 3: By reversing the list TODO:
 * 4. Remove duplicate element from sorted Linked List
 * https://practice.geeksforgeeks.org/problems/remove-duplicate-element-from-sorted-linked-list/1
 * <p>
 * 5. Remove duplicates from unsorted linked list
 * https://www.geeksforgeeks.org/remove-duplicates-from-an-unsorted-linked-list/
 *
 *
 * <p>
 * 6. swap nodes in a linked list without swapping data
 * It turned out to be more hard, I tried, swapping nodes are freaking difficult.
 * <p>
 *
 *
 * 7.Move last element to front of a given Linked List
 * https://www.geeksforgeeks.org/move-last-element-to-front-of-a-given-linked-list/
 *
 * 8. Write a function to get the intersection point of two Linked Lists
 *    Approach : used two stack , and poped from each until they dont match
 * {@link IntersctionOfTwoLInkedList}
 * 10. Delete a given node without head  pointer
 *     geekforgeek
 *    Approach : Don't think you are going to delete a node going to work, rather , shift the elements to the left
 *      {@link DeleteNodeWithoutHead}
 *
 * 11. Segregate even and odd nodes in a Linked List
 *      method 1: create two separate lists and merge them by even then odd
 *      method 2: TODO : there is a way in geeksforgeesk must try it first
 *
 *      {@link SegregateEvenOddList}
 *
 *
 * 12: Print linked list without actually reversing it .
 *      approach: use recursion TODO:
 * 13:Find the Sum of Last N nodes of the Linked List
 *    link: https://practice.geeksforgeeks.org/problems/find-the-sum-of-last-n-nodes-of-the-linked-list/1
 *    apporach: used a stack
 *    {@link LastNNodeSum }
 *
 *  14: Linked list matrix
 *  link: https://practice.geeksforgeeks.org/problems/linked-list-matrix/1
 *   {@link LinkedListMatrix}
 *
 *
 */
public class READMESINGLELIST {

}