class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class segrigate{

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

    Node segrigateFunction(Node head){

        // node that starts a chain can act as a list head
        Node zeroD = new Node(-1);
        Node oneD = new Node(-1); 
        Node twoD = new Node(-1);

        Node zero = zeroD;
        Node one = oneD;
        Node two = twoD;

        Node curr = head;
        while(curr != null){
                if(curr.data == 0){
                    zero.next = curr;
                    zero = zero.next;
                }
                else if(curr.data == 1){
                    one.next = curr;
                    one = one.next;
                }
                else{
                    two.next = curr;
                    two = two.next;
                }
                curr = curr.next;
        }
        zero.next = (oneD.next != null) ? oneD.next : twoD.next;
        one.next = twoD.next;
        two.next = null;
        return zeroD.next;    
    }

    public static void main(String[] args) {

        segrigate l = new segrigate();
      
        l.insert_last(0);
        l.insert_last(1);
        l.insert_last(0);
        l.insert_last(2);
        l.insert_last(1);
        l.insert_last(0);

        l.head = l.segrigateFunction(l.head);
        l.print(l.head);

    }
    }
