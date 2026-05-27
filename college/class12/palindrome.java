class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class palindrome {

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

    Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        Node next = null;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return  prev;
        
    }


    boolean palindrome(){
        if(head == null || head.next==null){
            return true;
        }
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node firsthalf = head;
        Node secondhalf = reverse(slow);
        while(secondhalf != null){
            if(firsthalf.data != secondhalf.data){
                return false;
            }

            firsthalf = firsthalf.next;
            secondhalf = secondhalf.next;
        }
        return true;
    }

    
    public static void main(String[] args) {

        palindrome l = new palindrome();
        l.insert_last(10);
        l.insert_last(10);
        l.insert_last(20);
        l.insert_last(10);
        l.insert_last(10);

        l.print();

        System.out.println(l.palindrome());
        
    }
}

