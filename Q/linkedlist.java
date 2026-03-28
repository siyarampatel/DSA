// CRUD Operation in linked list in java

import java.util.*;
class Node{
        int data;
        Node next;

       public Node(int data){
            this.data=data;
            this.next=null;

        }
    }

    class myLinkedList{
        Node head;

        void insertAtBeggining(int data){
            Node newNode = new Node(data);
            newNode.next=head;
            head=newNode;
        }
        void insertAtLast(int data){
            Node newNode = new Node(data);
            if(head==null){
                head=newNode;
                return;
            }
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }

        void deleteFirst(){
            if(head==null){
                System.out.println("Deleted");
                return;
            }
            head=head.next;
        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.print("NULL");
        }
    }
class linkedlist{
    public static void main(String [] args){
        myLinkedList list = new myLinkedList();
        // list.insertAtBeggining(10);
        // list.insertAtBeggining(20);
        // list.insertAtBeggining(30);
        // list.insertAtBeggining(40);

        // list.insertAtLast(10);
        // list.insertAtLast(20);
        // list.insertAtLast(30);
        // list.insertAtLast(40);
        // list.insertAtLast(50);
        // list.insertAtLast(60);
        // list.display();

        list.insertAtLast(10);
        list.insertAtLast(20);
        list.insertAtLast(30);
        list.insertAtLast(40);
        list.insertAtLast(50);
        list.insertAtLast(60);
        list.deleteFirst();
        list.display();

    }
}