class queue{
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node front = null;
    Node rear = null;

    void enqueue(int value){
        Node newNode = new Node(value);

        if(rear == null){
            front = rear = newNode;
        }
        else{
        rear.next = newNode;
        rear = newNode;
        }
    }

    void dequeue(){
        if(front == null){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println(front.data+" removed");
            front = front.next;
        }
        if(front == null){
            rear = null;
        }
    }
    void peek(){
         if(front == null){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println("Front element:"+front.data);
        }
    }

    boolean isEmpty(){
        return front == null;
    }

    void display(){
        if(front == null){
            System.out.println("Queue is empty");
            return;
        }
        Node temp = front;

        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}

class queueLinked{
    public static void main(String [] args){
        queue q = new queue();
         q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Queue elements:");
        q.display();

        q.dequeue();

        System.out.println("After dequeue:");
        q.display();

        q.peek();

        System.out.println("Is Queue empty? " + q.isEmpty());
    }
}