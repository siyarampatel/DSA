//reverse in alternate group of three 
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class reverseInGroup {

    Node head;

    void insert_last(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    void print(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    Node reverseAlternateK(Node head, int k) {

        if (head == null) {
            return null;
        }

        Node current = head;
        Node prev = null;
        Node next = null;

        int count = 0;

        // reverse first k nodes
        while (current != null && count < k) {

            next = current.next;
            current.next = prev;
            prev = current;
            current = next;

            count++;
        }

        // connect first part
        head.next = current;

        // skip next k nodes
        count = 0;

        while (count < k - 1 && current != null) {
            current = current.next;
            count++;
        }

        // recursive call
        if (current != null) {
            current.next = reverseAlternateK(current.next, k);
        }

        return prev;
    }

    public static void main(String[] args) {

        reverseInGroup l = new reverseInGroup();

        for (int i = 1; i <= 9; i++) {
            l.insert_last(i);
        }

        System.out.println("Original List:");
        l.print(l.head);

        l.head = l.reverseAlternateK(l.head, 3);

        System.out.println("After Reversing Alternate Groups:");
        l.print(l.head);
    }
}