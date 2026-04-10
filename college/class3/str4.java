// remove the consecutive duplicate character
import java.util.*;
class str4{
    public static void main(String [] args){
        String s = "tyyyuuughff";
        String n = "";
        n=n+s.charAt(0);
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                n=n+s.charAt(i);
            }
        }
        System.out.println(n);
        
    }
}
