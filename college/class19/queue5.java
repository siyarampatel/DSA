import java.util.*;
class queue5{
    public static void game(Queue<String>q){
         
         int count = 0;
         while(q.size()!=1){
            for(int i=0; i<3; i++){
                q.offer(q.poll());
            }
            q.poll();   
         }
         System.out.println("Winner->"+q);
    }
    public static void main(String [] args){
       Queue<String> q = new LinkedList<>();
       int n =3; 
       q.offer("A");
       q.offer("B");
       q.offer("C");
       q.offer("D");
       q.offer("E");
       game(q);
    }
}