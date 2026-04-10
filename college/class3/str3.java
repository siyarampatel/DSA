// remove the given character from the string
import java.util.*;
class str3{
    public static void main(String [] args){
        String s = "banana";
        String n = "";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!='b'){
                n=n+s.charAt(i);
            }
        }
        System.out.println(n);
        
    }
}
