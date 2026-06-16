import java.util.*;
class stack1{
    public static void main(String [] args){
        Stack <Integer> st = new Stack<>();
        String str = "()(())";
        st.push(0);
        for(char ch : str.toCharArray()){
            if(ch=='('){
                st.push(0);
            }
            else{
                int v = st.pop();
                int count = Math.max(2*v,1);
                st.push(st.pop()+count);
            }
        }
       System.out.print(st.pop());
    }
}