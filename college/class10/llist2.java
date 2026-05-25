class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class llist2{
    Node head;

    void insert_last(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
        temp=temp.next;
       }
       temp.next=newNode;
    }

    void insert_beginning(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next=head;
        head = newNode;
    }

    void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    void delete_last(){
        Node secondlast = head;
        Node current = head.next;

        while(current.next!=null){
             secondlast=current;
             current=current.next;
        }
       
        secondlast.next=null;

    }
    public static void main(String [] args){
        llist2 l = new llist2();
        l.insert_last(10);
        l.insert_last(20);
        l.insert_last(30);
        l.insert_last(40);
        l.insert_last(50);
        l.insert_beginning(67);
        l.print();
        l.delete_last();
        l.print();

    }
}