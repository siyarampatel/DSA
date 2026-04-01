import java.util.*;
class linkedlist1{

    private int size;
    linkedlist1(){
        this.size = 0;
    }

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;

        size++;
    }
}
Node head;


// _______________________________________________________________________________________________________________
//adding node in first 
// added node will be head and it's next will point to older head
public void addFirst(int data){
    Node newNode = new Node(data);
    if(head==null){   //check is there any node is there or not
        head=newNode;
        return;
    }
    newNode.next=head;
    head=newNode;    //add node in front it's next will be head and now it will become head itself
}


//__________________________________________________________________________________________________________________
//adding node in last

public void addLast(int data){
    Node newNode = new Node(data);
    if(head==null){
        head=newNode;
        return;
    }
    Node curNode = head;
    while(curNode.next!=null){
        curNode=curNode.next;
    }
    curNode.next=newNode;
}
// __________________________________________________________________________________________________________________
public void dislpay(){
    if(head == null){
        System.out.println("list is empty!");
        return;
    }
    Node curNode = head;
    while(curNode != null){
        System.out.print(curNode.data+"->");
        curNode=curNode.next;
    }
    System.out.println("NULL");
}
//----------------------------------------------------------------------------------------------------------------------------

public void deleteFirst(){
    if(head==null){
        System.out.println("The list is empty");
        return;
   }
   size--;
   head = head.next;
}
//----------------------------------------------------------------------------------------------------------------------------

public void deleteLast(){
    if(head==null){
        System.out.println("The list is empty!");
        return;
    }
    size--;
    if(head.next==null){
        head=null;
        return;
    }
    Node lastNode = head.next;
    Node secondlast= head;
    while(lastNode.next != null){
        lastNode=lastNode.next;
        secondlast=secondlast.next;
    }

    secondlast.next=null;
}
//----------------------------------------------------------------------------------------------------------------------------

public int getSize(){
    return size;
}


//----------------------------------------------------------------------------------------------------------------------------
    public static void main(String [] args){
        linkedlist1 list = new linkedlist1();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.dislpay();
        list.addLast(4);
        list.dislpay();
        list.deleteFirst();
        list.dislpay();
        list.deleteLast();
        list.dislpay();
        System.out.println("Size of linked list="+list.getSize());
    }
}