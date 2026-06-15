import java.util.*;
class stack2{
    public static void main(String [] args){
        Stack <Character> st = new Stack<>();
        
        String str = "Aafljsoidu";
        for(char ch: str.toCharArray()){
            if(!st.isEmpty() && Math.abs(st.peek()-ch)==32){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();

        for(char ch : st){
            sb.append(ch);
        }

        System.out.println(sb.toString());
    }
}