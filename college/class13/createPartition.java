class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class createPartition{

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

    Node function(Node head , int k){
        Node smallDummy = new Node(0);
        Node largerDummy = new Node(0);
        Node small = smallDummy;
        Node large = largerDummy;
        Node curr = head;
        while(curr != null){
            if(curr.data >= k){
                small.next = curr;
                small = small.next;
            }
            else{
                large.next = curr;
                large = large.next;
            }
            curr = curr.next;
        }
        large.next = null;
        small.next = largerDummy.next;
        return smallDummy.next;

    }


    public static void main(String[] args) {

        createPartition l = new createPartition();

        int k = 3;

        l.insert_last(24);
        l.insert_last(2);
        l.insert_last(1);
        l.insert_last(89);
        l.insert_last(5);

        l.print(l.function(l.head,k));



        
     
    }
}