//nth node from last
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class linkedl{
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

    void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    
   void nth_node_from_last(int n){
        if(head == null){
            return;
        }
        Node first = head;
        Node second = head;
        for(int i=0; i<n; i++){
            if(first == null){
                System.out.print("Empty");
            }
            first = first.next;
        }
        while(first != null){
            first = first.next;
            second = second.next;
        }
        System.out.print(second.data);
   }
   

    public static void main(String [] args) {
        linkedl l = new linkedl();
        l.insert_last(10);
        l.insert_last(20);
        l.insert_last(30);
        l.insert_last(40);
        l.insert_last(50);
        l.print();
        l.nth_node_from_last(2);

    }
}