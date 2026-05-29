class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class reversesum{

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


    // Explanation of the Linked List Addition Code

// This code adds two numbers represented using linked lists.

// Each node contains one digit.

// The digits are stored in reverse order, meaning:

// 2 -> 4 -> 3

// represents the number:

// 342

// because:

// 2 is the ones digit
// 4 is the tens digit
// 3 is the hundreds digit
// What the code does

// The method:



Node reversesum(Node l1, Node l2)

takes two linked lists and returns a new linked list representing their sum.

The code performs digit-by-digit addition exactly like elementary-school addition.
    
    Node reversesumcombine(Node l1 , Node l2){
        Node dummy = new Node(0);
        Node temp = dummy;
        int carry = 0;
        while(l1 != null && l2 != null || carry != 0){
            int sum = carry;
        
        if(l1!=null){
            sum += l1.data;
            l1 = l1.next;

        }
        if(l2 != null){
            sum += l2.data;
            l2 = l2.next;
        }
        carry = sum/10;

        Node newNode = new Node(sum % 10);
        temp.next = newNode;
        temp = temp.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {

        reversesum l1 = new reversesum();
        reversesum l2 = new reversesum();

        l1.insert_last(2);
        l1.insert_last(3);
        l1.insert_last(4);      

        l2.insert_last(5);
        l2.insert_last(6);
        l2.insert_last(4);

        reversesum obj = new reversesum();

        Node result = obj.reversesumcombine(l1.head , l2.head);

        obj.print(result);
     
    }
}