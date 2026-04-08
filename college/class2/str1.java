import java.util.*;
class str1{
    public static void main(String [] args){
        String str = "madam";
        for(int i=0; i<=str.length()-1; i++){
            if(str.charAt(i) == str.charAt(str.length()-1-i)){
                System.out.println("YES");
                break;
            }else{
                System.out.println("No");
                break;
            }
        }
    }
}