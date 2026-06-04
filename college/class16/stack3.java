import java.util.*;
class stack3{
    public static void main(String [] args){

        Stack <Character> s = new Stack<>();

        String str = "Siyaram";

        for(char ch:str.toCharArray()){
            s.push(ch);
        }

        String rev = "";

        while(!s.isEmpty()){
            rev += s.pop();
        }

        System.out.println("Original String->"+str);
        System.out.println("Reversed String->"+rev);
   
        }
    }
