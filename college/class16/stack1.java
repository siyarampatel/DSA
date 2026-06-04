import java.util.*;
class stack1{
    public static void main(String [] args){

        Stack <Integer> s = new Stack<>();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);

        System.out.println(s);

        System.out.println("Removed->"+s.pop());

        System.out.println("After pop"+s);

        System.out.println("Top element->"+s.peek());

        System.out.println("is stack empty->"+s.isEmpty());

        System.out.println("Size->"+s.size());

        System.out.println("Reversed");
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }

    }
}