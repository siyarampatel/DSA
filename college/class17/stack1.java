import java.util.*;
class stack1{
    public static void main(String [] args){

        String [] str = {"5","2","C","D","+"};
        Stack <Integer> s = new Stack<>();

        for(String op: str){
            if(op.equals("+")){
                int a = s.pop();
                int b = s.peek();

                s.push(a);
                s.push(a+b);
            }
            else if(op.equals("D")){
                s.push(2*s.peek());
            }
            else if(op.equals("C")){
                s.pop();
            }
            else{
                s.push(Integer.parseInt(op));
            }
        }

        int sum = 0;
        while(!s.isEmpty()){
            sum+=s.pop();
        }
        System.out.println(sum);
        
    }
}