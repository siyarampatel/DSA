class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class ll{

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

    Node reversBetween (Node head, int left, int right){
        if(head == null || left == right){
            return head;
        }
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;
        for(int i=1; i<left; i++){
            prev = prev.next;
        }
        Node current = prev.next;

        for(int i=0; i<right-left; i++){
            Node next = current.next;
            current.next = next.next;

            next.next = prev.next;
            prev.next = next;
        }
        return dummy.next;
    }

  
    public static void main(String[] args) {  
        ll l = new ll();

        l.insert_last(1);
        l.insert_last(2);
        l.insert_last(3);
        l.insert_last(4);
        l.insert_last(5);

        System.out.println("Original List:");
        l.print(l.head);

        l.head = l.reversBetween(l.head, 2, 4);

        System.out.println("After Reverse:");
        l.print(l.head);
        
        
    }
    }
