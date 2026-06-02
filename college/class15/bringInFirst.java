class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class bringInFirst{

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

    void print(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    Node bring(Node head){
        Node temp =head;
        Node ttemp=head;
        Node curr = head;
        Node second = head.next;

        while(temp.next != null){
            ttemp = temp;
            temp = temp.next;
        }
        ttemp.next = curr;
        curr.next = null;
        temp.next = second;

        return temp;

    }
  
    public static void main(String[] args) {  
        
        bringInFirst l = new bringInFirst();

        l.insert_last(1);
        l.insert_last(2);
        l.insert_last(3);
        l.insert_last(4);
        l.insert_last(5);

        
         
        l.print(l.bring(l.head));
        
    }
    }
