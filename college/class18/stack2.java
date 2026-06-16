import java.util.*;

class stack2 {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        String str = "(())(()())";

        int count = 0;
        char prev = '#';

        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                st.push(ch);
            } else {
                st.pop();

                if (prev == '(') {
                    count++;
                }
            }
            prev = ch;
        }

        System.out.println("Innermost pairs = " + count);
    }
}