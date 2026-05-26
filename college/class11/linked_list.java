//Reversing an linked list
//mid element 
//cycle
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class linked_list{
    Node head;
    void insert_last(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
        temp=temp.next;
       }
       temp.next=newNode;
    }

    void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    void reverse(){
        Node prev = null;
        Node curr = head;
        Node next = null;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        
    }


    void middle_element(){
        if(head == null){
            return;
        }
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.print(slow.data);
    }


    void Iscycle(){
        if(head == null){
            return;
        }
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                System.out.print("Cycle detected");
                return;
            }
        }
        System.out.println("No cycle detected");
    }

    public static void main(String [] args) {
        linked_list l = new linked_list();
        l.insert_last(10);
        l.insert_last(20);
        l.insert_last(30);
        l.insert_last(40);
        l.insert_last(50);
        l.head.next.next.next.next=l.head.next;      //The algorithm does not care where the cycle begins.
                                                    //It only checks whether a cycle exists.
        l.Iscycle();

    }
}