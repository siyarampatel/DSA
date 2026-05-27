class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class remove_duplicate {

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

    void remove(){
        Node current = head;
        while(current != null && current.next != null){
            if(current.data == current.next.data){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }
    }

    
    public static void main(String[] args) {

        remove_duplicate l = new remove_duplicate();
        l.insert_last(10);
        l.insert_last(10);
        l.insert_last(20);
        l.insert_last(30);
        l.insert_last(40);
        l.insert_last(40);

        l.remove();
        l.print();
        
    }
}