class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class reversekgroup{

    Node head;

    void insert_last(int data) {

        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while(temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    void print() {

        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    Node reversekgroup(Node head , int k){
        Node current = head;
        Node prev = null;
        Node next = null;
        int count = 0;
        while(current != null && count<k){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }
        if(next != null){
            head.next = reversekgroup(next,k);
        }
        return prev;
    }

    
    public static void main(String[] args) {

       reversekgroup l = new reversekgroup();
        l.insert_last(10);
        l.insert_last(10);
        l.insert_last(20);
        l.insert_last(30);
        l.insert_last(40);
        l.insert_last(40);

        
        System.out.print("Original List: ");
        l.print();

        int k = 2;

        l.head = l.reversekgroup(l.head, k);

        System.out.print("Reversed in Groups: ");
        l.print();
        
    }
}