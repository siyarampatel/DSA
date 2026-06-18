import java.util.*;
class queue3{
    public static void printComibations(int n){
         Queue <String> q = new LinkedList<>();
         q.offer("5");
         q.offer("6");
         for(int i=0; i<n; i++){
            String curr = q.poll();
            System.out.println(curr);
            q.offer(curr+"5");
            q.offer(curr+"6");
         }    
    }
    public static void main(String [] args){
       
        int n = 5;
        printComibations(n);



    }
}