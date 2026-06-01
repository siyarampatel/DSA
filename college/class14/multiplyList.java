class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class multiplyList{

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

    long getNumber(Node head){
        long num = 0;
        while(head != null){
            num = num*10 + head.data;
            head = head.next;
        }
        return num;
    }

    long multiply(Node head1,Node head2){
        long num1 = getNumber(head1);
        long num2 = getNumber(head2);
        return num1*num2;
    }


  
    public static void main(String[] args) {
        multiplyList l1 = new multiplyList();
        multiplyList l2 = new multiplyList();

        l1.insert_last(1);
        l1.insert_last(1);
        l1.insert_last(1);

        l2.insert_last(3);
        l2.insert_last(4);

        long ans = l1.multiply(l1.head , l2.head);

        System.out.println("Multipication->"+ans);

        

    }
    }
