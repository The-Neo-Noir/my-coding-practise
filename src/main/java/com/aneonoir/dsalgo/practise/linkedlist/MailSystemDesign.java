package com.aneonoir.dsalgo.practise.linkedlist;

import java.util.Scanner;

/**
 * link: https://practice.geeksforgeeks.org/problems/mail-system-design/0
 * TODO: this is a must do
 */
public class MailSystemDesign {

    static Mail unreadMails = null;
    static Mail readMails = null;
    static Mail trashMails = null;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcaes = sc.nextInt();
        for (int i = 0; i < testcaes; i++) {
            int numberOfUnReadmails = sc.nextInt();
            int commands = sc.nextInt();
            populateUnreadMails(numberOfUnReadmails);
            for (int j = 0; j < commands; j++) {
                switch (sc.nextInt()) {
                    case 1:
                        moveUnreadToRead(sc.nextInt());
                        break;
                    case 2:
                        moveReadToTrash(sc.nextInt());
                        break;
                    case 3:
                        moveUnreadToTrash(sc.nextInt());
                        break;
                    case 4:
                        moveTrashToRead(sc.nextInt());
                        break;
                    default:
                        System.out.println("Not a valid input");
                }
            }
            while (unreadMails != null) {
                System.out.print(unreadMails.data + " ");
                unreadMails = unreadMails.next;
            }
            System.out.println();
            while (readMails != null) {
                System.out.print(readMails.data + " ");
                readMails = readMails.next;
            }
            System.out.println();

            while (trashMails != null) {
                System.out.print(trashMails.data + " ");
                trashMails = trashMails.next;
            }
        }
    }

    private static void moveTrashToRead(int i) {
        Mail element = findElement(trashMails, i);
        addToEnd(readMails, element);
        deleteElement(trashMails, element);
    }

    private static Mail findElement(Mail head, int mailId) {
        Mail mails = head, prev = head;
        while (mails != null && mails.data != mailId) {
            prev = mails;
            mails = mails.next;
        }
        return prev;
    }

    private static void moveUnreadToTrash(int i) {
        Mail element = findElement(unreadMails, i);
        addToEnd(trashMails, element);
        deleteElement(unreadMails, element);
    }

    private static void moveReadToTrash(int i) {
        Mail element = findElement(readMails, i);
        addToEnd(trashMails, element);
        deleteElement(readMails, element);
    }

    private static void moveUnreadToRead(int i) {
        Mail element = findElement(unreadMails, i);
        addToEnd(readMails, element);
        deleteElement(unreadMails, element);
    }

    private static void deleteElement(Mail unreadMails, Mail element) {
        Mail temp = unreadMails;
        if (element.next != null) {
            Mail actualelement = element.next;
            element.next = actualelement.next;
            actualelement = null;
        } else {
            unreadMails = null;
        }
    }

    private static void addToEnd(Mail headOfReadmails, Mail element) {
        Mail readmails = headOfReadmails;
        int data = element.data;
        if (element.next != null) {
            data = element.next.data;
        }
        if (readMails == null) {

            readMails = new Mail(data);
            headOfReadmails = readmails;
        } else {
            while (readMails.next != null) {
                readMails = readMails.next;
            }
            readMails.next = new Mail(data);
        }
    }

    private static void populateUnreadMails(int numberOfUnReadmails) {
        unreadMails = new Mail(1);
        for (int i = 2; i <= numberOfUnReadmails; i++) {
            Mail teamp = new Mail(i);
            unreadMails.next = teamp;
        }

    }


    static class Mail {
        int data;
        Mail next;

        public Mail(int data) {
            this.data = data;
        }
    }


}
