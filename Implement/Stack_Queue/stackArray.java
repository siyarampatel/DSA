class stackArray{
        int size = 6;
        int stack [] = new int [size];
        int top = -1;

        void push(int value){
            if(top == size-1){
                System.out.println("Stack is full");
            }
            else{
                top++;
                stack[top]=value;
                System.out.println("pushed value"+value);
            }

        }

        void pop(){
            if(top==-1){
                System.out.println("The stack is empty");
            }
            else{
                System.out.println(stack[top]+"popped from stack");
                top--;
            }
        }

        void peek(){
            if(top==-1){
                System.out.println("The stack is empty");
            }
            else{
                System.out.println(stack[top]+" Top element");
            }
        }

        void display(){
            if(top==-1){
                System.out.println("The stack is empty");
            }
            for(int i=top; i>=0; i-- ){
                System.out.println(stack[i]);
            }

        }

        void isEmpty(){
            if(top==-1){
                System.out.println("Stack is empty");
            }
            else{
                System.out.println("Stack is not empty");
            }
        }
    public static void main(String [] args){
        stackArray s = new stackArray();
        s.push(10);
        s.push(20);
        s.push(40);
        s.display();
        s.pop();
        s.peek();
        s.isEmpty();
    }
}