// an string contains numbers and characters give the maximum number of that string
// print all substring of an stirng
import java.util.*;
class str2{
    public static void main(String [] args){
        String s = "ac6hg5gf6s9";
        int max=0;
        String t = "";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)>=48 && s.charAt(i)<=57){
                t=t+s.charAt(i);
            }
        }
        for(int i=0; i<t.length(); i++){
            int digit = t.charAt(i)-'0';
            if(digit>max){
                max=digit;
            }
    }
    System.out.println(max);
    }
}
