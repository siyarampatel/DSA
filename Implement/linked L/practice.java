class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }

}

class practice{
static int size=0;
static Node head; //node used as pointer for reference 

static void addFirst(int data){
    Node newNode = new Node(data);
    if(head == null){
        head = newNode;
        size++;
        return;
    }
    newNode.next = head;
    head = newNode;
    size++;
}

static void print(){
    Node current = head;
    while(current!=null){
        System.out.print(current.data + "->");
        current=current.next;
    }
    System.out.println("null");
}
static void addLast(int data){
    Node newNode = new Node(data);
    if(head == null){
        head = newNode;
        size++;
        return;
    }
    Node current = head;
    while(current.next!=null){
        current=current.next;
    }
    current.next=newNode;
    size++;

}

static void deleteLast(){
    if(head==null){
       return;
    }
    if(head.next==null){
        head=null;
        return;
    }
     Node secondlast = head;
     Node current = head.next;
     while(current.next!=null){//this loop will work till second last 
        secondlast=current;
        current=current.next;
    }
    secondlast.next=null;
    size--;

}

    public static void main(String [] args){
        addLast(10);
        addLast(20);
        addLast(30);
        addLast(40);
        addLast(40);
        print();
        deleteLast();
        print();
        System.out.print(size);
    }
}
