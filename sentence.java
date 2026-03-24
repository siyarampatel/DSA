import java.util.*;
class sentence{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give an sentence:-");
        String sentence = sc.nextLine();
        
       char [] a = sentence.toCharArray();
       for(int i=0; i<a.length; i++){
        if(a[i]==a[a.length-i-1]){
            System.out.println("It's an palindrone");
        }else{
            System.out.println("Not an palindrone");
        }
       }

       for(int i=0; i<a.length; i++){
        int c=0;
        if(a[i]==' ')
        c++;
       }
       System.out.println("The number of spaces = "+c);

       for(int i=a.length-1; i>0; i--){
        System.out.print(i);
       }

       
    }
}