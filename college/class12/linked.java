class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class linked {

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

    // merge two sorted linked lists
    Node merge(Node head1, Node head2) {

        Node dummy = new Node(0);
        Node tail = dummy;

        while(head1 != null && head2 != null) {

            if(head1.data <= head2.data) {

                tail.next = head1;
                head1 = head1.next;

            } else {

                tail.next = head2;
                head2 = head2.next;
            }

            tail = tail.next;
        }

        // remaining nodes
        if(head1 != null) {
            tail.next = head1;
        }

        if(head2 != null) {
            tail.next = head2;
        }

        return dummy.next;
    }

    public static void main(String[] args) {

        linked l1 = new linked();
        linked l2 = new linked();
        linked result = new linked();

        l1.insert_last(10);
        l1.insert_last(30);
        l1.insert_last(50);

        l2.insert_last(20);
        l2.insert_last(40);
        l2.insert_last(60);

        System.out.print("List 1: ");
        l1.print(l1.head);

        System.out.print("List 2: ");
        l2.print(l2.head);

        Node mergedHead = result.merge(l1.head, l2.head);

        System.out.print("Merged List: ");
        result.print(mergedHead);
    }
}