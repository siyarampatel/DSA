class stackLinked {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node top = null;

    void push(int value){
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode; 
        System.out.println(value + "pushed into stack");
    }

    void pop(){
        if(top == null){
            System.out.println("Empty stack");
        }else{
            System.out.println(top.data+"popped from stack");
            top = top.next;
        }
    }

        void peek(){
        if(top == null){
            System.out.println("Empty stack");
        }else{
            System.out.println(top.data+"top of stack");
        }
    }

    void display(){
        if(top == null){
            System.out.println("Stack is empty");
        }
        else{
            Node temp = top;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }

        }
    }
    public static void main(String [] args){
        stackLinked s = new stackLinked();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        s.pop();
        s.peek();

    }
}