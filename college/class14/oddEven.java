class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class oddEven{

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

    Node evenOdd(Node head){
        if(head == null){
            return null;
        }
        Node odd = head;
        Node even = head.next;
        Node evenHead = even;
        while(even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;
        return head;
    }
  
    public static void main(String[] args) {  
        oddEven l = new oddEven();

        l.insert_last(1);
        l.insert_last(2);
        l.insert_last(3);
        l.insert_last(4);
        l.insert_last(5);
        
        l.head = l.evenOdd(l.head);
        l.print(l.head);
    }
    }
