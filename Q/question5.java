//30. Valid Palindrome after removing at most one character
import java.util.*;
class question5{
    static boolean string_pal(String s){
        char[] a=s.toCharArray();
        for(int i=0; i<a.length; i++){
            if(a[i]==a[a.length-i-1]){
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an string: ");
        String s = sc.nextLine();
        System.out.println(string_pal(s));

    }
}