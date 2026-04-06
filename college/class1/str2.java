import java.util.*;
class str2{
    public static void main(String [] args){
        String str = "hello";
        String reverse = "";
        for(int i=str.length()-1; i>=0; i--){
            reverse=reverse+str.charAt(i);
        }
        System.out.print(reverse);

    }
}