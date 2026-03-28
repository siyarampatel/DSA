import java.util.*;
class leet_20{
    public static boolean isValid(String s) {
        int [] a = Arrays.toString(s);
        // for(int i=0; i<a.length; i++){
        //     if(a[i]==')'||a[i]=='}'||a[i]==']'&&a[i+1]=='('||a[i+1]=='{'||a[i+1]=='['){
        //         return false;
        //     }
        // }
        // return true;
        
        

    }
    public static void main(String [] args){
        String s = ")]{";
        System.out.println(isValid(s));
    }
}