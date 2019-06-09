/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/


Node Insert(Node head,int data){

        if(head==null){
        head.data=data;
        head.next=null;
        }else{
        Node tempNode=head;
        while(tempNode!=null){
        if(tempNode.next==null){
        Node newNode=new Node();
        newNode.data=data;
        newNode.next=null;
        tempNode.next=newNode;
        break;
        }else{
        tempNode=tempNode.next;
        }
        }
        }
        return head;

        }
