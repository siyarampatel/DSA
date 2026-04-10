// give count of substring who has same character in starting and in end 
import java.util.*;
class str1{
    public static void main(String [] args){
        int count=0;
        String s = "madam";
        String temp ="";
        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<=s.length(); j++){
                temp=s.substring(i,j);
               if(temp.charAt(0)==temp.charAt(temp.length()-1)&&temp.length()!=1){
                count++;
               }
               
        }
    }
    System.out.println(count);
}
}