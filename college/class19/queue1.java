import java.util.*;
class queue1{
    public static void main(String [] args){
        Queue <Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println(q);

        q.remove();
        System.out.println(q);

        q.peek();
        q.offer(10);
        System.out.println(q);

        q.poll();
        System.out.println(q);

        
        System.out.println(q.element());

        //offer->add , poll->remove , element->peek  they help in error handling not let the program crash

        for(int n: q){
            System.out.println(n);
        }
    }
}