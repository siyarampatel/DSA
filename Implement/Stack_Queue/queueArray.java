class queue{
    int arr[];
    int front;
    int rear;
    int size;

    queue(int size){
        this.size = size;
        arr = new int [size];
        front = 0;
        rear = -1;
    }

    void enqueue(int value){
        if(rear == size-1){
            System.out.println("Queue is full");
        }
        else{
            rear++;
            arr[rear] = value;
            System.out.println(value + "-> is inserted");
        }
    }

    void dequeue(){
        if(front>rear){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println(arr[front]+" removed");
        }
    }

    void peek(){
        if(front>rear){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println("Front->"+arr[front]);
        }
    }

    void display(){
         if(front>rear){
            System.out.println("Queue is empty");
        }
        else{
            for(int i=front; i<=rear; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }  
}


class queueArray{
    public static void main(String [] args){
        queue q = new queue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        q.display();

        q.dequeue();

        q.peek();

    }
}