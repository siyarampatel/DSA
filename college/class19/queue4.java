import java.util.*;
class queue4{
    public static void combine(Queue<Integer>q1){
        int n = q1.size()/2;
        Queue<Integer> first = new LinkedList<>();
        for(int i=0; i<n; i++){
            first.offer(q1.poll());
        }
        while(!first.isEmpty()){
            q1.offer(first.poll());
            q1.offer(q1.poll());
        }
         
    }
    public static void main(String [] args){
       
        Queue<Integer> q1 = new LinkedList<>();

        q1.offer(1);
        q1.offer(2);
        q1.offer(3);
        q1.offer(4);
        q1.offer(5);
        q1.offer(6);
        q1.offer(7);
        q1.offer(8);

        System.out.println("Original->"+q1);
        combine(q1);

        System.out.println("Combined->"+q1);




    }
}