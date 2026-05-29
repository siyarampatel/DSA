class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class reorder{

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
    
    Node reverse(Node head ){
        Node prev = null;
        Node curr = head;
        Node next = null;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
        
    }


    void reorderfunction(Node head){
        if(head == null || head.next == null){
            return;
        }
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node first = head;
        Node second = reverse(slow.next);
        slow.next = null;
        while(second != null){
            Node temp1 = first.next;
            Node temp2 = second.next;
            first.next = second;
            second.next = temp1;
            first = temp1;
            second = temp2;
        }

    }

    public static void main(String[] args) {

        reorder l = new reorder();

        l.insert_last(1);
        l.insert_last(2);
        l.insert_last(3);
        l.insert_last(4);
        l.insert_last(5);

        l.reorderfunction(l.head);
        l.print(l.head);
     
    }
}