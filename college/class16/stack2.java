import java.util.*;
class stack2{
    public static void main(String [] args){

        Stack <Integer> s = new Stack<>();
        Stack <Integer> s1 = new Stack<>();
        Stack <Integer> temp = new Stack<>();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);

        while(!s.isEmpty()){
            temp.push(s.pop());
        }

        while(!temp.isEmpty()){
            int x = temp.pop();

            s.push(x);
            s1.push(x);
        }
        System.out.println("Original Stack->"+s);
        System.out.println("Copied Stack->"+s1);
   
        }
    }
