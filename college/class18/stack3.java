import java.util.*;
class stack3{
    public static void main(String [] args){
        Stack <Character> st = new Stack<>();
        String str = "1432219";

        int k = 3;
        for(char digit : str.toCharArray()){
            while(!st.isEmpty() && k>0 && st.peek()>digit){
                st.pop();
                k--;
            }
            st.push(digit);
        }
        while(k-- > 0){
            st.pop();
        }
        StringBuilder sb = new StringBuilder();
        for(char ch : st){
            sb.append(ch);
        }
        System.out.print(sb);
   
    }
}
