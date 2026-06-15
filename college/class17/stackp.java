import java.util.*;
class stackp{
    public static void main(String [] args){

        Stack <Character> s = new Stack<>();
        Stack <Character> t = new Stack<>();

        String str1 = "ab#c";
        String str2 = "ad#c";
        
        for(char ch: str1.toCharArray()){
            if(ch=='#'){
                s.pop();
            }else{
                s.push(ch);
            }
        }
        for(char ch: str2.toCharArray()){
            if(ch=='#'){
                t.pop();
            }else{
                t.push(ch);
            }
        }
        System.out.println(s);
        System.out.println(t);
        

        if(s.equals(t)){
            System.out.println("Stacks are equal");
        }else{
            System.out.println("Not Equal");
        }
    }
}